package kiloboltGame;

public class Enemy {
	private int maxHp, currHp, power, speedX, centerX, centerY;
	private Background bg = StartingClass.getBg1();

	public void update() {
		centerX += speedX;
		speedX = bg.getSpeedX();
	}

	public void die() {

	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getCurrHp() {
		return currHp;
	}

	public int getPower() {
		return power;
	}

	public int getSpeedX() {
		return speedX;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public Background getBg() {
		return bg;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public void setCurrHp(int currHp) {
		this.currHp = currHp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public void setBg(Background bg) {
		this.bg = bg;
	}

	public void attack() {

	}
}
