package com.Chitra;

import java.util.HashMap;

// This project keeps track of PetVisit every day in a week where we have a chart which gives you the schedule and
// also, if the visit exceeds the daily limit of 6, it gives out a warning.

public class Pet
{
    // variables to define the class
    String Name;
    String Type;
    String Address;
    HashMap<String,Integer> Schedule;  // a hashmap to get the days and no of visits per day for each pet
    // a constructor to create the object for this class
    Pet(String name, String type, String address, HashMap<String, Integer>schedule)
    {
        this.Name = name;
        this.Type = type;
        this.Address = address;
        this.Schedule = schedule;
    }
    //A user defined method to print the Pet info which receives sum and WeekDays name as an argument and returns Sum
    public Integer PrintInfo( int Sum,String ST)
    {
        // prints out the info in given format
        System.out.println(" Visit " + this.Name + " the " + this.Type + "\t" + this.Schedule.get(ST) + "\tTimes " + " Address : " + this.Address);
        Sum = Sum + this.Schedule.get(ST); // adds the total values per day for all the pets
        if(Sum>6) /// a condition to check if the visit is more than 6 per day
        {
            System.out.println("*******************************************************************");
            System.out.println("\033[0;1m"+"\033[31mWarning !!! You have more than 6 visits Today"+"\033[0m "); // to print warning in red color

        }
        return Sum; // it returns Sum to the called method.
    }

}

