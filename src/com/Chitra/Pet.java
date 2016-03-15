package com.Chitra;

import java.util.HashMap;

public class Pet
{

    String Name;
    String Type;
    String Address;
    HashMap<String,Integer> Schedule;

    Pet(String name, String type, String address, HashMap<String, Integer>schedule)
    {
        this.Name = name;
        this.Type = type;

        this.Address = address;
        this.Schedule = schedule;
    }
//    void AddFrequency(HashMap<String,Integer> Freq)
//    {
//        if(Schedule == null)
//        {
//
//            Schedule = new HashMap<String, Integer>();
//        }
//        for (String key:Freq.keySet()
//                )
//        {
//            Schedule.put(key,Freq.get(key));
//        }
//        System.out.println(this.Name);
//        System.out.println(this.Type);
//        System.out.println(this.Address);
//        System.out.println("Number of times in a week" + Schedule);
//        System.out.println("****************************************************");
//    }
    public String GetKey(HashMap<String,Integer>Sched)
    {
        String WeekDayName=" ";
        for (String st:Sched.keySet()
             )
        {
           WeekDayName = st;

        }
        return WeekDayName;
    }
    public Integer GetValue(HashMap<String,Integer>Sched)
    {

        Integer PetWalk =0;
        for (String st:Sched.keySet()
                )
        {
            PetWalk = Sched.get(st);

        }
        return PetWalk;
    }




}

