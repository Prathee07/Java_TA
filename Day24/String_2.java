package Strings;

public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1=new String("Java");
          String s2="Java";
          if(s1==s2) {
        	  System.out.println("Equal by reference");
          }
          else {
        	  System.out.println("Unequal by reference");
          }
          if(s1.equals(s2)) {
        	  System.out.println("Equal by values");
          }
          else {
        	  System.out.println("Unequal by values");
          } 
          String s3=new String("CPP");
          String s4=new String("CPP");
          if(s3==s4) {
        	  System.out.println("Equal by reference");
          }
          else {
        	  System.out.println("Unequal by reference");
          }
          if(s3.equals(s4)) {
        	  System.out.println("Equal by values");
          }
          else {
        	  System.out.println("Unequal by values");
          } 
          String s5="Python";
          String s6="Python";
          if(s5==s6) {
        	  System.out.println("Equal by reference");
          }
          else {
        	  System.out.println("Unequal by reference");
          }
          if(s5.equals(s6)) {
        	  System.out.println("Equal by values");
          }
          else {
        	  System.out.println("Unequal by values");
          } 
          String s7="React";
          String s8="REACT";
          if(s7==s8) {
        	  System.out.println("Equal by reference");
          }
          else {
        	  System.out.println("Unequal by reference");
          }
          if(s7.equals(s8)) {
        	  System.out.println("Equal by values");
          }
          else {
        	  System.out.println("Unequal by values");
          } 
          if(s7.equalsIgnoreCase(s8)) {
        	  System.out.println("Equal by values");
          }
          else {
        	  System.out.println("Unequal by values");
          } 
	}

}
//**************OUTPUT**********//
Equal by values
Equal by reference
Equal by values
Unequal by reference
Unequal by values
Equal by values

