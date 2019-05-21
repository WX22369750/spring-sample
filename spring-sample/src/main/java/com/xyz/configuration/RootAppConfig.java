package com.xyz.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WebMvcConfig.class)
public class RootAppConfig {

}
