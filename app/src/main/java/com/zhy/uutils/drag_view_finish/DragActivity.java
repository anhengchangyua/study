package com.zhy.uutils.drag_view_finish;

/**
 * @author zhy
 * @time 2018/1/17 下午4:14
 * @description
 */

import android.app.Activity;
import android.os.Bundle;

import com.zhy.uutils.R;



public class DragActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag);

        DragLayout dragLayout = (DragLayout) findViewById(R.id.dragLayout);

        if(getIntent().getBooleanExtra("horizontal", false)) {
            dragLayout.setDragHorizontal(true);
        }
        if(getIntent().getBooleanExtra("vertical", false)) {
            dragLayout.setDragVertical(true);
        }
        if(getIntent().getBooleanExtra("edge", false)) {
            dragLayout.setDragEdge(true);
        }
        if(getIntent().getBooleanExtra("capture", false)) {
            dragLayout.setDragCapture(true);
        }
    }
}
