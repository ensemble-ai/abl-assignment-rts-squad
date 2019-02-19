package abl.wmes;

import java.awt.Point;
import java.awt.Color;

import wm.WME;
/**
 * Stores information about the bot.
 * 
 * @author Ben Weber 3-7-11
 * @author Josh McCoy 1-23-2019
 */
public class BotWME extends WME {

	/**
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 8101208561374005942L;

	/** Location of the bot */
	private Point location;
	
	/** Trajectory of the bot */
	private Point trajectory;
	
	/** ID of the bot */
	private int id;
	
	/** tracked = true for movement */
	private Boolean tracked;
	/**
	 * Instantiates a working memory element for tracking a bot.
	 * @param color 
	 */
	private Color color;
	
	private Point form;
	
	public BotWME(Point location, Point trajectory, int id, Boolean tracked, Color color) {
		this.location = location;
		this.trajectory = trajectory;
		this.id = id;
		this.tracked = tracked;
		this.color = color;
		this.form = form;
	}
	public int getFormX() {
		return form.x;
	}
	
	public int getFormY() {
		return form.y;
	}
	
	
	/**
	 * Returns the x location of the bot. 
	 */
	public int getLocationX() {
		return location.x;
	}
	
	/**
	 * Returns the y location of the bot. 
	 */
	public int getLocationY() {
		return location.y;
	}
	
	/**
	 * Returns the x direction of the bot. 
	 */
	public int getTrajectoryX() {
		return trajectory.x;
	}
	
	/**
	 * Returns the y direction of the bot. 
	 */
	public int getTrajectoryY() {
		return trajectory.y;
	}

	public int getId() {
		return id;
	}
	
	public Boolean getloc() {
		return tracked;
	}

	public void setLoc(Boolean tracked) {
		this.tracked = tracked;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(int r, int g, int b) {
		this.color = new Color (r,g,b);
	}
}
