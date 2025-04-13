package com.example.photoshop;

import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
public class Pixel {
    private int x;
    private int y;
    private double r;
    private double g;
    private double b;


    public Pixel(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.r = color.getRed();
        this.g = color.getGreen();
        this.b = color.getBlue();
    }


    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public double getRed() {
        return r;
    }
    public double getGreen() {
        return g;
    }
    public double getBlue() {
        return b;
    }


    public void setRed(double r) {
        this.r = clamp(r);
    }
    public void setGreen(double g) {
        this.g = clamp(g);
    }
    public void setBlue(double b) {
        this.b = clamp(b);
    }


    private double clamp(double value) {
        return Math.max(0.0, Math.min(1.0, value));
    }

    public Color toColor() {
        return new Color(r, g, b, 1.0);
    }
}
