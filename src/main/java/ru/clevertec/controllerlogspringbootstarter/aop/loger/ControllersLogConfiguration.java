package ru.clevertec.controllerlogspringbootstarter.aop.loger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllersLogConfiguration {

    @Bean
    public ControllersLogAspect controllersLogAspect() {
        return new ControllersLogAspect();
    }
}
