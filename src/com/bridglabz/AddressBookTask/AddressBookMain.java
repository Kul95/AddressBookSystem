package com.bridglabz.AddressBookTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program. ");
        ArrayList<Contact> list = new ArrayList<Contact>();
        Scanner sc1=new Scanner(System.in);
        int ch = 0;
        do{
            System.out.println(" 1 Add ");
            System.out.println(" 2 Edit ");
            System.out.println(" 3 Delete ");
            System.out.println("Enter your choice.");
            ch=sc1.nextInt();

            switch (ch){
                case 1:
                    System.out.print("Enter student first name: ");
                    String firstName= sc1.nextLine();
                    System.out.print("Enter student second name:");
                    String lastName= sc1.nextLine();
                    System.out.print("Enter the address:");
                    String address= sc1.nextLine();
                    System.out.print("Enter the city:");
                    String city= sc1.nextLine();
                    System.out.print("Enter the state: ");
                    String state= sc1.nextLine();
                    System.out.print("Enter the zip code: ");
                    int zip= sc1.nextInt();
                    System.out.print("Enter the Phone number: ");
                    int phone= sc1.nextInt();
                    System.out.print("Enter the email:");
                    String email= sc1.nextLine();
                    list.add(new Contact(firstName,lastName,address,city,state,zip,phone,email));
                case 2:
                    System.out.println("----------------------------------------");
                    Iterator<Contact> i=list.iterator();
                    while(i.hasNext()){
                        Contact e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("----------------------------------------------");
                    break;



            }
        }while (ch!=0);
    }
}
