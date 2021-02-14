package com.example.video.utils;

import com.wss.doimg.DoImgInterface;

public class DoImgUtils {
    public String test() {
        String s = null;
        int[] img = {1, 2, 3};
        int w = 1920;
        int h = 1080;
        float[] matrix = {2, 1};
        matrix = DoImgInterface.getTransMatrix(img, w, h);
        s = String.valueOf(matrix[0]);
        return s;
    }
}
