package com.example.ihmcours;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

        private final String TAG = "Hello";

        private MutableLiveData<String> message =new MutableLiveData<>();
        // Méthode pour avoir le message
        public LiveData<String> getMessage()
        {
            return message ;
        }
        // Méthode pour modifier le message
        public void setMessage(String text)
        {
            message.setValue(text) ;
        }

        @Override
        protected void onCleared() {
                super.onCleared();
                Log.d(TAG, "On Cleared ViewModel " + this.getClass().getSimpleName());
        }
}
