import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obieintrobot {
	static Robot ron = new Robot();
	
public static void main(String[] args) {
	
	ron.penDown();
	ron.setSpeed(1000);
ron.sparkle();
String color=	JOptionPane.showInputDialog("what color do you  want?");

if(color .equals ("red")) {
	ron.setPenColor(160, 38, 38);
}

if(color .equals ("green")) {
	ron.setPenColor(19, 163, 65);
}
if(color .equals ("blue")) {
	ron.setPenColor(16, 145, 168);
}



String shape = JOptionPane.showInputDialog("What shape do you want to draw???");

if (shape .equals ("square")) {
	square();

}
if (shape .equals("triangle")) {
	triangle();
}
if (shape .equals ("circle")) {
	circle();
}

}

static void square() {
	for (int i = 0; i < 4; i++) {
		ron.move(100);	
		ron.turn(90);
		}
}


static void triangle() {
	for (int i = 0; i < 3; i++) {
		ron.move(100);	
		ron.turn(360/3);
		}
}

static void circle() {
	for (int i = 0; i < 400; i++) {
		ron.move(1);	
		ron.turn(360/360);
		}
}

}

