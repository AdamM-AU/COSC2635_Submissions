package menu;

import java.util.Random;
import java.util.Scanner;

public class passwordgenerator
{
   public void getPassword() {
     String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String lower = "abcdefghijklmnopqrstuvwxyz";
     String num = "0123456789";
     String specialChars = "<>,.?/}]{[+_-)(*&^%$#@!=";
     String combination = upper+lower+specialChars+num;
     
     int len = this.getChoice();
     char[] password = new char[len];
     Random r = new Random();
     for (int i = 0; i <len; i++)
     {
        password[i] = combination.charAt(r.nextInt(combination.length()));
     }
     System.out.println("Generated password is: " + new String(password));
   }
   
   private int getChoice() {
      Scanner kb = new Scanner(System.in);
      int choice = -1;
      while (choice < 0 || choice > 10) {
         try {
            System.out.print("\nEnter lenght of password, note the macimum length is 10: \n");
            choice = Integer.parseInt(kb.nextLine());
         }
         catch(NumberFormatException e) {
            System.out.println("\nInvalid menu option, please choose an appropiate option: ");
         }
      }
      
      return choice;
      }
   
   public static void main(String[] args)
   {
       passwordgenerator obj = new passwordgenerator();
   }
}