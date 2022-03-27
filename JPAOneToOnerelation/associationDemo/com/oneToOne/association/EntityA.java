package com.oneToOne.association;

import javax.persistence.*;

@Entity
public class EntityA {
	@Id
    @GeneratedValue
    private int myIdA;
	 @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "MY_JOIN_COLUMN")
    private EntityB entityB;

    public EntityB getEntityB() {
        return entityB;
    }

    public void setEntityB(EntityB entityB) {
        this.entityB = entityB;
    }
}
