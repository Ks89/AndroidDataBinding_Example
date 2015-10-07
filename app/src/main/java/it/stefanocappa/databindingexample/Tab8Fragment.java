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

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.stefanocappa.databindingexample.databinding.Tab8FragmentBinding;

/**
 * Example with ObservableFields for Data Binding
 * FIXME: map and list aren't working. I don't know why.
 */
public class Tab8Fragment extends Fragment {

    public static Tab8Fragment newInstance() {
        return new Tab8Fragment();
    }

    public Tab8Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab8_fragment, container, false);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        Tab8FragmentBinding binding = Tab8FragmentBinding.bind(view);

        User7 user = new User7();
        user.firstName.set("FirstName");
        user.lastName.set("LastName");
        user.firstNameClicked.set(false);
        user.firstNameNull.set(null);

        //collections example
        user.map.put("key1", "value1");
        user.map.put("key2", "value2");
        user.map.put("key3", "value3");

        user.list.add("listvalue1");
        user.list.add("listvalue2");
        user.list.add("listvalue3");

        binding.setKey("key3");
        binding.setIndex(1);
        binding.setUser(user);

        return view;
    }
}
