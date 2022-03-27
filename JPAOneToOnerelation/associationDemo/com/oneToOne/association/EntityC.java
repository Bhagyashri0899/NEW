package com.oneToOne.association;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EntityC {
	 @Id
	  @GeneratedValue
	  private int myIdC;
	  @OneToOne(cascade = CascadeType.PERSIST)
	  private EntityD entityD;

	  public EntityD getEntityD() {
	      return entityD;
	  }

	  public void setEntityD(EntityD entityD) {
	      this.entityD = entityD;
	  }
	}

