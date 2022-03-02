package com.softwaretestinghelp;

public class EqualsDemoSample {
	private String objName = null;
    
    public EqualsDemoSample(String name){
        this.objName= name;
    }
     
    public void setName(String name) {
        this.objName = name;
    }
     
    public String getName() {
        return this.objName;
    }
     
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof EqualsDemoSample) {
            EqualsDemoSample equalsSample = (EqualsDemoSample) obj;
            if(equalsSample.getName().equals(this.getName())){
                return true;
            }
        }
        return false;       
    }
}
