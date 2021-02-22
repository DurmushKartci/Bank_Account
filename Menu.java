import java.util.Scanner;

public class Menu {

    /////////////////////////// TOOLS///////////////////////////
    static Scanner scanStr = new Scanner(System.in);

    // This method introduces the application
    public static void introduce() {
        System.out.println(
                "\n-------------------BANK ACCOUNT APPLİCATİON-------------------\nVersion       : 1.0\nAuthor        : Durmuş KARTCI\nDescription   : With this application, users can follow \n   the exchange rate, learn everything about bank accounts,\n   transfer money and much more.\n--------------------------------------------------------------");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    System.out.println("ERROR ID : 0000 in Menu.java");
                }
                
    }

    // With this method users can log in or register
    public static User user_login_register() {
        System.out.println("\n\n    -_-_-_-_-_-_ WELCOME _-_-_-_-_-_-\n");
        System.out.println("    1. Login      or      2.Register\n");
        System.out.println("    -_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-\n");

        // Take the input from user
        System.out.println("\n\n    Select '1' or '2' to continue :\n");
        String answer = scanStr.nextLine();

        // If user wants to Login
        if (answer.equals("1")) {
            return user_login_register();
        }

        // Else if user wants to register
        else if (answer.equals("2")) {
            return user_register();
        }

        // Else the user enters wrong
        else {
            System.out.println("\n\n\n\n    -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            System.out.println("Please type '1' or '2'\n");
            System.out.println("    -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("ERROR ID : 0000 in Menu.java");
            }
            return user_login_register();
        }


    }

    //This method saves the new user in the system
        //This method returns a User
    public static User user_register() {

        //Take the inputs from user
        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("\nName :");
        String name = scanStr.nextLine();
        System.out.println("\nSurname :");
        String surname = scanStr.nextLine();
        System.out.println("\nID :");
        String ID = scanStr.nextLine();
        System.out.println("\nPassword :");
        String password = scanStr.nextLine();
        System.out.println("\nVerify Password :");
        String verifyPassword = scanStr.nextLine();
        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        //Check the password
        if(!verifyPassword.equals(password)){
            System.out.println("\n\n\n\n    -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            System.out.println("        Your password and verification password should be equal ");
            System.out.println("    -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("ERROR ID : 0000 in Menu.java");
            }
            return user_login_register();
            
        }

        //Check if the answers are blank
        if(name.equals("")||surname.equals("")||ID.equals("")||password.equals("")){
            
            System.out.println("\n\n\n\n    -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            System.out.println("        Please fill in all fields ");
            System.out.println("    -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("ERROR ID : 0000 in Menu.java");
            }
            return user_login_register();
        }

        
        User tempUser = new User(ID, name, surname, password);

        return tempUser;

        
    }
    //It is the method that meets the user when the user logs into the application.
    public static void welcome_user() {
        
    }
}
