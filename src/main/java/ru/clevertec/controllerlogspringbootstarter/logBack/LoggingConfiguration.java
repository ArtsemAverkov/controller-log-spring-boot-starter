package ru.clevertec.controllerlogspringbootstarter.logBack;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LoggerContext.class)
public class LoggingConfiguration {

    @PostConstruct
    public void configureLogging() {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(loggerContext);
        loggerContext.reset();
    }
}
