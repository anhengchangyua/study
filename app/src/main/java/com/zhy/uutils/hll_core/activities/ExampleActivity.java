package com.zhy.uutils.hll_core.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.zhy.uutils.hll_core.delegates.HLDelegate;

/**
 * Created by wanyummy on 2017/7/10.
 */

public class ExampleActivity extends ProxyActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏掉actionbar
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

    }

    @Override
    public HLDelegate setRootDelegate() {
        return null;
    }


}
