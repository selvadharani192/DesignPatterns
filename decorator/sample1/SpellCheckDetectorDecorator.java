//$Id$
package com.designPatterns.decorator;

public class SpellCheckDetectorDecorator extends TextEditorDecorator{

	public SpellCheckDetectorDecorator(TextEditor textEditor) {
		super(textEditor);
	}
	public void save() {
		System.out.print("Spell check Running");
		super.save();
	}

}
