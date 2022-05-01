/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolecalculator;

import java.util.Scanner; //Input Package//
import java.math.*; //Math Package
import java.lang.*; //Lang package
import java.awt.*; //Awt package
import java.util.InputMismatchException;//Input error package
/**
 *
 * @author Ral
 */
public class ConsoleCalculator {

    /**
     * @param args the command line arguments
     */
    static int armstrongOrNot(int num)//A static method for calculating armstrong value
{
	int x,a=0;
	while(num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
	}
	return a;
}
    
    public static void main(String[] args) {
        
      
        // Declaring Variables
        Double firstval, secondval, thirdval, result, boundary=99999999999999.999999999;//Boundary for the highest value that can be given as a result or inputted
        String option, op, rs;
        final double pi= 22/7;//A final value for pi
        
        Scanner scan=new Scanner(System.in); //create the scanner//
        //creating a do-while loop for the program//
        do{
           help hel=new help();//Create an object
        hel.opt();////Invoking a method from another class to display option
        
        System.out.print("Console Code: ");//To input for the option menu
        option=scan.next();//Accepts values "s,a,n,h, and x" for option menu
        
        //Created a label val for break statement to the option menu
        val : { 
             try{ //Try catch to prevent the program for breaking out due to error
        switch(option){
            case "h": //To Display The Manual In The Console
                
                hel.h();//Invoking a method from another class to display manual
                break;
                
                 
            case "s": //To Display Simple Operation
                System.out.print("Value:  ");//To Input First Value
        firstval=scan.nextDouble(); 
        
                //The while loop is to keep looping until it has reached it's boundary
               while(firstval<=boundary){
       System.out.print("operator: ");//To ask for operator
                op= scan.next();
                //Label pow to excape without asking for the second value
                pow : {
        //if statement for eq that will display the final result and break to Welcome TO CONSOLE CALCULATOR
                if(!op.contains("eq"))
                {
                    if(op.contains("^2")){
                 firstval= Math.pow(firstval, 2);//For square operation
                    System.out.println("Result: "+firstval);//To display result
                    break pow;
                    
                    }else if(op.contains("^3")){
                       firstval= Math.pow(firstval, 3);//For cube operation
                    System.out.println("Result: "+firstval);//To display result
                    break pow; 
                    }
                    
                    else if(op.contains("sq")){
                       firstval= Math.sqrt(firstval);//For square root operation
                    System.out.println("Result: "+firstval);//To display result
                    break pow; 
                    }
                    else if(op.contains("e")){
                       firstval= Math.exp(firstval);//For exponential operation
                    System.out.println("Result: "+firstval);//To display result
                    break pow; 
                    }
                     else if(op.contains("h")){
                    hel.h();//Invoking a method from another class to display manual
                break pow;
    
                    }
                    
                System.out.print("Value 2:  ");//To ask for the second value
                secondval=scan.nextDouble();
                
                //if statement for the +, -, /, * operators
                if(op.contains("+")){
                    
                firstval= firstval + secondval; //Addition operation
                
               System.out.println("Result: "+firstval);//To display result
                    
                
                }else if(op.contains("-")){
                    firstval= firstval - secondval; //Subtraction operation
                    System.out.println("Result: "+firstval);//To display result
                }
                else if(op.contains("/")){
                    firstval= firstval / secondval;//Division operation
                    System.out.println("Result: "+firstval);//To display result
                }
                else if(op.contains("*")){
                    firstval= firstval * secondval;//Multiplication operation
                    System.out.println("Result: "+firstval);//To display result
                   
                }else if(op.contains("d")){
                            firstval= firstval % secondval;//Modulus operation
                            System.out.println("Result: "+firstval);//To display result for Modulus operation
                           }
                 else if(op.contains("^p")){
                       firstval= Math.pow(firstval, secondval);//For power operation
                    System.out.println("Result: "+firstval);//To display result
                    break pow; 
                    }
                
               else{
                     System.out.println("Enter the valid operators"+'n'+ "type h to find out more");//for errors in the operator
                }
                
               }else if (op.contains("eq")){
                    
                     System.out.println("Result: "+firstval);//To display final result before returning back to Welcome TO Console
                     
                    break val;
               }
      
               }
        }
               System.out.println("Exceeded Bound Value");//If the value exceed bound value;
               break;
               
               
            case "a" : //To display advanced operations
                 
                System.out.print("Value:  ");//To Input First Value
        firstval=scan.nextDouble();
        
                //The while loop is to keep looping until it has reached it's boundary
               while(firstval<=boundary){
                   
                   System.out.print("operator: ");//To ask for operator
                  rs= scan.next();
                
                  //A Label esc to break without asking for second value
                  
                  esc :{
                      
                      if(!rs.contains("eq"))
                      {
                        if(rs.contains("pi")){
                 firstval= firstval * pi;//For pi operation
                    System.out.println("Result: "+firstval);//To display value multiplying pie value result
                    break esc;
               }
                    else if(rs.contains("%")){
                       firstval= firstval / 100;//For percentage operation
                    System.out.println("Result: "+firstval);//To display result
                    break esc; 
                    }
                    else if(rs.contains("r")){          
                    System.out.println("Result: "+Math.round(firstval));//To temporarily round the figure
                    break esc; 
                    }
                    else if(rs.contains("f")){      
                        firstval= Math.floor(firstval);
                    System.out.println("Result: "+firstval);//To display result for floor operation
                    break esc; 
                    
                        } else if(rs.contains("c")){
                        firstval= Math.ceil(firstval);
                    System.out.println("Result: "+firstval);//To display result for ceiling operation
                    break esc; 
                    
                         } else if(rs.contains("cos")){
                              firstval = Math.toRadians(firstval);//convert value to radians first
                              firstval= Math.cos(firstval);//convert to cos
                    System.out.println("Result: "+firstval);//To display result for cos operation
                    break esc; 
                    }
                      else if(rs.contains("sin")){
                              firstval = Math.toRadians(firstval);//convert value to radians first
                              firstval= Math.sin(firstval);//convert to sin
                    System.out.println("Result: "+firstval);//To display result for cos operation
                    break esc; 
                    }
                      else if(rs.contains("tan")){
                              firstval = Math.toRadians(firstval);//convert value to radians first
                              firstval= Math.tan(firstval);//convert to tan
                    System.out.println("Result: "+firstval);//To display result for cos operation
                    break esc; 
                    }
                       else if(rs.contains("acos")){
                              firstval = Math.toRadians(firstval);//convert value to radians first
                              firstval= Math.acos(firstval);//convert to acos
                    System.out.println("Result: "+firstval);//To display result for cos operation
                    break esc; 
                    }
                        else if(rs.contains("atan")){
                              firstval = Math.toRadians(firstval);//convert value to radians first
                              firstval= Math.atan(firstval);//convert to atan
                    System.out.println("Result: "+firstval);//To display result for cos operation
                    break esc; 
                    }
                         else if(rs.contains("asin")){
                              firstval = Math.toRadians(firstval);//convert value to radians first
                              firstval= Math.asin(firstval);//convert to asin
                    System.out.println("Result: "+firstval);//To display result for cos operation
                    break esc; 
                    }
                   
                    
                        else if(rs.contains("%")){
                       firstval= firstval / 100;//For square root operation
                    System.out.println("Result: "+firstval);//To display result
                    break esc;      
                      }else if(rs.contains("h")){
                    hel.h();//Invoking a method from another class to display manual
                    break esc; 
             }
                        
                             System.out.print("Value 2:  ");//To ask for the second value
                              thirdval=scan.nextDouble();
                        
                        if(rs.contains("mi")){
                            firstval = Math.min(firstval, thirdval);//For finding the minimum values entered
                            System.out.println("Result: "+firstval);//To display result for Minimum value operation
                            
                        }else if(rs.contains("ma")){
                            firstval = Math.max(firstval, thirdval);//For maximum value operation
                            System.out.println("Result: "+firstval);//To display result for Maximum value operation
                            
                        } else{
                     System.out.println("Enter the valid operators"+'n'+ "type h to find out more");//for errors in the operator
                }
                      }else if (rs.contains("eq")){
                    
                     System.out.println("Result: "+firstval);//To display final result before returning back to Welcome TO Console
                     
                    break val;
               }          
                     }
                   }
                System.out.println("Exceeded Bound Value");//If the value exceed bound value;
                break;
                
                
                
            case "n":
               
                     System.out.print("operator: ");//To ask for operator
                     rs= scan.next();
                     
         if(rs.contains("pd")){ /*For Palindrome*/
                      int j;
             System.out.print("Enter value: ");
     int st = scan.nextInt(); //reads palindrome value entered as a string
   String str=Integer.toString(st);//to change value to string
 String reverse = ""; //Initializing the reverse variable
 
  if(str.length()>2){ //An if-else statement to make sure the digit number entered should be atleast three
         /*To check if the number is a prime number*/
          int m=st/2; //To check first if it is divisible by two     
  
  if(st==0||st==1 || st==2){  //Second condition, One and Zero are not prime numbers
   System.out.println(st+" is not prime number");      
  }else{  
      
   for(j=2;j<=m;j++){     //For loop to check prime numbers  
    if(st%j==0){  //If statement to check for if the remainder is equal to zero    
     System.out.println(st+" is not prime number"); 
     
     break; 
    }else {
        System.out.println(st+" is prime number");
    }  
    break;
   } 
  }
       
        for(int i = str.length() - 1; i >= 0; i--)/*A for loop for reversing the value entered*/
        {
            reverse = reverse + str.charAt(i);
            
        }
        //An if statement to display if the value entered is equal to the reverse or not
        if(str.equals(reverse)){
             System.out.println(str+ " is a palindrome");
             
        }else{
             System.out.println(str+ " is not a palindrome");   
        }  
        }else{
          System.out.println("Digit number should be atleast three");
        }
        
                    }else if (rs.contains("an")){/*For Armstrong number*/
                        int arm;
 System.out.println("Enter value: ");
   int df=scan.nextInt();
   
   arm=armstrongOrNot(df);//invoking a method for calculating armstrong number
    //An if statement to display if the value entered is an armstrong number or not or not
	if(arm==df){
	System.out.println(df+" is an armstrong number");
        }else{
            
            System.out.println(df+" is not an armstrong numeber");
        }
                     
                    }else if(rs.contains("av")){//For average operation
                     /* Declaring array of n elements, the value of n is provided by the user */    
        System.out.println("nth value: ");
      int n = scan.nextInt();
        double[] arr = new double[n];
        double total = 0;
       
     for(int i=0; i<arr.length; i++){ //A for loop to store array elements
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = scan.nextDouble();
        }
        scan.close(); //To close the scanner after the nth value is reached
        for(int i=0; i<arr.length; i++){
            //To sum the array elements and divide by the nth value
        total = total + arr[i]; 
     Double average = total / arr.length;
        
        System.out.format("The average is: %.3f", average);      
                   
                    }
        
                    }else if(rs.contains("l")){ //For LCM operation
                        int n1, n2, lcm; //declaring int values
        // maximum number between n1 and n2 is stored in lcm
        System.out.print("Value: "); //To enter value one
        n1 = scan.nextInt();
        System.out.print("Value: "); //TO enter value two
        n2 = scan.nextInt();
        
        lcm = (n1 > n2) ? n1 : n2; //A ternary operation for finding LCM 
       
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )//if statement checks if the LCM can be divided by the entered values 
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm; //A pre-increment for the LCM
        }
                    }else if(rs.contains("pn")){ //for prime number operation
                        int i;      
System.out.print("Value: "); //To enter value 
        int n = scan.nextInt();
  int m=n/2; //To check first if it is divisible by two     
  
  if(n==0||n==1 || n==2){  //Second condition, One and Zero are not prime numbers
   System.out.println(n+" is not a prime number");      
  }else{  
      
   for(i=2;i<=m;i++){     //For loop to check prime numbers  
    if(n%i==0){  //If statement to check for if the remainder is equal to zero    
     System.out.println(n+" is not a prime number"); 
     
     break; 
    }else {
        System.out.println(n+" is a prime number");
    }  
    break;
   }      
  }     
                    }else if(rs.contains("g")){//for GCD operation
                        int n1, n2, gcd; //declaring int values
        // maximum number between n1 and n2 is stored in gcd
        System.out.print("Value: "); //To enter value one
        n1 = scan.nextInt();
        System.out.print("Value: "); //TO enter value two
        n2 = scan.nextInt();
                  gcd = (n1 > n2) ? n1 : n2; //A ternary operation for finding GCD 
       
        while(true)
        {
            if( n1 % gcd == 0 && n2 % gcd == 0 )//if statement checks if the the entered values can be divided by GCD
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, gcd);
                break;
            }
            ++gcd; //A pre-increment for the GCD
        }      
                        
                    }else if(rs.contains("h")){
                    hel.h();//Invoking a method from another class to display manual
                break;
    
                    }
                    
                    else{
                    System.out.println("Enter the valid operators"+'n'+ "type h to find out more");//for errors in the operator
               }
                     break;
         }
        }catch(InputMismatchException e){
            System.out.println("Input numerical value");  
        }
        }
        
        }
        
        while(!option.equals("x"));//For the exit button
        
        }
}
