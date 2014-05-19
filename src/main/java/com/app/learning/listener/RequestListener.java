package com.app.learning.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextListener;

@WebListener
public class RequestListener extends RequestContextListener {
	private static final Logger LOGGER = Logger.getLogger(RequestListener.class);

	@Override
	public void requestDestroyed(ServletRequestEvent requestEvent) {
		super.requestDestroyed(requestEvent);
		LOGGER.info("Request is destroyed by container");
	}

	@Override
	public void requestInitialized(ServletRequestEvent requestEvent) {
		super.requestInitialized(requestEvent);
		LOGGER.info("Request is initialized by container");
	}
}
