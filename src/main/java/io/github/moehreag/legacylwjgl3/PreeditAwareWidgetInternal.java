package io.github.moehreag.legacylwjgl3;

import io.github.moehreag.legacylwjgl3.api.PreeditAwareWidget;

/**
 * Compatibility entry point for the optional Legacy LWJGL3 IME bridge.
 */
public final class PreeditAwareWidgetInternal {
	private PreeditAwareWidgetInternal() {
	}

	public static void updateWidgetFocus(PreeditAwareWidget widget, boolean focused) {
		// Lenis owns the SDL IME path; there is no legacy focus bridge to update.
	}
}
