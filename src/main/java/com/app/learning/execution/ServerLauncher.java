package com.app.learning.execution;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.naming.resources.VirtualDirContext;

public class ServerLauncher {
	public static void main(final String[] args) throws ServletException, LifecycleException {
		String webappDirLocation = "src/main/webapp/";
		Tomcat tomcat = new Tomcat();
		String userHome = System.getProperty("user.home");

		String keyStorePath = new File(userHome, "ssl_cert/keystore.jks").getAbsolutePath();

		// The port that we should run on can be set into an environment
		// variable
		// Look for that variable and default to 8080 if it isn't there.
		String webPort = System.getenv("PORT");
		if (webPort == null || webPort.isEmpty()) {
			webPort = "8084";
		}

		tomcat.setPort(Integer.valueOf(webPort));

		Context context = tomcat.addWebapp("/app", new File(webappDirLocation).getAbsolutePath());
		System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());
		File additionWebInfClasses = new File("target/classes");
		VirtualDirContext resources = new VirtualDirContext();
		resources.setExtraResourcePaths("/WEB-INF/classes=" + additionWebInfClasses);
		context.setResources(resources);
		Connector httpsConnector = new Connector();
		httpsConnector.setPort(8443);
		httpsConnector.setSecure(true);
		httpsConnector.setScheme("https");
		httpsConnector.setAttribute("keyAlias", "myapp");
		httpsConnector.setAttribute("keystorePass", "app123");
		httpsConnector.setAttribute("keystoreFile", keyStorePath);
		httpsConnector.setAttribute("clientAuth", "false");
		httpsConnector.setAttribute("sslProtocol", "TLS");
		httpsConnector.setAttribute("SSLEnabled", true);
		Service service = tomcat.getService();
		service.addConnector(httpsConnector);

		tomcat.start();
		tomcat.getServer().await();
	}
}
