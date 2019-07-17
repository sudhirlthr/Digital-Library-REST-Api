/**
 * 
 */
package com.sudhir.library.services;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author sudhirk
 *
 */
@Service
public class BookService {
	
	
	
	public String getBookByTitle(String title, String nor){
		RestTemplate restTemplate = new RestTemplate();
		//String url = "http://openlibrary.org/query.json?type=/type/edition&title=Introduction to Algorithms";
		String url = "https://www.googleapis.com/books/v1/volumes?q=";
		String object = restTemplate.getForObject(url+title+"&maxResults="+nor, String.class);
		JSONArray objectArray = new JSONObject(object).getJSONArray("items");
		ArrayList<String> bookList = new ArrayList<>();
		JSONArray jsonArrayforResponse = new JSONArray();
		for(int i=0;i<objectArray.length();i++) {
			JSONObject objectVolumeInfo = objectArray.getJSONObject(i).getJSONObject("volumeInfo");
			title = objectVolumeInfo.getString("title");
			String publisgerObject = objectVolumeInfo.getString("publisher");
			String previewLink = objectVolumeInfo.getString("previewLink");
			String ReaderLink = objectArray.getJSONObject(i).getJSONObject("accessInfo").getString("webReaderLink");
			//bookList.add(previewLink.toString());
			JSONObject resultJson = new JSONObject();
			resultJson.put("Title", title);
			resultJson.put("Publisher", publisgerObject);
			//resultJson.put("PreviewLink", previewLink);
			resultJson.put("ReaderLink", ReaderLink);
			jsonArrayforResponse.put(resultJson);
		}
		JSONObject responseObject = new JSONObject();
		responseObject.put("books", jsonArrayforResponse);
		
		return responseObject.toString();
	}
}
