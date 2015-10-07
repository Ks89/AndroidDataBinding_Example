package it.stefanocappa.databindingexample;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Created by Stefano Cappa on 07/10/15.
 */
public class User6 {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableBoolean firstNameClicked = new ObservableBoolean();
    public final ObservableField<String> firstNameNull = new ObservableField<>();
}