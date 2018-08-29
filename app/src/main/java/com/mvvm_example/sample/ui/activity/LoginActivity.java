package com.mvvm_example.sample.ui.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.widget.Toast;

import com.mvvm_example.sample.R;
import com.mvvm_example.sample.commands.userLogin;
import com.mvvm_example.sample.databinding.ActivityMainBinding;
import com.mvvm_example.sample.model.User;
import com.mvvm_example.sample.ui.adapter.CustomAdapter;
import com.mvvm_example.sample.viewModel.CategoryViewModel;
import com.mvvm_example.sample.viewModel.LiveDataSample;
import com.mvvm_example.sample.viewModel.UserModel;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;

    private LiveDataSample liveDataSample;

    private CategoryViewModel categoryViewModel;

    private CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel userModel = new UserModel(new User("Enter your email", "Enter your password"));
        activityMainBinding.setLogin(userModel);


        liveDataSample = ViewModelProviders.of(this).get(LiveDataSample.class);
        categoryViewModel = ViewModelProviders.of(this).get(CategoryViewModel.class);

        //LiveData
        liveDataSample.getLiveData();


        categoryViewModel.getArrayListMutableLiveData().observe(this, new Observer<ArrayList<CategoryViewModel>>() {
            @Override
            public void onChanged(@Nullable ArrayList<CategoryViewModel> categoryViewModels) {

                if (categoryViewModels != null) {

                    customAdapter = new CustomAdapter(categoryViewModels, LoginActivity.this);
                    activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(LoginActivity.this));
                    activityMainBinding.recyclerView.setAdapter(customAdapter);

                } else {

                    Toast.makeText(LoginActivity.this, "Something went wrong! ArrayList Null" , Toast.LENGTH_LONG).show();


                }


            }
        });


        activityMainBinding.setUserloginEvent(new userLogin() {
            @Override
            public void onClickLogin() {

                Toast.makeText(LoginActivity.this, "" + activityMainBinding.getLogin().getEmail(), Toast.LENGTH_LONG).show();

            }

            @Override
            public void showData() {

                if (!TextUtils.isEmpty(liveDataSample.getLiveData().getValue().getTicketid()))
                    activityMainBinding.ticketId.setText(liveDataSample.getLiveData().getValue().getTicketid().toString());
                else
                    activityMainBinding.ticketId.setText("Failed");

                if (!TextUtils.isEmpty(liveDataSample.getLiveData().getValue().getTicketname()))
                    activityMainBinding.ticketName.setText(liveDataSample.getLiveData().getValue().getTicketname().toString());
                else
                    activityMainBinding.ticketName.setText("Failed");

                if (!TextUtils.isEmpty(liveDataSample.getLiveData().getValue().getTicketdesc()))
                    activityMainBinding.ticketDesc.setText(liveDataSample.getLiveData().getValue().getTicketdesc().toString());
                else
                    activityMainBinding.ticketDesc.setText("Failed");

            }


        });


    }


}
