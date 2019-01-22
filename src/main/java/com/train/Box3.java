package com.train;

public class Box3 implements Validate{
    public static Box3 instance;
    private float length = 23f;
    private float width = 14f;
    private int height = 13;

    @Override
    public boolean validate(float length, float width, int height) {
        if (this.length >= length && this.width >= width && this.height >= height) {
            return true;
        } else {
            return false;
        }
    }

    public static Box3 getInstance() {
        if (instance == null) {
            instance = new Box3();
            return instance;
        }
        return instance;
    }
}
