package it.stefanocappa.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.stefanocappa.databindingexample.databinding.Tab1FragmentBinding;

/**
 * Binding data and using handler
 */
public class Tab1Fragment extends Fragment {


    public static Tab1Fragment newInstance() {
        return new Tab1Fragment();
    }

    public Tab1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        Tab1FragmentBinding binding = DataBindingUtil.bind(view);

        boolean firstNameClicked = true;
        User1 user = new User1("FirstName", "LastName", firstNameClicked);
        binding.setUser(user);
        binding.setHandlers(new Handlers()); //that uses in the layout the isFriend variable

        return view;
    }
}
