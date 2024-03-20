package ru.denis.blog.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String text;
    private String imageUrl;
    private List<String> tags = new ArrayList<>();
    private User user;

    public Post() {

    }

    public Post(String title, String text, String imageUrl, List<String> tags, User user) {
        this.title = title;
        this.text = text;
        this.imageUrl = imageUrl;
        this.tags = tags;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }
}
