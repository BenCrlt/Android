package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentB#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentB extends Fragment {

    private final String TAG = "HELLO";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "On Create " + getClass().getSimpleName());
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "On Start " + getClass().getSimpleName());
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "On Resume " + getClass().getSimpleName());
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "On Pause " + getClass().getSimpleName());
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "On Stop " + getClass().getSimpleName());
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "On Destroy " + getClass().getSimpleName());
        super.onDestroy();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d(TAG, "On Attach " + getClass().getSimpleName());
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "On ActivityCreated " + getClass().getSimpleName());
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "On DestroyView " + getClass().getSimpleName());
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "On Detach " + getClass().getSimpleName());
        super.onDetach();
    }
}