package com.a.bntest.ui.first;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirstViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    
    public FirstViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("first fragment");
    }
    
    public LiveData<String> getText() {
        return mText;
    }
}