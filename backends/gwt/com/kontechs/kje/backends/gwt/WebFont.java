package com.kontechs.kje.backends.gwt;

import com.kontechs.kje.Font;

public class WebFont implements Font {
	public String name;
	
	public WebFont(String name) {
		this.name = name;
	}
	
	@Override
	public double getHeight() {
		return 0;
	}

	@Override
	public double charWidth(char ch) {
		return 0;
	}

	@Override
	public double charsWidth(char[] ch, int offset, int length) {
		return 0;
	}

	@Override
	public double stringWidth(String str) {
		return 0;
	}

	@Override
	public double getBaselinePosition() {
		return 0;
	}
}