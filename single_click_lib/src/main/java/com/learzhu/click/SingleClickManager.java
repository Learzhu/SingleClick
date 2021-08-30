package com.learzhu.click;

/**
 * SingleClickManager.java 是本库的设置类。
 *
 * @author Learzhu
 * @version 1.8.2.0 2021/8/30 16:09
 * @update learzhu 2021/8/30 16:09
 * @updateDes
 * @include {@link }
 * @used {@link }
 * @goto {@link }
 */
public class SingleClickManager {
    /**
     * 默认的点击时间间隔
     */
    static int clickInterval = 500;

    private SingleClickManager() {
    }

    /**
     * 设置全局点击事件防重间隔
     *
     * @param clickIntervalMillis 间隔毫秒值
     */
    public static void setClickInterval(int clickIntervalMillis) {
        clickInterval = clickIntervalMillis;
    }

}
