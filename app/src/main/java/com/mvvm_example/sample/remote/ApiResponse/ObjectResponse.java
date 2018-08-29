package com.mvvm_example.sample.remote.ApiResponse;

/**
 * Created by nits-34 on 20/6/18.
 */

public class ObjectResponse<T> extends GenResponse {
    private T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}




