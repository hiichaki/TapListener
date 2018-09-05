package tap.listener;

import java.awt.event.KeyEvent;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.SwingKeyAdapter;

public class CustomScreen extends GlobalScreen {

	static {
		// Add adaptors to the listener to convert the events.
		addNativeKeyListener(new KeyAdapter());

	}

	private static class KeyAdapter extends SwingKeyAdapter {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7377393123350482541L;

		public void keyTyped(KeyEvent keyEvent) {
			System.out.println("qqq:" + keyEvent.getKeyChar());
			// keyEvent.consume();
		}

		public void keyPressed(KeyEvent keyEvent) {
			System.out.println("qqq:" + keyEvent.getKeyChar());
			// keyEvent.consume();
		}

		public void keyReleased(KeyEvent keyEvent) {
			System.out.println("qqq:" + keyEvent.getKeyChar());
			// keyEvent.consume();
		}
	}
}
