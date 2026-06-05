11.Write a program to illustrate the function of Overloading or method Overloading in java.

class Shapes {

public void area() {

System.out.println("Find Area :");

public void area(int r){

System.out.println("Circle Area:"+3.14*r*r);

}

public void area(double b, double h){

System.out.println("Triangle Area:"+0.5*b*h); }

public void area(int I, int b){ System.out.println("Rectangle Area:"+l*b); }

}

public class Main {

public static void main(String args[]){

Shapes myshape new

Shapes(); myshape.area();

myshape.area(5); myshape.area(6.0,1.2);

myshape.area(6,2);

Output: -

}}
