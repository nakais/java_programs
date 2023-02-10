package org.example;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws JSONException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Mobile no: ");
        String mobile_no = sc.nextLine();


        JSONObject userinfo = new JSONObject();
        userinfo.put("Full name",name);
        userinfo.put("Email",email);
        userinfo.put("Password",password);
        userinfo.put("Address",address);
        userinfo.put("Mobile no",mobile_no);

        try(FileWriter file = new FileWriter("src/main/resources/user_info.json")){
                file.write(userinfo.toString());
                System.out.println("User information saved to user_info.json");
        }
        catch (Exception e){
            System.out.println("An error occurred while saving the user information!");
        }

    }
}
