package com.tutorialspoint;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor Constructor");
        this.spellChecker = spellChecker;
    }

    public void checkSpell() {
        spellChecker.checkSpelling();
    }
}
