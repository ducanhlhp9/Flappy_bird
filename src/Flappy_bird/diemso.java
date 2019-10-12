package Flappy_bird;

public class diemso {
	private static int diem = 0;
	private bird bird = new bird();
	private pumple pumple = new pumple();
	private static boolean b1 = false;
	
	public static int getDiem() {
		return diem;
	}
	public void congdiem() {
		if((bird.getX() + 30) > pumple.getX1() && bird.getX() < (pumple.getX1() + 65)) {
			b1 = true;
		}
		if (b1 == true  && bird.getX() > (pumple.getX1() + 65)) {
			diem++;
			b1 = false;
		}
//		----------------
		if((bird.getX() + 30) > pumple.getX2() && bird.getX() < (pumple.getX2() + 65)) {
			b1 = true;
		}
		if (b1 == true  && bird.getX() > (pumple.getX2() + 65)) {
			diem++;
			b1 = false;
		}
//		-------------------
		if((bird.getX() + 30) > pumple.getX3() && bird.getX() < (pumple.getX3() + 65)) {
			b1 = true;
		}
		if (b1 == true  && bird.getX() > (pumple.getX3() + 65)) {
			diem++;
			b1 = false;
		}
//		--------------
		if((bird.getX() + 30) > pumple.getX4() && bird.getX() < (pumple.getX4() + 65)) {
			b1 = true;
		}
		if (b1 == true  && bird.getX() > (pumple.getX4() + 65)) {
			diem++;
			b1 = false;
		}
	}
}
