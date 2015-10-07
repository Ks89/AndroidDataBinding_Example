package it.stefanocappa.databindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Stefano Cappa on 07/10/15.
 */
public class User5 extends BaseObservable {
    private String firstName;
    private String lastName;
    private boolean firstNameClicked;
    private String firstNameNull = null;

    public User5(String firstName, String lastName, boolean firstNameClicked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstNameClicked = firstNameClicked;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(it.stefanocappa.databindingexample.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(it.stefanocappa.databindingexample.BR.lastName);
    }

    @Bindable
    public boolean isFirstNameClicked() {
        return firstNameClicked;
    }

    public void setFirstNameClicked(boolean firstNameClicked) {
        this.firstNameClicked = firstNameClicked;
        notifyPropertyChanged(it.stefanocappa.databindingexample.BR.firstNameClicked);
    }

    @Bindable
    public String getFirstNameNull() {
        return firstNameNull;
    }

    public void setFirstNameNull(String firstNameNull) {
        this.firstNameNull = firstNameNull;
        notifyPropertyChanged(it.stefanocappa.databindingexample.BR.firstNameNull);
    }
}