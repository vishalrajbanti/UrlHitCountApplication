package com.geekster.UrlHitCount.Repo;

import com.geekster.UrlHitCount.Entity.UrlHit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSource {
    @Bean
    public List<UrlHit> getUrlSource(){
        return new ArrayList<>();
    }
}
