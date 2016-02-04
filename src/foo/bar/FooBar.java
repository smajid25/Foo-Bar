package foo.bar;

import java.util.Scanner;

public class FooBar {
    
    static int  f ;
    static int b ;
    static int fb ;
    static int count = 0; 
    
    public static void main(String[] args) {

        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
     
        f = i % 3;
        b = i % 5;
        fb = i % 15;
     
        FooBar test = new FooBar();
        test.foo();
     
        if(count == 0){
            System.out.println(i);
        }
    
    }
    
    public void foo(){
        if(f == 0){
            System.out.println("Foo");
            count = count + 1;
        }if(b == 0){
            System.out.println("Bar");
            count = count + 1;
        }
        if(fb == 0){
            System.out.println("FooBar");
            count = count + 1;
        }
    }

}
