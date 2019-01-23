package abl.sensors;

import game.Chaser;
import abl.runtime.BehavingEntity;
import abl.wmes.ChaserWME;
/**
 * Adds a ChaserWME object to working memory when sense in invoked.
 * 
 * @author Ben Weber 3-7-11
 */
public class ChaserSensor extends SerialSensor {

	/**
	 * Adds a Chaser WME to working memory of the agent and deletes previous chaser WMEs in memory.
	 */
	public void sense() {
 
		BehavingEntity.getBehavingEntity().deleteAllWMEClass("ChaserWME");
		BehavingEntity.getBehavingEntity().addWME(
				new ChaserWME(Chaser.getInstance().getChaserLocation(), Chaser.getInstance().getChaserTrajectory()));
	}
}
