/**
 * 
 */
package com.sudhir.library.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sudhir.library.services.BookService;



/**
 * @author sudhirk
 *
 */
@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/book/searchbytitle")
	public String getBooksByTitle(@RequestParam("title") String title, @RequestParam("nor") String nor){
		return bookService.getBookByTitle(title,nor);
	}
	
	
	  @RequestMapping(method = RequestMethod.GET,value = "/book/searchbytitle1")
	  public String defualt11() { return "default"; }
	 
}
