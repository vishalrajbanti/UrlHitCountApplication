package com.geekster.UrlHitCount.Service;

import com.geekster.UrlHitCount.Entity.UrlHit;
import com.geekster.UrlHitCount.Repo.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {
    @Autowired
    UrlHitRepo urlHitRepo;

public List<UrlHit> getAllUrlHits(){
    return urlHitRepo.getUrlMap();
}

    public String addUrl(UrlHit urlHit) {
       getAllUrlHits().add(urlHit);
       return "added";
    }

    public String getVisitors() {
        return "visitors : " + getAllUrlHits().size();
    }

    public String urlHitCount(String name) {
    for(UrlHit urlHit : getAllUrlHits()){
        if(urlHit.getUserName().equals(name)){
           int i= urlHit.getCount()+1;
            urlHit.setCount(i);
            return "uesrname: " + name  + "           " + " hitcount :"+ i;
        }
    }
    return "username doesnot exist";
    }
}
