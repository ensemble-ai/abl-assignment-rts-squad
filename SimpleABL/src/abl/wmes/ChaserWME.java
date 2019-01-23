package abl.wmes;

import java.awt.Point;

import wm.WME;
/**
 * Stores information about the chaser.
 * 
 * @author Ben Weber 3-7-11
 */
public class ChaserWME extends WME {

	/** Location of the chaser */
	private Point location;
	
	/** Trajectory of the chaser */
	private Point trajactory;
	
	/**
	 * Instantiates a working memory element for tracking the chaser.
	 */
	public ChaserWME(Point location, Point trajectory) {
		this.location = location;
		this.trajactory = trajectory;
	}
	
	/**
	 * Returns the x location of the chaser. 
	 */
	public int getLocationX() {
		return location.x;
	}
	
	/**
	 * Returns the y location of the chaser. 
	 */
	public int getLocationY() {
		return location.y;
	}
	
	/**
	 * Returns the x direction of the chaser. 
	 */
	public int getTrajectoryX() {
		return trajactory.x;
	}
	
	/**
	 * Returns the y direction of the chaser. 
	 */
	public int getTrajectoryY() {
		return trajactory.y;
	}
}
