package com.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        // Using the @Primary bean for Rhino
        Rhino rhino1 = context.getBean("com1", Rhino.class);
        rhino1.whoAmI(); // Uses danfe1, which is @Primary
        System.out.println("Rhino1 weight: " + rhino1.getWeight());

        // Using @Qualifier to specify which Danfe to use
        Rhino rhino2 = context.getBean("com2", Rhino.class);
        rhino2.whoAmI(); // Uses danfe2, specified by @Qualifier
        System.out.println("Rhino2 weight: " + rhino2.getWeight());

        // Accessing Danfe beans directly
        Danfe danfe1 = context.getBean("danfe1", Danfe.class);
        danfe1.whoAmI();
        System.out.println("Danfe1 color: " + danfe1.getColor());
        System.out.println("Danfe1 weight: " + danfe1.getWeight());

        Danfe danfe2 = context.getBean("danfe2", Danfe.class);
        danfe2.whoAmI();
        System.out.println("Danfe2 color: " + danfe2.getColor());
        System.out.println("Danfe2 weight: " + danfe2.getWeight());
    }
}
