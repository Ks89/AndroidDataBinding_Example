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

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import lombok.Getter;

public class TabXRecyclerViewAdapter extends RecyclerView.Adapter<TabXRecyclerViewAdapter.ViewHolder> {
    private ItemClickListener itemClickListener;

    @Getter
    private List<String> list;

    public TabXRecyclerViewAdapter(@NonNull ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
        setHasStableIds(true);
        list = new ArrayList<>();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final View parent;

        @Bind(R.id.nameTextView)
        TextView nameTextView;

        public ViewHolder(View view) {
            super(view);
            this.parent = view;
            ButterKnife.bind(this, view);
        }

        public void setOnClickListener(OnClickListener listener) {
            parent.setOnClickListener(listener);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.tabx__cardview, viewGroup, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        final String element = list.get(position);

        viewHolder.nameTextView.setText(element);

        viewHolder.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.clickedTab2Item(element);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface ItemClickListener {
        void clickedTab2Item(final String element);
    }
}