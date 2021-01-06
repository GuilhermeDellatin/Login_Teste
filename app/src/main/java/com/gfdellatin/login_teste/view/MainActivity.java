package com.gfdellatin.login_teste.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.gfdellatin.login_teste.R;
import com.gfdellatin.login_teste.view.fragment.ConfigFragment;
import com.gfdellatin.login_teste.view.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = new LoginFragment();
        int i = 1;
        if (i == 2) fragment = new ConfigFragment();
        if(fragment instanceof ConfigFragment){
            System.out.println("config");
        } else {
            System.out.println("login");
        }
        fragmentTransaction.add(R.id.main_fragment, fragment);
        fragmentTransaction.commit();

    }
/*
    @Override
    protected void onStart() {
        super.onStart();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = new LoginFragment();
        int i = 1;
        if (i == 2) fragment = new ConfigFragment();
        fragmentTransaction.add(R.id.main_fragment, fragment);
        fragmentTransaction.commit();
    }*/
}