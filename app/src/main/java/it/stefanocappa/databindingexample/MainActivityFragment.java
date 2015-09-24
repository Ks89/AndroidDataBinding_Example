package it.stefanocappa.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.stefanocappa.databindingexample.databinding.FragmentMainBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. F....M... with at the end the word "Binding"
        FragmentMainBinding binding = DataBindingUtil.bind(view);

        boolean firstNameClicked = true;
        User user = new User("FirstName", "LastName", firstNameClicked);
        binding.setUser(user);
        binding.setHandlers(new Handlers()); //that uses in the layout the isFriend variable

        return view;
    }
}
