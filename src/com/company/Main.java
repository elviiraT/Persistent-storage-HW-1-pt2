package com.company;
import java.io.*;
import java.util.List;
import java.util.LinkedList;

public class Main
{

    public static void main(String[] args)
    {
        String fname = "file 1";
        LinkedList<Integer> numberList = new LinkedList<>();

        for( int i = 0; i < 1000;i++)
        {
            numberList.add(i);
        }

        try(ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(fname)))
        {
                out.writeObject(numberList);
        }
        catch(Exception e) {System.out.println(e);}

        try(ObjectInputStream in = new ObjectInputStream( new FileInputStream(fname)))
        {
            LinkedList <Integer> List= (LinkedList<Integer>) in.readObject();
            System.out.println(List);
        }
        catch(Exception e) {System.out.println(e);}
    }
}
