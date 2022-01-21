package com.nimesia.sweetvillas.config;

import com.nimesia.sweetvillas.interceptors.MainInterceptor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Bean
    public PasswordEncoder encoder() { return new BCryptPasswordEncoder(); }

}