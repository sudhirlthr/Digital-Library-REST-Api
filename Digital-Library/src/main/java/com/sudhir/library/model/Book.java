/**
 * 
 */
package com.sudhir.library.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sudhirk
 *
 */
public class Book {
	List<String> key = new ArrayList<>();

	public List<String> getKey() {
		return key;
	}

	public void setKey(List<String> key) {
		this.key = key;
	}

	public Book(List<String> key) {
		this.key = key;
	}
	
}
