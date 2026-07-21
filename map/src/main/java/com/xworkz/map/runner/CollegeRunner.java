package com.xworkz.map.runner;

import com.xworkz.map.dto.CollegeDTO;
import com.xworkz.map.dto.StudentDTO;

import java.util.HashMap;
import java.util.Map;

public class CollegeRunner {
    public static void main(String[] args) {
        Map<CollegeDTO, StudentDTO> map = new HashMap<>();

        CollegeDTO c1 = new CollegeDTO(1, "PES College", "Bengaluru");
        CollegeDTO c2 = new CollegeDTO(2, "RV College", "Bengaluru");
        CollegeDTO c3 = new CollegeDTO(3, "BMS College", "Bengaluru");

        StudentDTO s1 = new StudentDTO(111, "Asha", "CSE");
        StudentDTO s2 = new StudentDTO(102, "Rahul", "ISE");
        StudentDTO s3 = new StudentDTO(135, "Kiran", "ECE");

        // put
        map.put(c1, s1);
        map.put(c2, s2);
        map.put(c3, s3);

        System.out.println(map.get(c1));
        System.out.println("------------");

        System.out.println(map.containsKey(c2));

        System.out.println(map.containsValue(s3));

        System.out.println(map.size());

        for (CollegeDTO key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("-----------------");

        //values()
        for (StudentDTO value : map.values()) {
            System.out.println(value);
        }
        System.out.println("--------------");

        // entrySet()
        for (Map.Entry<CollegeDTO, StudentDTO> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------");

        //replace()
        map.replace(c1, new StudentDTO(104, "Megha", "AI"));

        // remove()
        map.remove(c2);

        map.putIfAbsent(c2, s2);

        map.forEach((k, v) -> System.out.println(k + "->" + v));
        System.out.println("-------------");

        //isEmpty()
        System.out.println(map.isEmpty());

        // clear()
        map.clear();

        System.out.println(map.size());
    }
}
