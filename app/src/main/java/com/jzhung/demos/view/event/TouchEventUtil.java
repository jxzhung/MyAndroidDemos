package com.jzhung.demos.view.event;

/**
 * Created by Jzhung on 2016/7/29.
 */
public class TouchEventUtil {
    public static String getEvent(int action){
        switch (action){
            case 0:
                return "按下";
            case 1:
                return "抬起";
            case 2:
                return "移动";
            case 3:
                return "取消";
            default:
                return "未知";
        }
    }
}
