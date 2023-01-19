//package com.example.sample.config;
//
//import org.apache.catalina.connector.Connector;
//import org.apache.coyote.ajp.AbstractAjpProtocol;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ContainerConfig {
//    @Value("${tomcat.ajp.protocol}")
//    String ajpProtocol;
//
//    @Value("${tomcat.ajp.port}")
//    int ajpPort;
//
//    @Bean
//    public ServletWebServerFactory servletContainer() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createAjpConnector());
//        return tomcat;
//    }
//
//    private Connector createAjpConnector() {
//        Connector ajpConnector = new Connector("AJP/1.3");
//        ajpConnector.setPort(8009);
//        ajpConnector.setSecure(false);
//        ajpConnector.setAllowTrace(false);
//        ajpConnector.setScheme("http");
//        ajpConnector.setProperty("address","0.0.0.0");
//        ajpConnector.setProperty("allowedRequestAttributesPattern",".*");
//        ((AbstractAjpProtocol<?>) ajpConnector.getProtocolHandler()).setSecretRequired(false);
//        return ajpConnector;
//    }
//
//
//}
