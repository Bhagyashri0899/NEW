package com.oneToOne.association;

import javax.persistence.*;

@Entity
public class EntityD {
	@Id
	  @GeneratedValue
	  private int myIdD;
	  private String stringD;

	  public String getStringD() {
	      return stringD;
	  }

	  public void setStringD(String stringD) {
	      this.stringD = stringD;
	  }
}
