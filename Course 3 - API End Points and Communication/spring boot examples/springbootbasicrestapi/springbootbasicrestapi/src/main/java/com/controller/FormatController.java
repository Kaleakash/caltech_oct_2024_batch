package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController       // @Controller + @ReponseBody 
public class FormatController {

	// http://localhost:8080/text
	
	@RequestMapping(value = "text",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<h2>Welcome to rest api<h2>";
	}
	
	// http://localhost:8080/html
		@RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
		public String sayHtml() {
			return "<h2>Welcome to rest api</h2>";
		}

		// http://localhost:8080/xml
			@RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
			public String sayXML() {
				return "<abc>Welcome to rest api</abc>";
			}
}
