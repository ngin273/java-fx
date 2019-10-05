
package exam;

import static java.time.Clock.system;
import java.util.Scanner;


public class Exam {

      public static int  sum (int a,int b){
        return a*b;
    }
      public static int  adj (int a,int b){
        return a-b;
    }
      public static int  div (int a,int b){
        return a+b;
    }
      public static int  ss (int a,int b){
        return a/b;
      }
    
    public static void main(String[] args) {
       
           Scanner scan = new Scanner(System.in);
        int a=3,b=12;
        System.out.println("enter abc ");
          String abc=scan.next();
        
       switch(abc){
           
                    
                    case "*":                    
                        System.out.println(a*b);
    
                        break;
                    case "-":                    
                        System.out.println(a-b);
   
                        break;
                       case "+":                    
                         System.out.println(a+b);             
                        break;
                   case "/":     
                                                   
                        System.out.println(a/b);
                        break;
                        
                        
                        
                        
                        
       }}}