package chess;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SecondFrame implements ActionListener{
JFrame f=new JFrame();
private static int type;
private static boolean pressed;
JPanel[] p=new JPanel[4];
JButton b1=new JButton("Queen");
JButton b2=new JButton("Bishop");
JButton b3=new JButton("Knight");
JButton b4=new JButton("Rook");
Dimension d=new Dimension(80,70);
Dimension panel=new Dimension(80,70);
GridLayout gl=new GridLayout(1,4);
public static int getType(){
	return type;
}
public static void setPressed(boolean a ){
	pressed=a;
}
public static void setType(int a ){
	type=a;
}
public static boolean getPressed(){
	return pressed;
}
public SecondFrame(){
	p[0]=new JPanel();
	p[1]=new JPanel();
	p[2]=new JPanel();
	p[3]=new JPanel();
	b1.setPreferredSize(d);
	b3.setPreferredSize(d);
	b2.setPreferredSize(d);
	b4.setPreferredSize(d);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	p[0].setPreferredSize(panel);
	p[1].setPreferredSize(panel);
	p[2].setPreferredSize(panel);
	p[3].setPreferredSize(panel);
	p[0].add(b1);
	p[1].add(b2);
	p[2].add(b3);
	p[3].add(b4);
	f.setLayout(gl);
	f.add(p[0]);
	f.add(p[1]);
	f.add(p[2]);
	f.add(p[3]);
	f.setSize(500,100);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
}

public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==b1){
		setType(1);
		pressed=true;
		
	}
	if(ae.getSource()==b2){
		setType(2);
		pressed=true;
	}
	if(ae.getSource()==b3){
		setType(3);
		pressed=true;
	}
	if(ae.getSource()==b4){
		setType(4);
		pressed=true;
	}
}
}
