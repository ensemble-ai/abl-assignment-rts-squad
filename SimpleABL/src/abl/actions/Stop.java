package abl.actions;

import game.GameEngine;

import java.awt.Point;
/**
 * Stops the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class Stop extends BaseAction {

	/**
	 * Stops the chaser.
	 */
	public void execute(Object[] args) {
		GameEngine.getInstance().setChaserTrajectory(new Point(0,0));
	}
}
