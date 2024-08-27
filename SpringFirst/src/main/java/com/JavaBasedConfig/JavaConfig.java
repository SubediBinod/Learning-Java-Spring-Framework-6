package com.JavaBasedConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean(name = "com1")
    @Primary
    Rhino rhino1(@Qualifier("danfe1") Danfe d) {
        Rhino rhino = new Rhino();
        rhino.setD(d); // Inject Danfe bean using Qualifier
        rhino.setWeight(150);
        return rhino;
    }

    @Bean(name = "com2")
    Rhino rhino2(@Qualifier("danfe2") Danfe d) {
        Rhino rhino = new Rhino();
        rhino.setD(d); // Inject Danfe bean using Qualifier
        rhino.setWeight(200);
        return rhino;
    }

    @Bean(name = "danfe1")
    @Primary
    Danfe danfe1() {
        Danfe d = new Danfe();
        d.setColor("Blue");
        d.setWeight(10);
        return d;
    }

    @Bean(name = "danfe2")
    Danfe danfe2() {
        Danfe d = new Danfe();
        d.setColor("Red");
        d.setWeight(15);
        return d;
    }
}
