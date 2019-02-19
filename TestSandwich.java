// Filename:TestSandwich.java
//Author:Damian Lester
//Date: 1.24.19
/*
Application that allows a user to create a sandwich out of the sandwich class 
and displays a summary of the info
 */

import java.util.Scanner;
public class TestSandwich 
{
    public static void main(String[] args) 
    {
        //Variables to store the user info
        String ingType;
        String breadType;

        //Instantiate one sandwich object 
        Sandwich mySandwich = new Sandwich();

        //Instantiate one Scanner object 
        Scanner Keyboard = new Scanner(System.in);    

        //Prompt the user for the ingredient 
        System.out.print("What type of sandwich do you want? >>");
        ingType = Keyboard.nextLine();

        //Prompt the user for the bread 
        System.out.print("What type of bread would you like? >> ");
        breadType = Keyboard.nextLine();

        //Transfer the user info into the sandwich object 
        mySandwich.setIngredient(ingType);
        mySandwich.setBread(breadType);


        //Output a summary of the sandwich to the command promp        
        System.out.println("Thank you for your order today!");
        System.out.println("You ordered a " + mySandwich.getIngredient() + " sandwich on " + mySandwich.getBread() + " bread. The price is $" + mySandwich.getPrice());
    }
}