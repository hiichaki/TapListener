package tap.listener;

import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import tap.action.TapAction;

public class MyGlobalKeyAdapter extends GlobalKeyAdapter {

	private Long tapKeyboardId;

	public MyGlobalKeyAdapter(Long tapKeyboardId) {
		System.out.println("Tap initialized!");
		this.tapKeyboardId = tapKeyboardId;
	}

	@Override
	public void keyPressed(GlobalKeyEvent event) {
		if (event.getDeviceHandle() == tapKeyboardId) {
			TapAction.actionOnChar(String.valueOf(event.getKeyChar()));
		} else {
			System.out.println("myKeyboard: " + event.getKeyChar());
		}

	}

}
