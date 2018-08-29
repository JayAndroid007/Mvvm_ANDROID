package com.mvvm_example.sample.viewModel;

import android.databinding.BaseObservable;
import android.support.v7.widget.RecyclerView;

import com.mvvm_example.sample.R;

public class BindModel extends BaseObservable {

    private String ticket_id,ticket_name,ticket_desc;
    private String ticketidHint,ticketnameHint,ticketdescHint;
    private RecyclerView recyclerView;

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        notifyPropertyChanged(R.id.recyclerView);
    }

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
        notifyPropertyChanged(R.id.ticket_id);
    }

    public String getTicket_name() {
        return ticket_name;
    }

    public void setTicket_name(String ticket_name) {
        this.ticket_name = ticket_name;
        notifyPropertyChanged(R.id.ticket_name);
    }

    public String getTicket_desc() {
        return ticket_desc;
    }

    public void setTicket_desc(String ticket_desc) {
        this.ticket_desc = ticket_desc;
        notifyPropertyChanged(R.id.ticket_desc);
    }
}
