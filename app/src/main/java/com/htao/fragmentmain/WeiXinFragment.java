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
public class WeiXinFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weixin_layout, null);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.i("test","WeiXinFragment:visible:"+getUserVisibleHint());
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if(hidden){
            Log.i("test","WeiXinFragment:hidder"+hidden);
        }else{
            Log.i("test","WeiXinFragment:hidder"+hidden);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("test","weixinfragment:"+"oncreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("test","weixinfragment:"+"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("test","weixinfragment:"+"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("test","weixinfragment:"+"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("test","weixinfragment:"+"onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("test","weixinfragment:"+"onDestroy");
    }
}
