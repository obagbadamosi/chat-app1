package com.example.application;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.vaadin.artur.helpers.LaunchUtil;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@Theme(value = "myapp")
@PWA(name = "My App", shortName = "My App", offlineResources = {"images/logo.png"})
@Push
@NpmPackage(value = "line-awesome", version = "1.3.0")
public class ChatApplication extends SpringBootServletInitializer implements AppShellConfigurator {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6261671495577893050L;

	public static void main(String[] args) {
        LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(ChatApplication.class, args));
    }

}
