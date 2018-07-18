package com.example.basic;

public class CustomException {
	static void validate(int age)throws InvalidAgeException
	{
		if(age<18){
			throw new InvalidAgeException("not valid");
		}
	}
public static void main(String[] args) {
try{validate(13);

}catch(Exception e){
	System.out.println("exception occrued"+e);
}
}
}
