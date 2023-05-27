package com.bridglabz.AddressBookTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program. ");
        ArrayList<Contact> list = new ArrayList<Contact>();
        Scanner sc1=new Scanner(System.in);
        int ch = 0;
        do{
            System.out.println(" 1 Add ");
            System.out.println(" 2 Display ");
            System.out.println(" 3 Delete ");
            System.out.println("4 Update ");
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

                case 3:
                    boolean found=false;
                    System.out.println("Enter student record to delete:");
                    int studentNumber= sc1.nextInt();
                    System.out.println("----------------------------------------");
                    i=list.iterator();
                    while(i.hasNext()){
                        Contact e=i.next();
                        if(e.getPhoneNumber()==studentNumber){
                            i.remove();
                            found=true;
                        }}
                    if(!found){
                        System.out.println("Record is not found");
                    }else{
                        System.out.println("Record is deleted successfully..");
                    }
                    System.out.println("----------------------------------------------");
                    break;



                case 4:
                     found=false;
                    System.out.println("Enter student number to update:");
                     studentNumber= sc1.nextInt();
                    System.out.println("----------------------------------------");
                    ListIterator<Contact>li=list.listIterator();
                    while(li.hasNext()){
                        Contact e=li.next();
                        if(e.getPhoneNumber()==studentNumber){
                            System.out.println("Enter the first name: ");
                            firstName= sc1.nextLine();
                            System.out.println("Enter last Name:");
                            lastName=sc1.nextLine();
                            System.out.println("Enter the address: ");
                            address=sc1.nextLine();
                            System.out.println("Enter the city: ");
                            city=sc1.nextLine();
                            System.out.println("Enter state: ");
                            state=sc1.nextLine();
                            System.out.println("Enter the zip code .");
                            zip=sc1.nextInt();
                            System.out.println("Enter phone number:");
                            phone= sc1.nextInt();
                            System.out.println("Enter email: ");
                            email= sc1.nextLine();
                            li.set(new Contact(firstName,lastName,address,city,state,zip,phone,email));
                            found=true;
                        }}
                    if(!found){
                        System.out.println("Record is not found");
                    }else{
                        System.out.println("Record is Updated successfully..");
                    }
                    System.out.println("----------------------------------------------");
                    break;
            }
        }while (ch!=0);
    }
}
