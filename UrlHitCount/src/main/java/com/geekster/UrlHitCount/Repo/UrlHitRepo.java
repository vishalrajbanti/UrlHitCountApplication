package com.geekster.UrlHitCount.Repo;

import com.geekster.UrlHitCount.Entity.UrlHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlHitRepo {

    @Autowired
    private List<UrlHit> UrlMap;

    public List<UrlHit> getUrlMap() {
        return UrlMap;
    }
}
