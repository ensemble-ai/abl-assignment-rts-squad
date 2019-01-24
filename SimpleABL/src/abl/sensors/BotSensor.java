package abl.sensors;

import game.GameEngine;
import abl.runtime.BehavingEntity;
import abl.wmes.BotWME;
/**
 * Adds a ChaserWME object to working memory when sense in invoked.
 * 
 * @author Ben Weber 3-7-11
 */
public class BotSensor extends SerialSensor {

	/**
	 * Adds a Chaser WME to working memory of the agent and deletes previous chaser WMEs in memory.
	 */
	public void sense() {
 
		BehavingEntity.getBehavingEntity().deleteAllWMEClass("BotWME");
		BehavingEntity.getBehavingEntity().addWME(
				new BotWME(GameEngine.getInstance().getChaserLocation(), GameEngine.getInstance().getChaserTrajectory()));
	}
}
