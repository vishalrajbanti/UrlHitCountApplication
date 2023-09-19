package com.geekster.UrlHitCount.Controller;

import com.geekster.UrlHitCount.Entity.UrlHit;
import com.geekster.UrlHitCount.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;

    // add a url
    @PostMapping("url")
    public String addUrl(@RequestBody UrlHit urlHit){
        return urlHitService.addUrl(urlHit);
    }

    // get the no. of visitors
@GetMapping("visitors")
    public String getVisitors(){
        return urlHitService.getVisitors();
    }

    // get visitor with name and its hitcount
@GetMapping("api/v1/visitor-count-app/username/{name}/count")
    public String userHitCount(@PathVariable String name){
        return urlHitService.urlHitCount(name);
    }
}
