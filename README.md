https://github.com/ThiagoWill19/TechInfo# TechInfo

**Aplicação MVC de consumo da API News API**

Esta é uma aplicação MVC (Model-View-Controller) desenvolvida em Java/Spring que consome a API News API para apresentar
notícias de diferentes países. Com esta aplicação, os usuários podem visualizar notícias de diversas categorias, como
tercnologia, ciência e negócios, filtrando por país.

## **Tecnologias utilizadas:**
- Java
- Spring Starter Web
- Devtools
- Thymeleaf
- HTML/CSS

### **Arquitetura:** MVC

 ## **Instalação e configuração**
1. Clone o repositório para sua maquina local:

	- `git clone https://github.com/ThiagoWill19/TechInfo.git`
	
2. Configure a API News API:

	- Acesse o site [News API](https://newsapi.org/)
	 
	- Obtenha sua chave de API (API Key) gratuita.
	
3. Crie o arquivo **application.properties** em `/src/main/resources`
> *Essa pasta foi ocultada neste projeto para guardar a apykey*

4. Adicione esta linha no **application.properties**: `news.api.key=sua_apikey`

5. Execute a aplicação 🚀

## Utilização

1. Acesse a página da aplicação em seu navegador: `http://localhost:8080/noticias`
> Por padrão a página inicial apresenta notícias de technologia do Brasil.

2. Selecione uma das categorias, Tecnologia, ciência ou negócios.

3. Selecione o país desejado.

4. Clique no botão de busca.

5. As notícias serão exibidas na página, apresentando informações como data da publicação, título, autor e fonte.
Você pode clicar em cada notícia para ser redirecionádo para o site fonte. cada requisição retorna no máximo 100 títulos.

6. Você pode realizar novas buscas selecionando diferentes categorias e países.
	