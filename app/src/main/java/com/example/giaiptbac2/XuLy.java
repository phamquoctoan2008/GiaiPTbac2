package com.example.giaiptbac2;

public class XuLy {
    double a, b, c, delta, x1, x2;

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
                return x1;
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
