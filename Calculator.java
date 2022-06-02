/*
Simple calculator using Java and GUI.
Author: Zoe Arnold 
02022022
*/

import java.util.Scanner;
import javax.swing.*;

public class Calculator
{

public static void main(String[] args) 
{


String str1 = "This is a simple Java Calculator";
String operator;
double number1, number2, result;
Scanner console = new Scanner(System.in);


JOptionPane.showMessageDialog(null, str1);
operator = JOptionPane.showInputDialog("Enter the operator");


number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number")); 
number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number")); 

switch (operator) {
	case "+":
	result = number1 + number2;
	String str2 = "The result is: " + result + ".";
	JOptionPane.showMessageDialog(null, str2);
	break;
	
	case "-":
	result = number1 - number2;
	String str3 = "The result is: " + result + ".";
	JOptionPane.showMessageDialog(null, str3);
	break;
	
	case "*":
	result = number1 * number2;
	String str4 = "The result is: " + result + ".";
	JOptionPane.showMessageDialog(null, str4);
	break;

	case "/":
	result = number1 / number2;
	String str5 = "The result is: " + result + ".";
	JOptionPane.showMessageDialog(null, str5);
	break;
	
	case "% ":
	result = number1 % number2;
	String str6 ="The result is: " + result + ".";
	JOptionPane.showMessageDialog(null, str6);
	break;
	
	default:
    String str7 = "Invalid entry. Try again"; 
    JOptionPane.showMessageDialog(null, str7);
  	break;
	}
	
}
}


      