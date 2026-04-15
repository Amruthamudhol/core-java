package com.xworkz.language;

public class LanguageRunner {
    public static void main(String[] args) {

        Developer d1 = new Developer("Guido van Rossum", "Netherlands");

        String[] caps = {"Dynamic Typing", "Interpreted", "High-Level"};

        Language langObj = new Language("Python", 2, 3.11,
                caps, Proficiency.EASY, d1);

        ScriptingLanguage scriptObj = new ScriptingLanguage("JavaScript", 1, 18.0,
                caps, Proficiency.MODERATE, d1,
                "Interpreter", true);


        langObj.executeCode();
        langObj.showDetails();
        System.out.println(langObj);

        System.out.println("----------------------");

        scriptObj.executeCode();
        scriptObj.showDetails();
        System.out.println(scriptObj);
    }
}
