package com.will.techinfo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.will.techinfo.services.NewsService;

@Controller
@RequestMapping("/noticias")
public class NewsController {

	
	@Autowired
	private NewsService newsService;
	
	@GetMapping()
	public ModelAndView findDefaultNews() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("newsList", newsService.getNews("br","technology"));
		return mv;
	}
	
	@PostMapping()
	public ModelAndView findByCountryCode(String countryCode, String category) {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("newsList", newsService.getNews(countryCode, category));
		mv.addObject("code",countryCode);
		mv.addObject("cat",category);
		return mv;
	}

}
