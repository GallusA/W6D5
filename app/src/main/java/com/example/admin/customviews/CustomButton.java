package com.example.admin.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by gallusawa on 9/8/17.
 */

class CustomButton extends Button{
    private int parentId;
    private int cellId;

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void setParentId(int parentId){
        this.parentId=parentId;
    }

    public void setCellId(int cellId){
        this.cellId=cellId;
    }

    public int getParentId(){
        return this.parentId;
    }

    public int getCellId(){
        return this.cellId;
    }
}
