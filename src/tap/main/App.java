package tap.main;

import java.util.Map.Entry;

import lc.kra.system.keyboard.GlobalKeyboardHook;
import tap.listener.MyGlobalKeyAdapter;

public class App {
	
	public static void main(String[] args) {
		boolean run = false;
		GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook(true); // use false here to switch to hook instead of raw input
		System.out.println("Global keyboard hook successfully started, press [escape] key to shutdown. Connected keyboards:");
		String tapKeyboard = "\\\\?\\HID#{00001812-0000-1000-8000-00805f9b34fb}_Dev_VID&021915_PID&eeee_REV&0001_df3017418651&Col01#9&128e64a2&0&0000#{884b96c3-56ef-11d1-bc8c-00a0c91405dd}";

		for (Entry<Long, String> keyboard : GlobalKeyboardHook.listKeyboards().entrySet()) {
			
			System.out.format("%d: %s\n", keyboard.getKey(), keyboard.getValue());
			if (keyboard.getValue().equals(tapKeyboard)) {
				keyboardHook.addKeyListener(new MyGlobalKeyAdapter(keyboard.getKey()));
				run = true;
			}
		}
		
		try {
			while(run) Thread.sleep(128);
		} catch (InterruptedException e) {
			/* nothing to do here */ } 
		finally {
			keyboardHook.shutdownHook();
		}
	}
}
