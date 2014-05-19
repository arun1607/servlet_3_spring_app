package com.app.learning.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@WebListener
public class MySessionListener implements HttpSessionListener, ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub

	}

	private static final Logger LOGGER = Logger.getLogger(MySessionListener.class);

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		LOGGER.info("New user logged in system.");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		LOGGER.info("New user left in system.");
	}

}
