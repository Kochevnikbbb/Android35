package com.nomad.android35;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContViewHolder> {



    private ArrayList<Contact> contact = new ArrayList();
    public ContactAdapter(ArrayList<Contact> contact) {
        this.contact = contact;
    }





    @NonNull
    @Override
    public ContViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContViewHolder holder, int position) {
        holder.bind(contact.get(position));

    }

    @Override
    public int getItemCount() {
        return contact.size();
    }






    static class ContViewHolder extends RecyclerView.ViewHolder{

        private TextView name, number;

        public ContViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_contact);
            number = itemView.findViewById(R.id.number_contact);
        }

        public void bind(Contact contact) {
            number.setText(contact.getNumber());
            name.setText(contact.getName());

        }
    }
}
