/*
 * Copyright (C) 2015 Stefano Cappa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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