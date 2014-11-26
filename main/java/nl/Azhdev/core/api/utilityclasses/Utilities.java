package nl.Azhdev.core.api.utilityclasses;

import java.util.Random;

/**
 * 
 * @author Azhdev
 *
 * util.java created at 13:10:26 13 nov. 2014
 *
 */

public class Utilities {
	/**
	 * used by the taunts mod to get a random sound in the format "tau:tauntx" where x is a variable
	 * @return
	 */
	public static String getRandomSound(){
		Random random = new Random();
		return "tau:taunt" + random.nextInt(81);
	}
}
