//! Stings Homework Q3: Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = 'apnaCollegeJava@gmail.com' ; username = 'apnaCollegeJava' 
// email = 'helloWorld123@gmail.com'; username = 'helloWorld123'


import java.util.*;

public class Q3_Strings_hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your email Address: ");
        String email = sc.nextLine();
        String userName = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            } else{
                userName = userName+email.charAt(i);
            }
        }
        System.out.println("Username = "+userName);

        sc.close();
    }
}