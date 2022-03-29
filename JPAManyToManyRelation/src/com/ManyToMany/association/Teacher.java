package com.ManyToMany.association;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	@Id
	   @GeneratedValue( strategy = GenerationType.AUTO )
	   private int tid;
	   private String tname;
	   private String subject;

	   @ManyToMany(targetEntity = Class.class)
	   private Set classSet;

	   public Teacher(){
	      super();
	   }
	   
	   public Teacher(int tid, String tname, String subject, Set classSet) {
	      super();
	      this.tid = tid;
	      this.tname = tname;
	      this.subject = subject;
	      this.classSet = classSet;
	   }
	   
	   public int getTid() {
	      return tid;
	   }
	   
	   public void setTid(int tid) {
	      this.tid = tid;
	   }
	   
	   public String getTname() {
	      return tname;
	   }
	   
	   public void setTname(String tname) {
	      this.tname = tname;
	   }
	   
	   public String getSubject() {
	      return subject;
	   }
	   
	   public void setSubject(String subject) {
	      this.subject = subject;
	   }
	   
	   public Set getClasSet() {
	      return classSet;
	   }
	   
	   public void setClasSet(Set clasSet) {
	      this.classSet = clasSet;
	   }
}
