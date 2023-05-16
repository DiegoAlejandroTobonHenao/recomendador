package com.usco.testspring.domain;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "users")
public class User {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column(nullable = false, unique = true)
    private String userDocument;

    @Column(nullable = false, unique = true)
    private String userName;


    @Column(nullable = true)
    private String role;

    @Column(nullable = false)
    private String cellphone;
}
