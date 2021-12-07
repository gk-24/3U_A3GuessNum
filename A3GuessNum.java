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
    int Userguess = -1; // default guess num.
    
    // Number of tries (K)
  int T = 5;

  // Guess Variable (i) 
  int i, guess;

  for (i = 0; i < T; i++) {   
    System.out.println("Guess a number");
     guess = input.nextInt(); 
  
  // Different situations (if its to high, to low or correct and incorrect)
    if (guess == answer)  {
     System.out.println("Congrats! You are right");
  break; 
    }
     else if (guess < answer && i != T -1) {
    System.out.println(" Too low");
  }
     else if (guess > answer && i != T - 1) {
       System.out.println( "Too High" );
     }
  }
  if (i == T) { 
  System.out.println("You have lost");
  System.out.println( "The number was " + answer);
  } 
  }


  
  

    
  

   // 
    
      
  }// close main

