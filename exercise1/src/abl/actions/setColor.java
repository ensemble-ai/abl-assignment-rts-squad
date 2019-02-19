package abl.actions;

import game.Bot;
import game.GameEngine;

import java.awt.Color;
import java.awt.Point;
/**
 * Fires a bullet. 
 * 
 * @author Ben Weber 3-7-11
 */
public class SetColor extends BaseAction {

	/**
	 * Fires a bullet at the target location.
	 * 
	 * Args:
	 *  - 0: botid
	 *  - 1: int r
	 *  - 2: int g
	 *  - 3: int b
	 */
	@Override
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[0]) {
				b.setColor(new Color ((int)args[1],(int)args[2],(int)args[3]));
			}
		}
	}
}