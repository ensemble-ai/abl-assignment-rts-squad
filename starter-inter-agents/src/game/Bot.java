package game;

import java.awt.Color;
import java.awt.Point;

public class Bot {
 
	public static final int Size = 10;
	
	static int IdCount = 0;
	
	/** Location of the bot */
	private Point location;
	
	/** Trajectory of the bot */
	private Point trajectory;
	
	/** track movement **
	 */
	private boolean tracked;
	
	/** unique bot ID */
	private int id;

	private Color color;
	
	private int size = Size;
	
	
	private Point form;
	
	public Bot() {
		this.location = new Point(0,0);
		this.trajectory = new Point(0,0);
		this.id = IdCount++;
		this.color = color;
		this.form = new Point(0,0);
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

	public int getSize() {
		return size;
	}
	
	public Boolean movedLoc() {
		return tracked;
	}
	
	public Point getForm() {
		return form;
	}
	
	public void setForm(Point form) {
		this.form = form;
		
	}

	
	public void setLoc(boolean tracked) {
		this.tracked = tracked;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(int r, int g, int b) {
		this.color = new Color(r, g, b);
	}
}
