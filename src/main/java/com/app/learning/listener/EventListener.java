package com.app.learning.listener;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.session.SessionCreationEvent;
import org.springframework.security.core.session.SessionDestroyedEvent;

public class EventListener implements ApplicationListener<ApplicationEvent> {

	private static final Logger LOGGER = Logger.getLogger(EventListener.class);

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof SessionCreationEvent) {
			LOGGER.info("Session created");
		}
		if (event instanceof SessionDestroyedEvent) {
			LOGGER.info("Session destroyed");
		}
	}

}
