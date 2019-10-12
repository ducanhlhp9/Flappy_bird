package Flappy_bird;

public class kiemtra {
	private bird bird = new bird();
	private pumple pumple = new pumple();

	public boolean die() {

		// khi chim cham dat
		if (bird.getY() + 30 >= 400) {
			return true;
		}  

		// khi chim cham ong nuoc
		if (bird.getY() <= pumple.getH1() && (bird.getX() + 30) >= pumple.getX1()
				&& bird.getX() <= (pumple.getX1() + 65)) {
			return true;
		}
		if ((bird.getY() + 30) >= (pumple.getH1() + 100) && (bird.getX() + 30) >= pumple.getX1()
				&& bird.getX() <= (pumple.getX1() + 65)) {
			return true;
		}
//		------------
		if (bird.getY() <= pumple.getH2() && (bird.getX() + 30) >= pumple.getX2()
				&& bird.getX() <= (pumple.getX2() + 65)) {
			return true;
		}
		if ((bird.getY() + 30) >= (pumple.getH2() + 100) && (bird.getX() + 30) >= pumple.getX2()
				&& bird.getX() <= (pumple.getX2() + 65)) {
			return true;
		}
//		--------------
		if (bird.getY() <= pumple.getH3() && (bird.getX() + 30) >= pumple.getX3()
				&& bird.getX() <= (pumple.getX3() + 65)) {
			return true;
		}
		if ((bird.getY() + 30) >= (pumple.getH3() + 100) && (bird.getX() + 30) >= pumple.getX3()
				&& bird.getX() <= (pumple.getX3() + 65)) {
			return true;
		}
//		--------------
		if (bird.getY() <= pumple.getH4() && (bird.getX() + 30) >= pumple.getX4()
				&& bird.getX() <= (pumple.getX4() + 65)) {
			return true;
		}
		if ((bird.getY() + 30) >= (pumple.getH4() + 100) && (bird.getX() + 30) >= pumple.getX4()
				&& bird.getX() <= (pumple.getX4() + 65)) {
			return true;
		}

		return false;
	}
}
