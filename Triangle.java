package com.test.idea;

import java.util.Scanner;

public class Triangle {

    private double a;
    private double b;
    private double c;
    private double abAngle;
    private double bcAngle;
    private double acAngle;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a>0)
            this.a = a;
        else
            throw new RuntimeException("Не может быть меньше 0 или 0");
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b>0)
            this.b = b;
        else
            throw new RuntimeException("Не может быть меньше 0 или 0");
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c>0)
            this.c = c;
        else
            throw new RuntimeException("Не может быть меньше 0 или 0");
    }

    public double getAbAngle() {
        return abAngle;
    }

    public void setAbAngle(double abAngle) {
        if (abAngle>0)
            this.abAngle = abAngle;
        else
            throw new RuntimeException("Не может быть меньше 0 или 0");
    }

    public double getBcAngle() {
        return bcAngle;
    }

    public void setBcAngle(double bcAngle) {
        if (bcAngle>0)
            this.bcAngle = bcAngle;
        else
            throw new RuntimeException("Не может быть меньше 0 или 0");
    }

    public double getAcAngle() {
        return acAngle;
    }

    public void setAcAngle(double acAngle) {
        if (acAngle>0)
            this.acAngle = acAngle;
        else
            throw new RuntimeException("Не может быть меньше 0 или 0");

    }

    public Triangle(double a, double b, double c, double abAngle, double bcAngle, double acAngle) {
        if (abAngle + bcAngle + acAngle == 180) {
            if (a < b+c & b < a+c & c < a+b) {
                if (a > Math.abs(b-c) & b > Math.abs(a-c) & c > Math.abs(a-b)) {
                    setA(a);
                    setB(b);
                    setC(c);
                    setAbAngle(abAngle);
                    setBcAngle(bcAngle);
                    setAcAngle(acAngle);
                } else throw new RuntimeException("Длина любой стороны треугольника больше модуля разности длин двух других сторон a>|b-c|");
            } else throw new RuntimeException("Длина любой стороны треугольника меньше суммы длин двух других сторон a<b+c");
        } else throw new RuntimeException("Сумма углов треугольника равна 180 градусов");
    }


    public void print() {
        System.out.printf("Треугольник со сторонами: %.2f, %.2f, %.2f c углами: %.2f, %.2f, %.2f\n",
                getA(), getB(), getC(), getAbAngle(), getBcAngle(), getAcAngle());
    }


    public void findPerimeter() {
        double perimeter = getA() + getB() + getC();
        System.out.printf("Периметр треугольника со сторонами: %.2f, %.2f, %.2f c углами: %.2f, %.2f, %.2f равен: %.2f\n",
                getA(), getB(), getC(), getAbAngle(), getBcAngle(), getAcAngle(), perimeter);
    }


    public void findArea() {
        double area = 0.5 * getA() * getB() * Math.sin(getAbAngle());
        System.out.printf("Площадь треугольника со сторонами: %.2f, %.2f, %.2f c углами: %.2f, %.2f, %.2f равна: %.2f\n",
                getA(), getB(), getC(), getAbAngle(), getBcAngle(), getAcAngle(), area);
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2, 3, 4, 90, 30, 60);
        triangle1.findArea();
        triangle1.findPerimeter();
    }
}