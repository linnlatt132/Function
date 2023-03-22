import javax.swing.*;
import java.awt.*;
public class FunctionVoid{

public static void Plus(){
int a =7;
int b=9;
int c= a+b;
System.out.println(a+" + "+b+" = "+c);
}
public static void Minus(){
int a =12;
int b=8;
int c= a-b;
System.out.println(a+" - "+b+" = "+c);

}
public static void Multiple(){
int a =6;
int b=3;
int c= a*b;
System.out.println(a+" * "+b+" = "+c);

}
public static void main(String[]args){
String s;
int n;

System.out.println("Menu: (1)Plus , (2)Minus, (3)Multiple ");
s=JOptionPane.showInputDialog("Enter number from menu");
n=Integer.parseInt(s);
System.out.println("Enter number: "+n);
if(n==1){
Plus();
}
else if(n==2){
Minus();
}
else if(n==3){
Multiple();
}
else{
System.out.println("Somethings wrong....");
}
}

}