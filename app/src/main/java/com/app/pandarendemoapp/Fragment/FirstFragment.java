package com.app.pandarendemoapp.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.pandarendemoapp.R;

/**
 * Created by Dll HuaiKhwang on 9/11/2560.
 */

public class FirstFragment extends Fragment {

    View mView;

    public FirstFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.viewpager1_layout, container, false);

        return mView;
    }
}
