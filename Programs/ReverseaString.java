package Programs;
// Reverse a string

// - The idea is to traverse the length of the string 
// - Extract each character while traversing 
// - Add each character in front of the existing string


import java.io.*;
import java.util.Scanner;

public class ReverseaString
{
	public static void main(String[]args){
	    String str="Noms", nstr="";
	    char ch;
	    
	    System.out.print("Original word: ");
	    System.out.println("Noms");
	    
	    for(int i=0; i<str.length();i++)
	    {
	        ch=str.charAt(i); //extracts each character
	        nstr=ch+nstr; //adds each character in front of the existing string
	    }
	    System.out.println("Reversed word: "+nstr);
	}
}

// Following are some interesting facts about String and StringBuilder classes : 
// 1. Objects of String are immutable. 
// 2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method. 
// 3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method. 