package com.company.app.springboot;

import com.company.app.StarterConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.context.TestPropertySource;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootTest(
        classes = StarterConfiguration.class
)
@ExtendWith(OutputCaptureExtension.class)
@TestPropertySource("/test.properties")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class SpringBootTestApplicationContext {

    @PostConstruct
    void init() {
        log.debug("**********     запущена группа тестов всего приложения     **********");
    }

}