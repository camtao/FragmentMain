package com.htao.fragmentmain;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Bind(R.id.fra_content) FrameLayout fraContent;
    @Bind(R.id.tab_1_iv) ImageView tab1Iv;
    @Bind(R.id.tab_1_tv) TextView tab1Tv;
    @Bind(R.id.tab_1) LinearLayout tab1;
    @Bind(R.id.tab_2_iv) ImageView tab2Iv;
    @Bind(R.id.tab_2_tv) TextView tab2Tv;
    @Bind(R.id.tab_2) LinearLayout tab2;
    @Bind(R.id.tab_3_iv) ImageView tab3Iv;
    @Bind(R.id.tab_3_tv) TextView tab3Tv;
    @Bind(R.id.tab_3) LinearLayout tab3;
    @Bind(R.id.tab_4_iv) ImageView tab4Iv;
    @Bind(R.id.tab_4_tv) TextView tab4Tv;
    @Bind(R.id.tab_4) LinearLayout tab4;
    private WeiXinFragment weiXinFragment;
    private FriendFragment friendFragment;
    private AddressFragment addressFragment;
    private SettingFragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSelecte(0);
    }

    @OnClick({R.id.tab_1, R.id.tab_2, R.id.tab_3, R.id.tab_4})
    public void onClick(View view) {
        //重置tab图片
        setImageResource();
        switch (view.getId()) {
            case R.id.tab_1:
                setSelecte(0);
                break;
            case R.id.tab_2:
                setSelecte(1);
                break;
            case R.id.tab_3:
                setSelecte(2);
                break;
            case R.id.tab_4:
                setSelecte(3);
                break;
            default:
                break;
        }
    }

    private void setImageResource() {
        tab1Iv.setImageResource(R.drawable.tab_weixin_normal);
        tab2Iv.setImageResource(R.drawable.tab_find_frd_normal);
        tab3Iv.setImageResource(R.drawable.tab_address_normal);
        tab4Iv.setImageResource(R.drawable.tab_settings_normal);
        tab1Tv.setTextColor(Color.BLACK);
        tab2Tv.setTextColor(Color.BLACK);
        tab3Tv.setTextColor(Color.BLACK);
        tab4Tv.setTextColor(Color.BLACK);
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (weiXinFragment != null) {
            transaction.hide(weiXinFragment);
        }
        if (friendFragment != null) {
            transaction.hide(friendFragment);
        }
        if (addressFragment != null) {
            transaction.hide(addressFragment);
        }
        if (settingFragment != null) {
            transaction.hide(settingFragment);
        }
    }

    public void setSelecte(int selecte) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideFragment(transaction);
        switch (selecte) {
            case 0:
                if (weiXinFragment == null) {
                    weiXinFragment = new WeiXinFragment();
                    transaction.add(R.id.fra_content, weiXinFragment);
                } else {
                    transaction.show(weiXinFragment);
                }
                tab1Iv.setImageResource(R.drawable.tab_weixin_pressed);
                tab1Tv.setTextColor(Color.GREEN);
                break;
            case 1:
                if (friendFragment == null) {
                    friendFragment = new FriendFragment();
                    transaction.add(R.id.fra_content, friendFragment);
                } else {
                    transaction.show(friendFragment);
                }
                tab2Iv.setImageResource(R.drawable.tab_find_frd_pressed);
                tab2Tv.setTextColor(Color.GREEN);
                break;
            case 2:
                if (addressFragment == null) {
                    addressFragment = new AddressFragment();
                    transaction.add(R.id.fra_content, addressFragment);
                } else {
                    transaction.show(addressFragment);
                }
                tab3Iv.setImageResource(R.drawable.tab_address_pressed);
                tab3Tv.setTextColor(Color.GREEN);
                break;
            case 3:
                if (settingFragment == null) {
                    settingFragment = new SettingFragment();
                    transaction.add(R.id.fra_content, settingFragment);
                } else {
                    transaction.show(settingFragment);
                }
                tab4Iv.setImageResource(R.drawable.tab_settings_pressed);
                tab4Tv.setTextColor(Color.GREEN);
                break;
            default:
                break;
        }
        transaction.commit();
    }
}
