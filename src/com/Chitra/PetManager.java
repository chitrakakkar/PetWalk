package com.Chitra;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by chitrakakkar on 3/14/16.
 */
public class PetManager
{
    // A class which creates objects with Pet constructor
    public static void main(String[] args)
    {
        List<Pet> PetList = new ArrayList<>();  // a list to add all the pet objects
        // a list of all days in a week
        List<String> DaysOfWeeks = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        // creating Pet objects with default Constructor
        String petName = "Molly";
        String petType = "Cat";
        String petAddress = "1234 Street St.";
        // Key: Day -> Value: Number of walks
        HashMap<String, Integer> petSchedule = new HashMap<>();
        petSchedule.put("Monday", 3); // adding values to the hashmap
        petSchedule.put("Tuesday", 0);
        petSchedule.put("Wednesday", 1);
        petSchedule.put("Thursday", 2);
        petSchedule.put("Friday", 1);
        petSchedule.put("Saturday", 3);
        petSchedule.put("Sunday", 2);
        Pet Pet1 = new Pet(petName, petType, petAddress, petSchedule);
        String petName1 = "Nina";
        String petType1 = "Rabbit";
        String petAddress1 = "407 7th Street St.";
        HashMap<String, Integer> petSchedule1 = new HashMap<>();
        petSchedule1.put("Monday", 2);
        petSchedule1.put("Tuesday", 1);
        petSchedule1.put("Wednesday", 2);
        petSchedule1.put("Thursday", 2);
        petSchedule1.put("Friday", 0);
        petSchedule1.put("Saturday", 3);
        petSchedule1.put("Sunday", 2);
        Pet Pet2 = new Pet(petName1, petType1, petAddress1, petSchedule1);
        String petName2 = "Rocky";
        String petType2 = "Dog";
        String petAddress2 = "1798, Raleigh street";
        HashMap<String, Integer> petSchedule2 = new HashMap<>();
        petSchedule2.put("Monday", 3);
        petSchedule2.put("Tuesday", 0);
        petSchedule2.put("Wednesday", 3);
        petSchedule2.put("Thursday", 3);
        petSchedule2.put("Friday", 2);
        petSchedule2.put("Saturday", 0);
        petSchedule2.put("Sunday", 0);
        Pet Pet3 = new Pet(petName2, petType2, petAddress2, petSchedule2);
        PetList.add(Pet1);  // adding pet object to the list
        PetList.add(Pet2);
        PetList.add(Pet3);
        //for each loop to iterate over seven days in a week
        for (String ST : DaysOfWeeks)
        {
            System.out.println("\033[0;1m" + ST + ":"+ "\033[0m ");
            int Sum =0;  // initializing sum here to reset it after every day
            for (Pet p : PetList) // a loop to check each object
            {
                Sum = p.PrintInfo(Sum,ST); // This Sum catches the Sum sent by the method from Pet class
            }
            System.out.println("*******************************************************************");


        }
    }
}


