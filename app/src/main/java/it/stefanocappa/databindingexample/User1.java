package it.stefanocappa.databindingexample;

/**
 * Created by Stefano Cappa on 24/09/15.
 */
public class User1 {
    private String firstName;
    private String lastName;
    private boolean firstNameClicked;

    public User1(String firstName, String lastName, boolean firstNameClicked) {
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

}