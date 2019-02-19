package abl.actions;

import game.Bot;
import game.GameEngine;

import java.awt.Point;
import java.util.ArrayList;

import abl.runtime.BehavingEntity;
/**
 * Sets the trajectory of the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class NewMoveAction extends BaseAction {
	/**
	 * 
	 */
	
	/**
	 * Sets the trajectory of the player to move down.
	 * args[0] - bot id
	 * args[1] - target x position
	 * args[2] - target y position 
	 */
	public int map_distance(int playerX, int playerY, int botX, int botY) {
	
		return (int) Math.round((Math.sqrt(((playerX - botX)*(playerX - botX)) + ((playerY - botY)*(playerY - botY)))));
		
	}
	public void execute(Object[] args) {
		int coordx = 0;
		int coordy = 0;
		int dist = (int)(Math.round((Math.random()*GameEngine.BotSpeed)%10)+1);
		int inter_dist = 0;
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[0]) {
				Point loc1 = b.getLocation();
				
				if(dist < map_distance((Integer)args[1], (Integer)args[2], (int)loc1.getX(), (int)loc1.getY())){
					inter_dist = map_distance((Integer)args[1], (Integer)args[2], (int)loc1.getX(), (int)loc1.getY());
					coordx = (int) (Math.round(Math.abs((dist - inter_dist)/Math.random())));
					coordx = -coordx;
				}
				
				b.setTrajectory(new Point(coordx, coordy));
				b.setLoc(true);
			}
		}
	}
}
