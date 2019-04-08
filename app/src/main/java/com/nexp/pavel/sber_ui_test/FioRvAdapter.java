package com.nexp.pavel.sber_ui_test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

public class FioRvAdapter extends RecyclerView.Adapter<FioRvAdapter.FioViewHolder> {

    private List<FIO> fioList;
    private AdapterOnClick onClick;

    public FioRvAdapter(List<FIO> list, AdapterOnClick onClick){
        fioList = new ArrayList<>();
        fioList.addAll(list);
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public FioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fio_rv_item, viewGroup, false);
        return new FioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FioViewHolder viewHolder, int i) {
        viewHolder.fio.setText(fioList.get(i).getFio());

        viewHolder.itemView.setOnClickListener((View v) -> onClick.onClick(fioList.get(i).getFio()));
    }

    @Override
    public int getItemCount() {
        return fioList.size();
    }

    public class FioViewHolder extends RecyclerView.ViewHolder {

        private TextView fio;

        public FioViewHolder(@NonNull View itemView) {
            super(itemView);
            fio = itemView.findViewById(R.id.item_fio);
        }

        public String getFio() {
            return fio.getText().toString();
        }
    }
}