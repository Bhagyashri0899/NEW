package com.oneToOne.association;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EntityB {
	 @Id
	    @GeneratedValue
	    private int myIdB;
	    private String stringB;

	    public String getStringB() {
	        return stringB;
	    }

	    public void setStringB(String stringB) {
	        this.stringB = stringB;
	    }
}
