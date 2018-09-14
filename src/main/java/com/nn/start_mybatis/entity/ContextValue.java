package com.nn.start_mybatis.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app" )
public class ContextValue {

    private int pageSet;

    private String name;

    public int getPageSet() {
        return pageSet;
    }

    public String getName() {
        return name;
    }

    public void setPageSet(int pageSet) {
        this.pageSet = pageSet;
    }

    public void setName(String name) {
        this.name = name;
    }
}
