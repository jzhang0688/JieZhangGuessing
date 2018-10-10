package com.company;
import java.util.Scanner;

public class ScannerGuess
{

    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      double numdouble = Math.random();
      int randomnum = (int) (numdouble * 11);
      System.out.println("Guess the number between 0 and 10: ");
      int num = input.nextInt();
      while (!(num == randomnum))
        {
            System.out.println("Guess Again");
            num = input.nextInt();
        }
        System.out.println("You got it right!");
    }
}

