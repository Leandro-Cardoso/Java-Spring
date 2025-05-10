package com.leandrocardoso.spring.Users;

import com.leandrocardoso.spring.Posts.PostModel;

// JPA:
import jakarta.persistence.*;

// Lombok:
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String bio;

    @OneToMany(mappedBy = "author")
    private List<PostModel> posts;

}
