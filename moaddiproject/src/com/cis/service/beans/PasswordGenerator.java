package com.cis.service.beans;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String alphabet = "0123456789";
	        int i = 0;
	        int Alphalaenge = alphabet.length();
	        
	        while(i < 5){
	                int rand = (int) (Math.random() * Alphalaenge);
	                
	               /* char pass=alphabet.charAt(rand);
	                password= String.valueOf(pass);*/
	                Integer password=rand;
	            System.out.print(rand);
	            ++i;
	        }
	}

}
