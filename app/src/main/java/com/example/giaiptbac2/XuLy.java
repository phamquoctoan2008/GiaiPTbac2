package com.example.giaiptbac2;

public class XuLy {
    double delta, x1, x2;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double Giaipt(double a, double b, double c){
        if( a == 0 ){
            if( b == 0 ){
                if( c == 0) {
                    return 0;
                }
                else
                    return -1;

            }
            else
                x1 = -c/b;
                return 1;
        }
        else{
            delta = b*b-4*a*c;
            if(delta < 0){
                return -1;
            }
            if(delta == 0){
                x1 = -b/(2*a);
                return 2;
            }
            if(delta > 0){
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                return 3;
            }
        }
        return 10;
    }

    public double PTvosonghiem (double a, double b, double c){
        if(a == 0 && b ==0 && c == 0)
            return 0;
        return 1;
        }




}
