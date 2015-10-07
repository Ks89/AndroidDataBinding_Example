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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;

/**
 * Example with BaseObservable and Bindable for Data Binding
 */
public class Tab6Fragment extends Fragment {

    public static Tab6Fragment newInstance() {
        return new Tab6Fragment();
    }

    public Tab6Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab6_fragment, container, false);

        ButterKnife.bind(this, view);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        it.stefanocappa.databindingexample.CustomBindingNameTab6 binding = DataBindingUtil.bind(view);

        User5 user = new User5("FirstName", "LastName", false);

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
}
