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
