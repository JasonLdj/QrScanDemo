package com.google.zxing;

/**
 * Created by Jsonliang on 2016/11/5.
 */

public final class Dimension {
    private final int width;
    private final int height;

    public Dimension(int width, int height) {
        if(width >= 0 && height >= 0) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean equals(Object other) {
        if(!(other instanceof Dimension)) {
            return false;
        } else {
            Dimension d = (Dimension)other;
            return this.width == d.width && this.height == d.height;
        }
    }

    public int hashCode() {
        return this.width * 32713 + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
