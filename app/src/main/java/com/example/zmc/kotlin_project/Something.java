package com.example.zmc.kotlin_project;

import java.util.Set;

/**
 * Created by zmc on 2018/10/7.
 */

public class Something {
    private Data data;
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
class Data{
    Setting setting;

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }
}
class Setting{
    public Setting setSomeThing(){
        //进行一些设置操作
        return this;
    }
}
