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

/**
 * Like Tab3 but with an example of java operators in layout
 */
public class Tab4Fragment extends Fragment {

    @Bind(R.id.randomButton)
    Button randomButton;

    private User4 user;

    public static Tab4Fragment newInstance() {
        return new Tab4Fragment();
    }

    public Tab4Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4_fragment, container, false);

        ButterKnife.bind(this, view);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        it.stefanocappa.databindingexample.CustomBindingNameTab4 binding = DataBindingUtil.bind(view);

        user = new User4("FirstName", "LastName", false);
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
