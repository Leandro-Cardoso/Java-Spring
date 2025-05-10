package com.leandrocardoso.spring.Posts;

import com.leandrocardoso.spring.Users.UserModel;

// JPA:
import jakarta.persistence.*;

// Lombok:
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "author_id") // Foreing Key
    private UserModel author;

    private String title;

    private String text;

}
