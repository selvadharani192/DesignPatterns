//$Id$
package com.designPatterns.decorator;

public abstract class TextEditorDecorator implements TextEditor {
	TextEditor textEditor;
	
	public TextEditorDecorator(TextEditor textEditor) {
		this.textEditor=textEditor;
	}
   public void save() {
	   textEditor.save();
   }
   public void undo() {
	   textEditor.undo();
   }
   public void redo() { textEditor.redo(); }
   public void placeCursorToHome() { textEditor.placeCursorToHome(); }
   public void placeCursorToEnd() { textEditor.placeCursorToEnd(); }}
