package com.gfdellatin.login_teste.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.gfdellatin.login_teste.R;
import com.gfdellatin.login_teste.view.fragment.ConfigFragment;
import com.gfdellatin.login_teste.view.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity implements IFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //direcionaTela();
        /*
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = new LoginFragment();
        int i = 3;
        if (i == 2) fragment = new ConfigFragment();
        if (i == 3) {
            Intent intent = new Intent(getApplicationContext(), ActivityAleatoria.class);
            startActivity(intent);
        }
        if(fragment instanceof ConfigFragment){
            System.out.println("config");
        } else {
            System.out.println("login");
        }
        fragmentTransaction.add(R.id.main_fragment, fragment);
        fragmentTransaction.commit();
*/
        int i = 2;
        if (i == 2) {
            moveFragment(new ConfigFragment());
        }
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
/*
    public void direcionaTela() {


        Fragment fragment = new Fragment();
        int i = 3;
        if (i == 1) fragment= new LoginFragment();
        if (i == 2) fragment = new ConfigFragment();
        if (i == 3) {
            Intent intent = new Intent(getApplicationContext(), ActivityAleatoria.class);
            startActivity(intent);
        }
        if(fragment instanceof ConfigFragment){
            System.out.println("config");
        } else {
            System.out.println("login");
        }

    }*/

    @Override
    public void moveFragment(Fragment fragment) {

        if (fragment instanceof ISetListener) ((ISetListener) fragment).setListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.add(R.id.main_fragment, fragment);
        fragmentTransaction.replace(R.id.main_fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void moveActivity() {
        Intent intent = new Intent(getApplicationContext(), ActivityAleatoria.class);
        startActivity(intent);
    }
}