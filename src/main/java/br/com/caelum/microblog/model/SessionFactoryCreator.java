package br.com.caelum.microblog.model;
import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
@ApplicationScoped
public class SessionFactoryCreator implements ComponentFactory<SessionFactory>{

	private SessionFactory sessionFactory;

	@PostConstruct
	public void create() {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	public void destroy() {
		sessionFactory.close();
	}
	
	@Override
	public SessionFactory getInstance() {
		return sessionFactory;
	}

}
