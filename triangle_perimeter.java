package com.test.idea;

import java.util.Scanner;

public class triangle_perimeter {

    private double a;
    private double b;
    private double c;

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

    public triangle_perimeter (double a, double b, double c) {
        if (a < b+c & b < a+c & c < a+b) {
            if (a > Math.abs(b-c) & b > Math.abs(a-c) & c > Math.abs(a-b)) {
                setA(a);
                setB(b);
                setC(c);
            } else throw new RuntimeException("Длина любой стороны треугольника больше модуля разности длин двух других сторон a>|b-c|");
        } else throw new RuntimeException("Длина любой стороны треугольника меньше суммы длин двух других сторон a<b+c");
    }


    public void print() {
        System.out.printf("Треугольник со сторонами: %.2f, %.2f, %.2f\n",
                getA(), getB(), getC());
    }


    public void findPerimeter() {
        double perimeter = getA() + getB() + getC();
        System.out.printf("Периметр треугольника со сторонами: %.2f, %.2f, %.2f равен: %.2f\n",
                getA(), getB(), getC(), perimeter);
    }


    public void findArea() {
        double area = Math.pow((((getA()+getB()+getC())/2)*(((getA()+getB()+getC())/2) - getA())*(((getA()+getB()+getC())/2) - getB())*(((getA()+getB()+getC())/2) - getC())), 0.5);
        System.out.printf("Площадь треугольника со сторонами: %.2f, %.2f, %.2f равна: %.2f\n",
                getA(), getB(), getC(), area);
    }

    public void rectangular() {
        if ((Math.pow(getA(), 2) == Math.pow(getB(), 2) + Math.pow(getC(), 2)) & (Math.pow(getB(), 2) == Math.pow(getC(), 2) + Math.pow(getA(), 2)) & (Math.pow(getC(), 2) == Math.pow(getA(), 2) + Math.pow(getB(), 2))){
            System.out.println("Треугольник прямоугольный");
        }
        else {
            System.out.println("Треугольник непрямоугольный");
        }
    }

    public static void main(String[] args) {
        triangle_perimeter test_triangle = new triangle_perimeter(2, 3, 4);
        test_triangle.findArea();
        test_triangle.findPerimeter();
        test_triangle.rectangular();
    }
}