package Flappy_bird;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Screen extends JFrame {
	pain tapve = new pain();
	private bird bird = new bird();
	
	public Screen() {
		setSize(500, 500);// tao 1 khung cua so 500*500
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 100);
		setResizable(false);
		add(tapve);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {// khi bam vao ban phim se lam gi
				bird.giamY();
			}
		});
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				bird.giamY();
			}
			
		});
	}
	public static void main(String[] args) {
		Screen scr = new Screen();
	}
}
