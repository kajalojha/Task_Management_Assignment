package Weekly_Assignment_Task_Management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Weekly_Assignment_Task_Management.Main.scanner;

public class AdminManager {
    Admin admin= new Admin("kajal", "1529");
    List<Admin> adminList;

    AdminManager() {
        adminList = new ArrayList<>();
    }


    //add admin
    public void registerAdmin()
    {
        System.out.println("Enter the username of admin");
        String adminUsername = scanner.next();
        System.out.println("Enter the Password of admin");
        String adminPassword = scanner.next();
        for (Admin admin : adminList) {
            if (admin.getUsername().equals(adminUsername)) {
                System.out.println("Admin with this username is already exits");
                return;
            }
        }
        Admin admin = new Admin(adminUsername,adminPassword);
        adminList.add(admin);
        System.out.println("Admin is added successfully");
        System.out.println(adminList);

    }

    //admin Login
    public boolean loginAdmin()
    {
        System.out.println("Enter the Admin username ");
        String adminUsername= scanner.next();
        System.out.println("enter the admin Password");
        String adminPassword = scanner.next();
        if(adminPassword.equals(admin.getPassword()) && adminUsername.equals(admin.getUsername()))
        {
            System.out.println("Admin is login ");
            return true;
        }
        else
        {
            System.out.println("Admin does not exists");
            return false;
        }
    }


}
