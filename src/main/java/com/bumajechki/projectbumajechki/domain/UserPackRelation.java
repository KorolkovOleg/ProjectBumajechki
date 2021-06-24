package com.bumajechki.projectbumajechki.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class UserPackRelation {

    private UserPackRelationId pk;
    private boolean EditingRight;

    @EmbeddedId
    public UserPackRelationId getPk() {
        return pk;
    }

    public void setPk(UserPackRelationId pk) {
        this.pk = pk;
    }

    public boolean isEditingRight() {
        return EditingRight;
    }

    public void setEditingRight(boolean editingRight) {
        EditingRight = editingRight;
    }
}
