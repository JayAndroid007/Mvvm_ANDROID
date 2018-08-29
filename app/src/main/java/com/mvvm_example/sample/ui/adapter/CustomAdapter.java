package com.mvvm_example.sample.ui.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mvvm_example.sample.R;
import com.mvvm_example.sample.databinding.CategoryBinding;
import com.mvvm_example.sample.viewModel.CategoryViewModel;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {


    private ArrayList<CategoryViewModel> arrayList;
    private Context context;
    private LayoutInflater layoutInflater;


    public CustomAdapter(ArrayList<CategoryViewModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (layoutInflater == null) {


            layoutInflater = LayoutInflater.from(parent.getContext());


        }

        CategoryBinding categoryBinding = DataBindingUtil.inflate(layoutInflater, R.layout.inner_layout_recyclerview, parent, false);


        return new CustomView(categoryBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView holder, int position) {

        CategoryViewModel categoryViewModel=arrayList.get(position);
        holder.bind(categoryViewModel);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class CustomView extends RecyclerView.ViewHolder {


        public CategoryBinding categoryBinding;

        public CustomView(CategoryBinding categoryBinding) {

            super(categoryBinding.getRoot());

            this.categoryBinding = categoryBinding;


        }


        public void bind(CategoryViewModel categoryViewModel){

            this.categoryBinding.setCategorymodel(categoryViewModel);
            categoryBinding.executePendingBindings();

        }

        public CategoryBinding getcategoryBinding(){


            return categoryBinding;
        }

    }

}
