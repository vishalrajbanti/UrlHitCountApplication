package com.geekster.UrlHitCount.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrlHit {
    private String userName;
    private Integer count;

    public void setCount(int i) {
        count=i;
    }
}
