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


public class ConfigFragment extends Fragment implements ISetListener {

    private IFragmentListener listener;
    private Button btnConfig;

    public ConfigFragment() {
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
        View view = inflater.inflate(R.layout.fragment_config, container, false);
        this.btnConfig = view.findViewById(R.id.btn_config);
        this.btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.moveFragment(new LoginFragment());
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