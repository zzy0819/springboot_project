package com.example.zzy;

import com.example.zzy.pojo.Blog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;


@SpringBootApplication
public class SpringStudyApplication {
;

    public static void main(String[] args) {
        SpringApplication.run(SpringStudyApplication.class, args);
        Blog b = new Blog();

    }

    @Bean
    public ViewResolver myViewResovler(){
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
return null;

        }
    }

}
