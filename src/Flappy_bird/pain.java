package Flappy_bird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class pain extends JPanel implements Runnable {
	private bird bird = new bird();
	private pumple pumple = new pumple();
	private kiemtra kiemtraA = new kiemtra();
	private diemso diemso = new diemso();
	private BufferedImage BG, nendat;
	Thread ThreadT;
	public pain() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void paint(Graphics g) {
//		g.setColor(Color.cyan);
//		g.fillRect(0, 0, getWidth(), getHeight());
		
		try {
			BG = ImageIO.read(new  File("C:\\Users\\Duc Anh\\eclipse-workspace\\Flappy_Bird\\res\\BG.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(BG,0,0,null);
		pumple.paint(g);
//		g.setColor(Color.green);
//		g.fillRect(0, 400, getWidth(), getHeight());
//		g.setColor(Color.orange);
//		g.fillRect(0, 410, getWidth(), getHeight());
		
		try {
			nendat = ImageIO.read(new File("C:\\Users\\Duc Anh\\eclipse-workspace\\Flappy_Bird\\res\\NenDat.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(nendat,0,400,null);
		bird.paint(g);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Score: " + diemso.getDiem(), 10, 30);
	}
	@Override
	public void run() {
		while(true) {
			repaint();// call lai ham pain
			pumple.giamX();
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pumple.laplai();
			bird.tangY();
			if (kiemtraA.die() == true) ThreadT.stop();
			diemso.congdiem();
			System.out.println(diemso.getDiem());
		}
		
	}
	
}
