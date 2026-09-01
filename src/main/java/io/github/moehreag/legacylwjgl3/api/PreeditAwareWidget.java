package io.github.moehreag.legacylwjgl3.api;

import io.github.moehreag.legacylwjgl3.PreeditAwareWidgetInternal;

/**
 * Optional IME widget API exposed by Legacy LWJGL3.
 */
public interface PreeditAwareWidget {
	int getCursorX();

	int getCursorY();

	int getInputHeight();

	default void onFocusUpdate(boolean focused) {
		PreeditAwareWidgetInternal.updateWidgetFocus(this, focused);
	}
}
