package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        boolean end = false;

        while (!end){
            String str = reader.readLine();
            list.add(str);
            end = str.equals("end");
        }

        list.remove(list.get(list.size()-1));

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}