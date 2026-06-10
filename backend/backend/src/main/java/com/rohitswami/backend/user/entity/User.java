package com.rohitswami.backend.user.entity;
import com.rohitswami.backend.common.entity.BaseEntity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Role role;

}