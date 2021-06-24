package com.bumajechki.projectbumajechki.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pack implements Serializable {

    private static final long serialVersionUID = 3525820245943152866L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
