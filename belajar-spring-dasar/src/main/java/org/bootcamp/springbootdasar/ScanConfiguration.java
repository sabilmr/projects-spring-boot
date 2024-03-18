package org.bootcamp.springbootdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "org.bootcamp.springbootdasar.configuration"
})
// artinya nanti si ScanConfiguration ini setelah diload  di akan nyari di package yng di anotasi ComponentScan
public class ScanConfiguration {

}
