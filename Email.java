package com.romaintestard;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "mycompany.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
       /* System.out.println("Email created: " + this.firstName + " " + this.lastName);*/

        // Call a method asking for the department - return the department
        this.department = setDepartment();
/*        System.out.println("Department: " + this.department);*/

        // Call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
/*        System.out.println("Your password is: " + this.password);*/

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
/*        System.out.println("You email is: " + email);*/
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Get the mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Get the alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get the password
    public String getPassword() {
        return password;
    }

    // Show info
    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nYour password: " + password +
                "\nMailbox capacity: " + mailboxCapacity + "mb";
    }
}


