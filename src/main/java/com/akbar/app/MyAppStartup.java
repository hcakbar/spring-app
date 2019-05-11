package com.akbar.app;

import org.apache.struts.action.ActionServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
public class MyAppStartup {

    public static void main(String... args) {
        SpringApplication.run(MyAppStartup.class, args);
    }

    @Bean
    public ServletRegistrationBean strutsActionServlet() {
        ActionServlet actionServlet = new ActionServlet();
        ServletRegistrationBean<ActionServlet> actionServletServletRegistrationBean = new ServletRegistrationBean<>(actionServlet, "*.do");
        actionServletServletRegistrationBean.setName("action");
        actionServletServletRegistrationBean.addInitParameter("config", "/WEB-INF/struts-config.xml");
        return actionServletServletRegistrationBean;
    }

    //To handle IllegalStateException caused by struts-config.xml resource is not an existing directory
    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>() {
            @Override
            public void customize(ConfigurableServletWebServerFactory factory) {
                factory.setDocumentRoot(new File("/Users/chowdhak/akbar/my-projects/spring-app/src/main/resources"));
            }
        };
    }

}
