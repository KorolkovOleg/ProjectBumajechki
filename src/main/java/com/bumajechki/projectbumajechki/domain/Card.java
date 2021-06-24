package com.bumajechki.projectbumajechki.domain;

import javax.persistence.*;

@Entity
public class Card {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Pack pack;
    private String frontSideText;
    private String backSideText;

    @ManyToOne
    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrontSideText() {
        return frontSideText;
    }

    public void setFrontSideText(String frontSide) {
        this.frontSideText = frontSide;
    }

    public String getBackSideText() {
        return backSideText;
    }

    public void setBackSideText(String backSide) {
        this.backSideText = backSide;
    }
}
