package com.applet;

import java.awt.*;

public class CreateButton {
	 CreateButton()
     {
        Frame f = new Frame();
        Button b1 = new Button("Button 1");
        Button b2 = new Button("B2");
        Button b3 = new Button();
        
        b1.setBounds(50,50,100,50);
        b2.setBounds(50,100,100,50);
        b3.setBounds(150,50,100,100);
        
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        if(b1.getLabel() == "Button 1")
        b3.setLabel("B3");
     }
        
        
    public static void main(String []args){
        CreateButton b = new CreateButton();
    }
}

