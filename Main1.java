package com.sher;
import java.io.*;
import java.util.Scanner;
public class Venue
{
 String name;
 String city;
}

private static String name;
private static String city;

public  class Main1
{
public static void main(String args[])
{
Venue v1=new Venue();
Scanner s=new Scanner(System.in);
System.out.println("Enter the Venue name");
name=s.nextLine();
System.out.println("Enter the City name");
city=s.nextLine();
System.out.println("Venue details");
System.out.println("Venue name:" +name);
System.out.println("City name:" +city);
}
}