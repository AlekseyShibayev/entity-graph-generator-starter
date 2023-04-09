package com.company.app.exchangerate;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = "com.company.app.exchangerate.component", lazyInit = true)
public class SpringBootTestContextBootstrapperStopper {
}
