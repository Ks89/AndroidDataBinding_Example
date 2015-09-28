package it.stefanocappa.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Example with Collections for Data Binding
 */
public class Tab5Fragment extends Fragment {

    @Bind(R.id.randomButton)
    Button randomButton;

    private User4 user;

    public static Tab5Fragment newInstance() {
        return new Tab5Fragment();
    }

    public Tab5Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab5_fragment, container, false);

        ButterKnife.bind(this, view);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        it.stefanocappa.databindingexample.CustomBindingNameTab5 binding = DataBindingUtil.bind(view);

        user = new User4("FirstName", "LastName", false);
        user.professor.set(new Random().nextBoolean());
        binding.setUser(user);


        //collections example
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        List<String> list = new ArrayList<>();
        list.add("listvalue1");
        list.add("listvalue2");
        list.add("listvalue3");

        binding.setList(list);
        binding.setMap(map);
        binding.setIndex(2);
        binding.setKey("key3");

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
