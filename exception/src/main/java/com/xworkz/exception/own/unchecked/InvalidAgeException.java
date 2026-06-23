package com.xworkz.exception.own.unchecked;

public class InvalidAgeException extends RuntimeException
{
    InvalidAgeException()
    {
        System.out.println("Age must be 18 or above");
    }

}
