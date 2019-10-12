package Flappy_bird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class bird extends JFrame{
	private static int y = 200;
	private static int x = 100;
	private BufferedImage bird;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void paint(Graphics g) {
//		g.setColor(Color.red);
//		g.fillRect(x, y, 30, 30);
		try {
			bird = ImageIO.read(new File("C:\\Users\\Duc Anh\\eclipse-workspace\\Flappy_Bird\\res\\Bird.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(bird, x, y, null);
	}
	
	public void tangY() {
		y++;
	}
	public void giamY() {
		y-= 40;
	}
}
