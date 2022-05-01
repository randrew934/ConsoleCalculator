package consolecalculator;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ral
 */
public class help {
 
    public help(){}
    public void opt(){//method opt that will display option
        System.out.println(" ");
        System.out.println("WELCOME TO CONSOLE CALCULATOR" +'\n' + "Console Code" + '\n' + 
                "s = Simple Operation	a = Advanced Operation" +'\n' + "n = Numerical Operation	h = Help" +
                '\n'+"x = Exit"+'\n' );//Welcome message
    }
    //Method h that will display the manual in console
    public void h(){
        System.out.println('\n'+ "Console Calculator Manual" +'\n' + "Console Code" + '\n' + 
                "s = Simple Operation	a = Advanced Operation" +'\n' + "n = Numerical Operation	h = Help" +
                '\n'+"x = Exit"+'\n'+ '\n'+
                "**Function**" + '\n' +
                "Equals to = eq(Note: not = or ==, works only in simple and advanced operation)" +'\n'+'\n'+
      "**Simple Operation**" +'\n'+ 
                "Addition = +		Subtraction = -" +'\n'+
                "Division = /		Multiplication = *"+'\n'+
                "Square = ^2		Cube = ^3"+'\n'+
                "Power = ^p		Square root = sq"+'\n'+
                "Exponential = e"+'\n'+'\n'+
                
                "**Advanced Operation**" +'\n'+
                "Pie = pi		Percentage = %" +'\n'+
                "Modulus = d		Atan = atan"+'\n'+
                "Round = r		Floor = f"+'\n'+
                "Ceiling = c		Min Value = mi"+'\n'+
                "Max Value = ma		Sin = sin"+'\n'+
                "Cos  = cos		Tan = tan"+'\n'+
                "Asin = asin		Acos = acos"+'\n'+'\n'+
     
                 "**Numerical Operation**" +'\n'+
                 "Palindrome = pd		Armstrong number = an"+'\n'+
                 "Average = av            LCM = l" +'\n'+
                 "Prime number = pn	GCD = g"+'\n'+'\n'+
                "***Help manual can be accessed in every operator by typing 'h'***"+'\n'+
                "***Numerical Operation takes only integer values***"+'\n'+'\n'
   
                );
    }
   
      
    }
    

