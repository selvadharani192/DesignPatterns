//$Id$
package com.designPatterns.decorator;

public interface TextEditor {

public void save() ;
public void undo() ;
public void redo();
public void placeCursorToHome() ;

public void placeCursorToEnd() ;
}
