package com.mvvm_example.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {



    @SerializedName("id")
    @Expose
    public String ticketid;

    @SerializedName("name")
    @Expose
    public String ticketname;

    @SerializedName("no_of_seats")
    @Expose
    public String ticketdesc;

    //Default Constructor
    public Ticket() {

    }

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
        /*notifyPropertyChanged(R.id.ticket_id);*/

    }

    public String getTicketname() {
        return ticketname;
    }

    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
        /*notifyPropertyChanged(R.id.ticket_name);*/
    }

    public String getTicketdesc() {
        return ticketdesc;
    }

    public void setTicketdesc(String ticketdesc) {
        this.ticketdesc = ticketdesc;
        /*notifyPropertyChanged(R.id.ticket_desc);*/
    }
}
