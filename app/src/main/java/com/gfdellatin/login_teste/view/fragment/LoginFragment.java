package com.gfdellatin.login_teste.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gfdellatin.login_teste.R;
import com.gfdellatin.login_teste.view.IFragmentListener;
import com.gfdellatin.login_teste.view.ISetListener;

public class LoginFragment extends Fragment implements ISetListener {

    private IFragmentListener listener;
    private Button btnLogin;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        this.btnLogin = view.findViewById(R.id.btn_login);
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.moveActivity();
                }
            }
        });
        return view;
    }

    @Override
    public void setListener(IFragmentListener listener) {
        this.listener = listener;
    }
}