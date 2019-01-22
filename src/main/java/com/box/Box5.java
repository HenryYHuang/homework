package com.box;

import com.train.Validate;

public class Box5 implements Validate {
    public static Box5 instance;
    private static float length = 39.5f;
    private static float width = 27.5f;
    private static int height = 23;


    @Override
    public boolean validate(float length, float width, int height) {
        if (this.length >= length && this.width >= width && this.height >= height) {
            return true;
        } else {
            return false;
        }
    }

    public static Box5 getInstance() {
        if (instance == null) {
            instance = new Box5();
            return instance;
        }
        return instance;
    }
}
