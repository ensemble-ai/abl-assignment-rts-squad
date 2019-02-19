package abl.actions;

import game.Bot;
import game.GameEngine;

import java.awt.Color;

/**
 * Checks the id and sets color, 0 for red, 1 for blue and 2 for green, 3 is botid
 * 
 */
public class SetColor extends BaseAction {

	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {	
			if(b.getId() == (Integer)args[3]) {
				b.setColor(new Color((Integer)args[0], (Integer)args[1], (Integer)args[2]));
			}
		}
	}
}
