package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Frame f = new Frame("My AWT Frame"); //set title
				f.setLocationRelativeTo(null); //put in center of screen
                // in awt, directly der is no radio, need to create a group
                CheckboxGroup cbg = new CheckboxGroup(); 
                // last parameter false says that radio will be initally de-selected
                Checkbox c = new Checkbox("Press ctrl + c to exit", cbg, false);
                f.add(c);
                f.pack();
				f.setVisible(true); //show to the user
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
