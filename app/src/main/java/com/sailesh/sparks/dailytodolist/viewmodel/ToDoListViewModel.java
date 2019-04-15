package com.sailesh.sparks.dailytodolist.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.database.Observable;

public class ToDoListViewModel extends ViewModel {
    private Observable<Boolean> helloVisible;

    public Observable<Boolean> getHelloVisible() {
        return helloVisible;
    }
}
