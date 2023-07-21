package ru.Ryabov.Seminar5HW.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void addNum(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)){
            map.get(key).add(value);
        }
        else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void print(Map<String, ArrayList<Integer>> map) {
        for (var item:map.entrySet()) {
            String phones = "";
            for (int elem: item.getValue()) {
                phones = phones + elem + ", ";
            }
            System.out.printf("%s: %s\n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNum("Ivanov", 712345678, bookPhone);
        addNum("Petrov", 709876543, bookPhone);
        addNum("Piroshkov", 712345098, bookPhone);
        addNum("Smirnov", 767890123, bookPhone);
        addNum("Sidorov", 790012356, bookPhone);
        addNum("ivanov", 78357078, bookPhone);
        addNum("Maslyakov", 791144994, bookPhone);
        addNum("Petrov", 790121234, bookPhone);
        print(bookPhone);
    }

}
