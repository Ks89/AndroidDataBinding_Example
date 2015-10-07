package it.stefanocappa.databindingexample;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Created by Stefano Cappa on 07/10/15.
 */
public class User7 {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableBoolean firstNameClicked = new ObservableBoolean();
    public final ObservableField<String> firstNameNull = new ObservableField<>();
    public final ObservableArrayMap<String, Object> map = new ObservableArrayMap<>();
    public final ObservableArrayList<Object> list = new ObservableArrayList<>();
}