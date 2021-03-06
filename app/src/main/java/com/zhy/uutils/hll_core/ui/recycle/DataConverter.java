package com.zhy.uutils.hll_core.ui.recycle;

import java.util.ArrayList;

/**
 * Created by wanyummy on 2017/8/7.
 * 第一步创建dataconverter
 */

public abstract class DataConverter {
    //1 数据集合创建
    protected final ArrayList<MultipleItemEntity> ENTITIES = new ArrayList<>();
    private String mJsonData = null;

    //2 对外提供方法
    public abstract ArrayList<MultipleItemEntity> convert();

    public DataConverter setJsonData(String json) {
        this.mJsonData = json;
        return this;
    }

    public String getJsonData() {
        if (mJsonData == null || mJsonData.isEmpty()) {
            throw new NullPointerException("DATA IS NULL!");
        }
        return mJsonData;
    }

}