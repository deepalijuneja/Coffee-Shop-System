import java.util.*;
import java.io.*;
/**
 * @author Deepali Juneja
 * @version 03/20/2020
 */
public class FinalProject
{
    public static void main(String[] args) {
        String input_user;
        int chooseBeverage = 0;
        int select_input = 0;
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        System.out.println("The current hour is " + hour);

        if (hour>=0 && hour<=12)
        {
            
            while(1==1)
            {
                if (chooseBeverage == 1)
                {
                    setTea();
                    break;
                }
                else if(chooseBeverage == 2)
                {
                    setCoffee();
                    break;
                }
                else{
                    while(1==1)
                    {
                        System.out.println("Good morning! What would you like to have amazing human?");
                        System.out.println("1.Tea, 2. Coffee");
                        Scanner myObj = new Scanner(System.in);
                        input_user = myObj.nextLine();
                        chooseBeverage = Integer.parseInt(input_user);
                        if(chooseBeverage == 1 || chooseBeverage == 2)
                        {
                            break;
                        }
                    }
                }
            }
        }
        else if(hour>=17 && hour<=19)
        {
            
            while(1==1)
            {
                System.out.println("What would you like to have tomorrow sleepy eyes?");
                System.out.println("1.Tea, 2. Coffee");
                Scanner myObj = new Scanner(System.in);
                input_user = myObj.nextLine();
                chooseBeverage = Integer.parseInt(input_user);
                if(chooseBeverage == 1 || chooseBeverage == 2)
                {
                    break;
                }
            }
        }
        System.out.println("Are you not drinking at home and ordering from outside? :( 1. Yes 2. No");
        Scanner myObj1 = new Scanner(System.in);
        input_user = myObj1.nextLine();
        select_input = Integer.parseInt(input_user);
        if(select_input == 2)
        {
            while(1==1)
            {
                System.out.println("What would you like to drink dear?");
                System.out.println("1.Tea, 2. Coffee");
                Scanner myObj = new Scanner(System.in);
                input_user = myObj.nextLine();
                chooseBeverage = Integer.parseInt(input_user);
                if(chooseBeverage == 1 || chooseBeverage == 2)
                {
                    break;
                }
            }
            if ( chooseBeverage == 1)
            {
                setTea();
            }
            else if(chooseBeverage == 2)
            {
                setCoffee();
            }
        }
    }

    public static void setTea()
    {
        String input_user;
        int selectTea = 0;
        int selectAdd = 0;
        String select_tea_s, select_add_s;
        select_add_s = "";
        while(1==1)      
        {
            System.out.println("So, which tea are you in mood for today? 1. Green, 2. Black");
            Scanner tea = new Scanner(System.in);
            input_user = tea.nextLine();
            selectTea = Integer.parseInt(input_user);
            if(selectTea == 1 || selectTea == 2)
            {
                if(selectTea == 1)
                {
                    select_tea_s = "Black";
                }
                else
                {
                    select_tea_s = "Green";
                }
                break;
            }
        }
        while(1==1)
        {
            System.out.println("Do you want to add something? These are the options: 1.Lemon, 2.Half Sugar , 3.Full Sugar");
            Scanner addtea = new Scanner(System.in);
            input_user = addtea.nextLine();
            selectAdd = Integer.parseInt(input_user);
            if(selectAdd == 1 || selectAdd == 2 || selectAdd == 3)
            {
                if(selectAdd == 1)
                {
                    select_add_s = "Lemon";
                }
                else if(selectAdd == 2)
                {
                    select_add_s = "Half Sugar";
                }
                else
                {
                    select_add_s = "Full Sugar";
                }
                break;
            }

        }
        System.out.println("Your drink " + select_tea_s + " Tea with " + select_add_s + ". Have a great day, dear");
    }

    public static void setCoffee()
    {
        String input_user;
        int selectCoffee = 0;
        int selectAdd = 0;
        String select_coffee_s, select_add_s;
        select_add_s = "";
        while(1==1)
        {
            System.out.println("How would you like your coffee today beautiful soul? 1. Espresso, 2. Latte");
            Scanner coffee = new Scanner(System.in);
            input_user = coffee.nextLine();
            selectCoffee = Integer.parseInt(input_user);
            if(selectCoffee == 1 || selectCoffee == 2)
            {
                if(selectCoffee == 1)
                {
                    select_coffee_s = "Espresso";
                }
                else
                {
                    select_coffee_s = "Latte";
                }
                break;
            }
        }
        while(1==1)
        {
            System.out.println("Do you want to add something to make your coffee more amazing like you? Choose: 1.Short, 2.Long , 3.No foam and extra hot");
            Scanner addcoffee = new Scanner(System.in);
            input_user = addcoffee.nextLine();
            selectAdd = Integer.parseInt(input_user);
            if(selectAdd == 1 || selectAdd == 2 || selectAdd == 3)
            {
                if(selectAdd == 1 && selectCoffee == 1)
                {
                    select_add_s = "Short";
                }
                else if(selectAdd == 2 && selectCoffee == 1)
                {
                    select_add_s = "Long";
                }
                else
                {
                    select_add_s = "No foam and extra hot";
                }
                break;
            }

        }
        System.out.println("Your drink " + select_coffee_s + " Coffee with " + select_add_s + ". Have a great day, dear" );
    }
}