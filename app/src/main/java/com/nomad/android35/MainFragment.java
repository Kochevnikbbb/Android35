package com.nomad.android35;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment {
    private RecyclerView recyclerView;
    private ContactAdapter adapter;
    private ArrayList <Contact> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycle);
        adapter = new ContactAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Contact("Borya","+7 999 449 0325"));
        list.add(new Contact("Asiya","+7 999 500 0101"));
        list.add(new Contact("Amira","+7 965 449 0505"));
        list.add(new Contact("Aktan","+7 923 555 655"));
        list.add(new Contact("Kairat","+7 999 449 0325"));
    }
}