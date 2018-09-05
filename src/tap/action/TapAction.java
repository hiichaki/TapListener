package tap.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TapAction {

	public static void actionOnChar(String symbol) {
		System.out.println("tap: " + symbol);

		switch (symbol) {
		case "\"":
			doPress(KeyEvent.VK_F8);
			break;
		case "t":
			doPress(KeyEvent.VK_F8);
			break;
		case "#":
			doPress(KeyEvent.VK_F8);
			break;
		case "l":
			doPress(KeyEvent.VK_F5);
			break;
		}
	}

	private static void doPress(int arg0) {
		try {
			Robot ROBOT = new Robot();
			pressBackSpace();
			ROBOT.keyPress(arg0);
			ROBOT.keyRelease(arg0);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void pressBackSpace() {
		try {
			Robot ROBOT = new Robot();
			ROBOT.keyPress(KeyEvent.VK_BACK_SPACE);
			ROBOT.keyRelease(KeyEvent.VK_BACK_SPACE);
			try {
				Thread.sleep(128);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
