package br.com.caelum.microblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tweet {

	@Id 
	@GeneratedValue
	private int id;
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

}
