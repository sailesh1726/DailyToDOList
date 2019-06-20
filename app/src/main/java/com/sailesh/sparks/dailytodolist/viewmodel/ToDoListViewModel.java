package com.sailesh.sparks.dailytodolist.viewmodel;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;

public class ToDoListViewModel extends ViewModel {
    private ObservableBoolean helloVisible = new ObservableBoolean(true);

    public ObservableBoolean getHelloVisible() {
        return helloVisible;
    }

    public void setHelloVisible(boolean helloVisible) {
        this.helloVisible.set(helloVisible);
    }
}
