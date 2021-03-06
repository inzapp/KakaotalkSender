package com.kakaosender.view;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FX View 컨트롤을 위한 레퍼런스 공유
 * @author root
 *
 */
public abstract class View {
	public static RadioButton loopRd, dummy5Rd, customInputRd;
	public static TextField customInputText;
	public static TextArea content;

	public static Button startBt, stopBt;
	public static ToggleGroup sendCountToggleGroup;
}
