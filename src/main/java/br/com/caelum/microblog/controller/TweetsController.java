package br.com.caelum.microblog.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import br.com.caelum.microblog.model.SessionCreator;
import br.com.caelum.microblog.model.Tweet;
import br.com.caelum.microblog.model.TweetDAO;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class TweetsController {

	private TweetDAO tweetDAO;
	private Result result;
	
	public TweetsController(TweetDAO tweetDAO, Result result) {
		this.tweetDAO = tweetDAO;
		this.result = result;
	}
	
	public void adiciona(Tweet tweet) {
		tweetDAO.adiciona(tweet);
		result.redirectTo(this).lista();
	}
	
	public List<Tweet> lista() {
		System.out.println("tweeeeet");
		
		return tweetDAO.listaTodos();
	}
	
	public void form() {}
}
