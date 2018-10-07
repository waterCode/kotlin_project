package com.example.zmc.kotlin_project;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by zmc on 2018/10/7.
 */

public class JavaMainAcivity extends AppCompatActivity {
    public Setting setMydata(Something something){
        if(something!=null&&something.getData()!=null){
            Setting setting = something.getData().getSetting();
                if(setting!=null){
                    return setting.setSomeThing();
                }
        }
        return new Setting();
    }
}
