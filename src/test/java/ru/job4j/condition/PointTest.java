package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point one = new Point(0, 0);
        Point two = new Point(0, 2);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to24then2() {
        double expected = 4;
        Point one = new Point(2, 0);
        Point two = new Point(2, 4);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to33then2dot83() {
        double expected = 2.83;
        Point one = new Point(1, 1);
        Point two = new Point(3, 3);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to00then2dot83() {
        double expected = 2.83;
        Point one = new Point(2, 2);
        Point two = new Point(0, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to200then2() {
        double expected = 2;
        Point one = new Point(0, 0, 0);
        Point two = new Point(2, 0, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111then1p414() {
        double expected = 1.414;
        Point one = new Point(0, 0, 0);
        Point two = new Point(1, 1, 1);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.001);
    }
}