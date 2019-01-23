package abl.build;

import abl.compiler.Abl;
/**
 * Utility class for running the ABL compiler.
 * 
 * Note: if the debug mode is enabled, the generated source code will include 
 * additional code for displaying a debug GUI.
 * 
 * Note: ANT can also be used for performing this task.
 * 
 * @author Ben Weber 3-7-11
 */
public class AgentCompiler {
	
	/** enable debug mode? */
	private static boolean debugMode = true;

	/**
	 * Runs the ABL compiler. 
	 */
	public static void main(String[] args) {

		if (debugMode) {
//			try {
//				Abl.compileFile("src/abl/agents/ChaserAgent.abl");
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (CompileException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			Abl.main(new String[] { "-g2", "-d", "src", "src/abl/agents/ChaserAgent.abl" });
			//Abl.main(new String[] { "-g2", "-d", "src", "src/abl/agents/ChaserAgent.abl" });
		}
		else {
			Abl.main(new String[] { "-d", "src", "src/abl/agents/ChaserAgent.abl" });
		}
	}
}
