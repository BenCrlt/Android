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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment implements View.OnClickListener {

    private final String TAG = "HELLO";
    private String message = "message par défaut";
    private View root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.root = inflater.inflate(R.layout.fragment_a, container, false);
        ((Button) root.findViewById(R.id.SaveText_btn)).setOnClickListener(this);
        return this.root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.SaveText_btn:
                this.message = ((EditText) root.findViewById(R.id.editmsg)).getText().toString();
                ((TextView)root.findViewById(R.id.msgView)).setText(this.message);
                break;
            default:
                break;
        }
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