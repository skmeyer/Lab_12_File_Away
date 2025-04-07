import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You entered an invalid number: " + trash);
            }
            
        }while(!done);

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Your input was invalid: " + trash);
            }

        }while(!done);

        return retDouble;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "] : ");
            if(pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                if(retInt > high || retInt < low)
                {
                    System.out.println("Your input was invalid: " + retInt);
                }
                else
                {
                    done = true;
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Your input was invalid: " + trash);
            }

        }while(!done);

        return retInt;
        
    }


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "] : ");
            if(pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                if(retDouble > high || retDouble < low)
                {
                    System.out.println("Your input was invalid: " + retDouble);
                }
                else
                {
                    done = true;
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Your input was invalid: " + trash);
            }

        }while(!done);

        return retDouble;

    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String confirm = "";
        boolean retTrueFalse = false;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            confirm = pipe.nextLine();
            if(confirm.equalsIgnoreCase("Y"))
            {
                retTrueFalse = true;
                done = true;
            }
            else if(confirm.equalsIgnoreCase("N"))
            {
                retTrueFalse = false;
                done = true;
            }
            else
            {
                System.out.println("You entered an invalid input: " + confirm);
            }

        }while(!done);

        return retTrueFalse;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retRegEx = "";
        boolean done = false;
        do
        {
            System.out.print("\n" + prompt + ": ");
            retRegEx = pipe.nextLine();
            if(retRegEx.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Your input was invalid: " + retRegEx);
            }

        }while(!done);

        return retRegEx;
    }

    public static String prettyHeader(String msg)
    {
        for(int starNum = 0; starNum <= 60; starNum++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
        if(msg.length() % 2 == 0)
        {
            System.out.print("***");
            int spaceNum = (54 - msg.length()) / 2;
            for(int space = 0; space <= spaceNum; space++)
            {
                System.out.print(" ");
            }
            System.out.print(msg);
            for(int space = 0; space <= spaceNum - 1; space++)
            {
                System.out.print(" ");
            }
            System.out.print("***");
        }
        else
        {
            System.out.print("***");
            int spaceNum = (54 - msg.length()) / 2;
            for(int space = 0; space <= spaceNum + 1; space++)
            {
                System.out.print(" ");
            }
            System.out.print(msg);
            for(int space = 0; space <= spaceNum - 1; space++)
            {
                System.out.print(" ");
            }
        }
        System.out.print("***");
        System.out.println("\n");
        for(int starNum = 0; starNum < 61; starNum++)
        {
            System.out.print("*");
        }
        return msg;
    }


}
