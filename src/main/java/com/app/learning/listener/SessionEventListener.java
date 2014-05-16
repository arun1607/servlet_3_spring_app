package com.app.learning.listener;

import javax.servlet.annotation.WebListener;

import org.springframework.security.web.session.HttpSessionEventPublisher;

@WebListener
public class SessionEventListener extends HttpSessionEventPublisher {

}
