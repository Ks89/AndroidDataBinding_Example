package it.stefanocappa.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import it.stefanocappa.databindingexample.databinding.Tab2FragmentBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class Tab2Fragment extends Fragment {

    @Bind(R.id.randomButton)
    Button randomButton;

    private User2 user;
    private Tab2FragmentBinding binding;

    public static Tab2Fragment newInstance() {
        return new Tab2Fragment();
    }

    public Tab2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment, container, false);

        ButterKnife.bind(this, view);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        binding = DataBindingUtil.bind(view);

        user = new User2("FirstName", "LastName", false);
        user.professor.set(new Random().nextBoolean());
        binding.setUser(user);


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.randomButton)
    public void onClickRandom(View v) {
        boolean newBool = new Random().nextBoolean();
        Log.d("Tab2", "newBool is " + newBool);
        user.professor.set(newBool);
        //here it isn't necessary to bind the updated object (binding.setUser(user)), because i'm using an
        //ObservableBoolean in the model
    }
}
