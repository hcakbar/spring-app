package com.akbar.app;

import org.apache.struts.action.ActionServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

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


}
