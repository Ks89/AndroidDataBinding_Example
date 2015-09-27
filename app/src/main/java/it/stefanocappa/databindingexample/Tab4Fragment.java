package it.stefanocappa.databindingexample;

import android.databinding.DataBindingUtil;
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
import it.stefanocappa.databindingexample.databinding.Tab2FragmentBinding;
import lombok.Getter;

/**
 * Binding data for recycler view
 */
public class Tab4Fragment extends Fragment implements Tab4RecyclerViewAdapter.ItemClickListener {


    @Bind(R.id.recyclerViewtab2)
    RecyclerView recyclerViewtab2;

    @Getter
    private Tab4RecyclerViewAdapter newAdapter;

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
        newAdapter = new Tab4RecyclerViewAdapter(this);
        recyclerViewtab2.setAdapter(newAdapter);
        recyclerViewtab2.setItemAnimator(new DefaultItemAnimator());


    }

    @Override
    public void clickedTab2Item(String element) {

    }
}
