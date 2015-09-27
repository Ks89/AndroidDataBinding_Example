package it.stefanocappa.databindingexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import lombok.Getter;

/**
 * Binding data for recycler view
 */
public class TabXFragment extends Fragment implements TabXRecyclerViewAdapter.ItemClickListener {


    @Bind(R.id.recyclerViewtab2)
    RecyclerView recyclerViewtab2;

    @Getter
    private TabXRecyclerViewAdapter newAdapter;

    public static TabXFragment newInstance() {
        return new TabXFragment();
    }

    public TabXFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabx__fragment, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        ButterKnife.unbind(this);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerViewtab2.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerViewtab2.setHasFixedSize(true);
        newAdapter = new TabXRecyclerViewAdapter(this);
        recyclerViewtab2.setAdapter(newAdapter);
        recyclerViewtab2.setItemAnimator(new DefaultItemAnimator());


    }

    @Override
    public void clickedTab2Item(String element) {

    }
}
