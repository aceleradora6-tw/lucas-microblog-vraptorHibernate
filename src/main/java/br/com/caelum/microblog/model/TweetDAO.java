package br.com.caelum.microblog.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class TweetDAO {

	private Session session;

	public TweetDAO(SessionCreator session) {
		this.session = session.getInstance();
	}
	
	public List<Tweet> listaTodos() {
		return session.createCriteria(Tweet.class).list();
	}

	public void adiciona(Tweet tweet) {

		Transaction tx = session.beginTransaction();
		session.save(tweet);
		tx.commit();
	}
}
