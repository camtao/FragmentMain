package com.htao.fragmentmain;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 10607 on 2016/5/15.
 */
public class AddressFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.address_layout,null);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.i("test","AddressFragment:visible:"+getUserVisibleHint());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("test","AddressFragment:"+"onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("test","AddressFragment:"+"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("test","AddressFragment:"+"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("test","AddressFragment:"+"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("test","AddressFragment:"+"onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("test","AddressFragment:"+"onDestroy");
    }
}
