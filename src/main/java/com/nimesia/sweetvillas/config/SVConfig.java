package com.nimesia.sweetvillas.config;

import com.nimesia.sweetvillas.interceptors.MainInterceptor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

@EnableWebMvc
@Configuration
public class SVConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(new MainInterceptor());
    };


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    };

}