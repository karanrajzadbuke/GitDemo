package practice;


public class SwapNumber {

 public static void main(String[] args)
 {
    int a = 10, b=20;
    System.out.println("Before swap :" + a);
    System.out.println("After swap :" +b);
    a = a+b;
    b=a-b;
    a=a-b;
    
    System.out.println("Before swap :" + a);
    System.out.println("After swap :" +b);
    
 }
}
