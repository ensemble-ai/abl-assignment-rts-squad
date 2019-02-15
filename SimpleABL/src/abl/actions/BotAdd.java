package abl.actions;

import game.Bot;
import game.GameEngine;

import java.awt.Point;

public class BotAdd extends BaseAction {

	public void execute(Object[] args) {
		Bot b = new Bot();
		b.setLocation(new Point((Integer)args[1], (Integer)args[2]));
		
		GameEngine.getInstance().getBots().add(b);
	}
}