package com.bumajechki.projectbumajechki.security;

import com.bumajechki.projectbumajechki.domain.User;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Authority implements GrantedAuthority{

    private static final long serialVersionUID = 5616799708597833787L;
    private Long id;
    private String authority;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
