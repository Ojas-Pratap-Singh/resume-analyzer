package com.example.demo.Model;

import com.example.demo.Enum.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String firstName;

    @Column(nullable = false)
    String lastName;

    @Column(nullable = false, unique = true)
    long mobileNo;

    @Column(nullable = false, unique = true)
    String emailId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    UserRole userRole;

}
