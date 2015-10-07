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

import butterknife.ButterKnife;
import it.stefanocappa.databindingexample.databinding.Tab2FragmentBinding;
import it.stefanocappa.databindingexample.databinding.Tab7FragmentBinding;

/**
 * Example with ObservableFields for Data Binding
 */
public class Tab7Fragment extends Fragment {

    public static Tab7Fragment newInstance() {
        return new Tab7Fragment();
    }

    public Tab7Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab7_fragment, container, false);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        Tab7FragmentBinding binding = DataBindingUtil.bind(view);

        User6 user = new User6();
        user.firstName.set("FirstName");
        user.lastName.set("LastName");
        user.firstNameClicked.set(false);
        user.firstNameNull.set(null);

        binding.setUser(user);

        return view;
    }
}
