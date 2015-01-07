/**
 * @Title: TextEditor.java
 * @Package pack
 * Copyright: Copyright (c) 2011 
 * Company:Everbridge.Inc
 * 
 * @author wyq
 * @date Jan 6, 2015 3:58:29 PM
 * @version V1.0
 * @Description: TODO
 */
package pack;

/**
 * @ClassName: TextEditor
 * @Description: TODO
 * @author wyq
 * @date Jan 6, 2015 3:58:29 PM
 */
public class TextEditor {
	private SpellChecker spellChecker;

	// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
