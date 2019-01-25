package game;

import java.awt.Point;

public class Bot {

	static int idCount = 0;
	
	/** Location of the bot */
	private Point location;
	
	/** Trajectory of the bot */
	private Point trajectory;
	
	/** unique bot ID */
	private int id;

	public Bot() {
		this.location = new Point(0,0);
		this.trajectory = new Point(0,0);
		this.id = idCount++;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public Point getTrajectory() {
		return trajectory;
	}

	public void setTrajectory(Point trajectory) {
		this.trajectory = trajectory;
	}
	
	public int getX( ) {
		return this.location.x;
	}
	
	public int getY( ) {
		return this.location.y;
	}
	
	public int getId() {
		return id;
	}
	
}
