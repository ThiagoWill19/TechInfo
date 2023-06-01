package com.will.techinfo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.will.techinfo.models.News;
import com.will.techinfo.models.NewsResponse;

@Service
public class NewsService {

	@Value("${news.api.key}")
	private String apiKey;

	public List<News> getNews(String countryCode, String category) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<NewsResponse> responseEntity = restTemplate.exchange(
				"https://newsapi.org/v2/top-headlines?country=" + countryCode + "&category=" + category 
				+ "&pagesize=100&apikey=" + apiKey,
				HttpMethod.GET, null, NewsResponse.class);

		List<News> newsList =  responseEntity.getBody().getArticles();
		
		for(News n : newsList) {
			
			n.setPublishedAt(dateFormat(n.getPublishedAt()));
		}
		
		return newsList;

	}
	
	
	private String dateFormat(String original) {
		 
		String[] format1 = original.split("T");
		String date = format1[0];
		String time = format1[1];
		
		String[] finalDate = date.split("-");
		String[] finalTime = time.split(":");
		
		return finalDate[2] + "/" + finalDate[1] + "/" + finalDate[0] + " " + finalTime[0] + ":" + finalTime[1];
		
	}

}
 