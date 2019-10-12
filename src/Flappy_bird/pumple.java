package Flappy_bird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class pumple extends JPanel {

	private static int x1 = 500, x2 = x1 + 140, x3 = x2 + 140, x4 = x3 + 140;
	private static int h1, h2, h3, h4;
	private static boolean b1 = false;
	private static boolean b2 = false;
	private static boolean b3 = false;
	private static boolean b4 = false;
	private BufferedImage pumpleUp, pumpleDown;

	public void ngaunhien() {
		Random rd = new Random();
		if (b1 == false) {
			h1 = rd.nextInt(200);
			b1 = true;
		} // random tu 0--99
		if (b2 == false) {
			h2 = rd.nextInt(200);
			b2 = true;
		}
		if (b3 == false) {
			h3 = rd.nextInt(200);
			b3 = true;
		}
		if (b4 == false) {
			h4 = rd.nextInt(200);
			b4 = true;
		}
	}

	public void paint(Graphics g) {
		ngaunhien();
//		// ong tren
//		g.setColor(Color.green);
//		g.fillRect(x1, 0, 65, h1);
//		// ong duoi
//		g.setColor(Color.green);
//		g.fillRect(x1, h1 + 100, 65, 500);
		try {
			pumpleUp = ImageIO.read(new File("C:\\Users\\Duc Anh\\eclipse-workspace\\Flappy_Bird\\res\\OngnuocTren.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pumpleDown = ImageIO.read(new File("C:\\Users\\Duc Anh\\eclipse-workspace\\Flappy_Bird\\res\\OngnuocDuoi.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(pumpleUp, x1, 0, 65, h1, null);
		g.drawImage(pumpleDown, x1, h1 +100, 65, 500, null);
//		----------------
		g.drawImage(pumpleUp, x2, 0, 65, h2, null);
		g.drawImage(pumpleDown, x2, h2 +100, 65, 500, null);
//		--------------------
		g.drawImage(pumpleUp, x3, 0, 65, h3, null);
		g.drawImage(pumpleDown, x3, h3 +100, 65, 500, null);
//		---------------------
		g.drawImage(pumpleUp, x4, 0, 65, h4, null);
		g.drawImage(pumpleDown, x4, h4 +100, 65, 500, null);
		
	}

	public void giamX() {
		x1--;
		x2--;
		x3--;
		x4--;

	}
	

	public static int getX1() {
		return x1;
	}

	public static void setX1(int x1) {
		pumple.x1 = x1;
	}

	public static int getX2() {
		return x2;
	}

	public static void setX2(int x2) {
		pumple.x2 = x2;
	}

	public static int getX3() {
		return x3;
	}

	public static void setX3(int x3) {
		pumple.x3 = x3;
	}

	public static int getX4() {
		return x4;
	}

	public static void setX4(int x4) {
		pumple.x4 = x4;
	}

	public int getH1() {
		return h1;
	}

	public void setH1(int h1) {
		this.h1 = h1;
	}

	public int getH2() {
		return h2;
	}

	public void setH2(int h2) {
		this.h2 = h2;
	}

	public int getH3() {
		return h3;
	}

	public void setH3(int h3) {
		this.h3 = h3;
	}

	public int getH4() {
		return h4;
	}

	public void setH4(int h4) {
		this.h4 = h4;
	}

	public static boolean isB1() {
		return b1;
	}

	public static boolean isB2() {
		return b2;
	}

	public static boolean isB3() {
		return b3;
	}

	public static boolean isB4() {
		return b4;
	}

	public void laplai() {
		if (x1 == -65) {
			x1 = 500;
			b1 = false;
		}
		if (x2 == -65) {
			x2 = 500;
			b2 = false;
		}
		if (x3 == -65) {
			x3 = 500;
			b3 = false;
		}
		if (x4 == -65) {
			x4 = 500;
			b4 = false;
		}
	}
}
