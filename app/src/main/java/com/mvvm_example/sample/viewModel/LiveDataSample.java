package com.mvvm_example.sample.viewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.mvvm_example.sample.model.Ticket;
import com.mvvm_example.sample.remote.RetroClass;

public class LiveDataSample extends ViewModel {


    private Ticket ticket;
    private RetroClass retroClass = new RetroClass();

    private LiveData<Ticket> liveData;


    //LiveData
    public LiveData<Ticket> getLiveData() {
        if (liveData == null) {

            liveData = retroClass.getLiveData();

        }

        return liveData;
    }


}
