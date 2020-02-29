package awtlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

public class AWTLayout {

    public static void main(String[] args) {
         Frame f = new Frame();
        
        LayoutManager layOut = new GridBagLayout();
        GridBagConstraints c;
        
        f.setLayout(layOut);
        
       
        
        Button b = new Button("Button1");
        Button b1 = new Button("Button2");
        Button b2 = new Button("Button3");
        Button b3 = new Button("Button4");
        Button b4 = new Button("Button5");
        
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        f.add(b, c);
        
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        f.add(b1, c);
        
        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 0;
        f.add(b2, c);
        
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.BOTH;
        f.add(b3, c);
        
        
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
       
        f.add(b4, c);
        
        
        
        f.setSize(300, 100);
        f.setVisible(true);
        
        
        
    }

}
