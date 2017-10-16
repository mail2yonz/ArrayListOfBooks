/*
Yonatan Mengesha
ArrayList example

 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Creating an array list of book as library
        ArrayList<Book> library= new ArrayList<> ();

        String ans;
        //Create an object of scanner
        Scanner scan=new Scanner (System.in);

        //do while loop to insert records of books
        do{
            Book book= new Book();

            System.out.println ("Enter the book Author: " );
            book.author= scan.nextLine () ;

            System.out.println ("Enter the books Title:" );
            book.title= scan.nextLine () ;

            System.out.println ("Enter the books Description" );
            book.description=  scan.nextLine () ;

            library.add ( book );

            System.out.println ("Do you want to Enter(yes/quite )" );
            ans=scan.nextLine ();
           // System.out.println (ans );


        }while(ans.equalsIgnoreCase ( "yes"));

//printing out the books
        System.out.println ("All the books are :" );

            for(Book books:library)
            {
                System.out.println (books.author+"  " + books.title+"  " +books.description );
            }



    }
}
