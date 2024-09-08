package com.binod.WebApp;

/**
 * Hello world!
 *
 */
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8090);

        Context context = tomcat.addContext("", null);

        Tomcat.addServlet(context, "MyServlet", new MyServlet());
        context.addServletMappingDecoded("/s1", "MyServlet");

        tomcat.start();
        System.out.println("Tomcat started successfully.");
        tomcat.getServer().await();
    }
}
