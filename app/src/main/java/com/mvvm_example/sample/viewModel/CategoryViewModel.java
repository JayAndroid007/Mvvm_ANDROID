package com.mvvm_example.sample.viewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mvvm_example.sample.R;
import com.mvvm_example.sample.model.Categories;

import java.util.ArrayList;

public class CategoryViewModel extends ViewModel {

    public String  title = "", desc = "", imagepath = "";

    public MutableLiveData<ArrayList<CategoryViewModel>> arrayListMutableLiveData = new MutableLiveData<>();


    public ArrayList<CategoryViewModel> arrayList;

    public LiveDataSample liveDataSample;

    public String getImageUrl() {


        return imagepath;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String imageUrl) {


        Glide.with(imageView.getContext()).load(imageUrl).apply(new RequestOptions().placeholder(R.drawable.user)).into(imageView);


    }


    //Default Constructor
    public CategoryViewModel() {

    }


    public CategoryViewModel(Categories category) {

        this.title = category.title;
        this.desc = category.desc;
        this.imagepath = category.imagepath;


    }

    public MutableLiveData<ArrayList<CategoryViewModel>> getArrayListMutableLiveData() {


        arrayList = new ArrayList<>();
        Categories category = new Categories( "Hello Static Data", "This is jay", "http://i.imgur.com/DvpvklR.png");
        //Categories category=new Categories(liveDataSample.getLiveData().getValue().ticketname,liveDataSample.getLiveData().getValue().ticketid,"http://i.imgur.com/DvpvklR.png");



        CategoryViewModel categoryViewModel = new CategoryViewModel(category);
        arrayList.add(categoryViewModel);

        arrayListMutableLiveData.setValue(arrayList);


        return arrayListMutableLiveData;
    }


}
