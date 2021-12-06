/*
*Name: Gurtaj Kaler
*Date: November 23, 2021
*Desription: Guess the number assignment 
*/

import java.util.*;

public class A3GuessNum{
  
  
  //main method
  public static void main(String[] arg){
    // Make a scanner and Random Object.
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    // Generate a random number from 0-100.
    int answer = numGenerator.nextInt(101);
    int guess = -1; // default guess num.
    
    System.out.println("Guess a number");
     guess = input.nextInt(); 
  
  // Variables 
    if (guess == answer)  {
     System.out.println("Correct answer!");
     
 break; 
     else if (guess < answer && i != k -1)
    System.out.println("Wrong answer");
  }

  // Number of tries (T)
  int k = 5;

  // Guess Variable 
  int i, guess;
  }

  
  

    
  

   // 
    
      
  }// close main

