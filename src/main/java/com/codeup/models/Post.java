package com.codeup.models;

import java.security.PublicKey;

public class Post {
    private String title;
    private String body;
    private Long id;


    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}