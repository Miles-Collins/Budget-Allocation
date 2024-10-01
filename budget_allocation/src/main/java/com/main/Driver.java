package com.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {
      System.out.println("How much can you spend?");
      Scanner scan = new Scanner(System.in);
      Double total = scan.nextDouble();
      Double sum;
      int i = 0;
      ArrayList<Double> proportion; new ArrayList<>();
      System.out.println("Enter the proportions of various expenses.");
      System.out.println("The system stops if the cumulative proportion exceeds 100%");

      do {
        System.out.println("Your proportion of expense " +
          (i + 1) + ":");
          double value = scan.nextDouble();
          proportion.add(value);
          sum += proportion.get(i);
      } while(sum <= 100);
      scan.close();   
  }
}
