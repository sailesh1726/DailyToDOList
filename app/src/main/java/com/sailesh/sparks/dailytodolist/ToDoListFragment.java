package com.sailesh.sparks.dailytodolist;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sailesh.sparks.dailytodolist.databinding.FragmentToDoListBinding;
import com.sailesh.sparks.dailytodolist.viewmodel.ToDoListViewModel;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


/**
 * A simple {@link Fragment} subclass.
 */
public class ToDoListFragment extends Fragment {


    private ToDoListViewModel viewModel;

    public ToDoListFragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(getActivity()).get(ToDoListViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentToDoListBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_to_do_list, container, false);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);
        viewModel.setHelloVisible(true);
        return binding.getRoot();
    }

}
