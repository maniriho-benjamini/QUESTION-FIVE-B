
package com.codemulo.productsummax;

import java.util.Scanner;

public class ProductSumMax {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();

    System.out.print("Enter third number: ");
    double num3 = scanner.nextDouble();

    double product = num1 * num2 * num3;
    double sum = num1 + num2 + num3;
    double max = Math.max(num1, Math.max(num2, num3));

    System.out.println("\nProduct\tSum\tMaximum");
    System.out.printf("%.2f\t%.2f\t%.2f\n", product, sum, max);

    scanner.close();
  }
}