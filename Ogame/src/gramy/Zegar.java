package gramy;


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

 


//g��wny zegar
class Zegar extends JLabel implements Runnable {

	private Thread thread;
	private int pause = 1000;

public Zegar() {

	

	setFont (new Font ("Consolas", Font.BOLD, 28));
	
	setForeground(Color.WHITE);
	
	setBounds(50,50,240,60);
	setOpaque(false);
}
public void start() {

		if (thread == null) {

				thread = new Thread(this);
				thread.start();
		}
}
public void run() {

while ( thread == Thread.currentThread()) {

Date time = new Date();
DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
setText(df.format(time));
		try {
			thread.sleep(pause);
		} catch (InterruptedException e) {}
	}
}
	public void stop() {

		thread = null;
}
}