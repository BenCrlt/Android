package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "HELLO";

    FragmentManager fm  = getSupportFragmentManager();
    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentC fragmentC;

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "On Create " + getClass().getSimpleName());
        setContentView(R.layout.activity_main);

        /*this.fragmentA = new FragmentA();
        this.fragmentB = new FragmentB();
        this.fragmentC = new FragmentC();*/

        navController = Navigation.findNavController(this, R.id.navcontainer);
    }

    public void OnClickFragmentA(View v) {
        /*if (fm.findFragmentById(R.id.fragmentcontainer) != fragmentA) {
            fm.popBackStackImmediate();
            fm.beginTransaction().replace(R.id.fragmentcontainer, fragmentA).addToBackStack(null).commit();
        }*/
        navController.popBackStack(navController.getGraph().getStartDestination(), false);
        navController.navigate(R.id.fragmentA);
    }

    public void onClickFragmentB(View v) {
        /*if (fm.findFragmentById(R.id.fragmentcontainer) != fragmentB) {
            fm.popBackStackImmediate();
            fm.beginTransaction().replace(R.id.fragmentcontainer, fragmentB).addToBackStack(null).commit();
        }*/
        navController.popBackStack(navController.getGraph().getStartDestination(), false);
        navController.navigate(R.id.fragmentB);
    }

    public void onClickFragmentC(View v) {
        /*if (fm.findFragmentById(R.id.fragmentcontainer) != fragmentC) {
            fm.popBackStackImmediate();
            fm.beginTransaction().replace(R.id.fragmentcontainer, fragmentC).addToBackStack(null).commit();
        }*/
        navController.popBackStack(navController.getGraph().getStartDestination(), false);
        navController.navigate(R.id.fragmentC);
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
}