package it.stefanocappa.databindingexample;

import java.util.Locale;

/**
 * Created by Stefano Cappa on 27/09/15.
 */
public class MyStringUtils {

    public static String capitalize(String input) {
        return input.toUpperCase(new Locale(Locale.ENGLISH.getLanguage(), Locale.US.getCountry()));
    }

}
