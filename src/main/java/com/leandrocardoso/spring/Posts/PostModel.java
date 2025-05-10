package com.leandrocardoso.spring.Posts;

import com.leandrocardoso.spring.Users.UserModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_posts")
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "author_id") // Foreing Key
    private UserModel author;
    private String title;
    private String text;

    public PostModel(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

}
