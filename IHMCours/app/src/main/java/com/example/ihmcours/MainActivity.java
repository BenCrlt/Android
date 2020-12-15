package com.example.ihmcours;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
git
    private static final String TAG = "Hello";
    //private String message = "message par défaut";
    MyViewModel viewModel ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "on create " + getLocalClassName()) ;
        /*
        En utilisant les onSaveInstanceState and onRestoreInstanceState
        if (savedInstanceState != null)
        {
            Log.i(TAG, "on create (on restore instance state " + getLocalClassName()) ;
            this.message = savedInstanceState.getString("message_key") ;
        }
        */
        this.viewModel = new ViewModelProvider(this).get(MyViewModel.class) ;
        this.viewModel.getMessage().observe(this, text -> ((TextView) findViewById(R.id.saveText)).setText(text)) ;
        /* Méthode implicite
        this.viewModel.getMessage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
            }
        }*/
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "on start " + getLocalClassName()) ;
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "on stop " + getLocalClassName()) ;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "on destroy " + getLocalClassName()) ;
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "on pause " + getLocalClassName()) ;
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "on resume " + getLocalClassName()) ;
        //((TextView)findViewById(R.id.textViewValue)).setText(this.message);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "on restart " + getLocalClassName()) ;
    }
    /*
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "on save instance state " + getLocalClassName()) ;
        // Sauvegarde de l'attribut de l'instance dans outState
        outState.putString("message_key", this.message) ;
    }
    */
    /*
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "on restore instance state " + getLocalClassName()) ;
        // Mise dans le message de la sauvegarde de l'attribut de l'instance
        // couple clé + valeur pour un bundle donc la clé est liée directement à la valeur
        // message_key = clé et this.message = value
        this.message = savedInstanceState.getString("message_key") ;
    }
    */
    // Contrôleur de vue
    public void onClickSave(View v)
    {
        /***** Méthode d'appui du bouton Save *****/
        Log.i(TAG, "onClickSave " + getLocalClassName()) ;
        /*
        En utilisant les onSaveInstanceState and onRestoreInstanceState
        // Récupère ce qui a été marqué dans le champ de texte et on le met dans la variable message
        this.message = ((EditText)findViewById(R.id.editText)).getText().toString() ;
        // Ecriture sur le textViewValue le message sauvegardé
        ((TextView)findViewById(R.id.textViewValue)).setText(this.message) ;
        */
        this.viewModel.setMessage(((EditText)findViewById(R.id.editText)).getText().toString());
    }
}
