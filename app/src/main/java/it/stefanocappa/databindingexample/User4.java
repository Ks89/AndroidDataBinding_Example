package it.stefanocappa.databindingexample;

import android.databinding.ObservableBoolean;

/**
 * Created by Stefano Cappa on 24/09/15.
 */
public class User4 {
    private String firstName;
    private String lastName;
    private boolean firstNameClicked;
    private String firstNameNull = null;

    public final ObservableBoolean professor = new ObservableBoolean();

    public User4(String firstName, String lastName, boolean firstNameClicked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstNameClicked = firstNameClicked;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isFirstNameClicked() {
        return firstNameClicked;
    }

    public void setFirstNameClicked(boolean firstNameClicked) {
        this.firstNameClicked = firstNameClicked;
    }

    public String getFirstNameNull() {
        return firstNameNull;
    }

    public void setFirstNameNull(String firstNameNull) {
        this.firstNameNull = firstNameNull;
    }
}