package abl.actions;

import game.Chaser;

import java.awt.Point;
/**
 * Sets the trajectory of the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class MoveRight extends BaseAction {

	/**
	 * Sets the trajectory of the player to move right.
	 */
	public void execute(Object[] args) {
		Chaser.getInstance().setChaserTrajectory(new Point(Chaser.ChaserSpeed, 0));
	}
}
