package com.xworkz.map.runner;

import com.xworkz.map.dto.ChiefMinisterDTO;
import com.xworkz.map.dto.HeroDTO;
import com.xworkz.map.dto.MovieDTO;
import com.xworkz.map.dto.StateDTO;

import java.util.*;

public class MapRunner {

    public static void main(String[] args) {

        // 1. UserId -> Password
        Map<String, String> userMap = new HashMap<>();
        userMap.put("Amruta", "password@123");
        userMap.put("akshata", "1234567");
        userMap.put("pramod", "pammu122");
        userMap.put("Ashok", "pass123");
        userMap.put("Amith", "Mudhol@189");

        System.out.println("User Map");
        System.out.println("Size : " + userMap.size());
        System.out.println("Keys : " + userMap.keySet());
        System.out.println("Values : " + userMap.values());

        // 2. Room -> Person
        Map<Integer, String> roomMap = new HashMap<>();
        roomMap.put(111, "Rahul");
        roomMap.put(1872, "Sneha");
        roomMap.put(1673, "Kiran");
        roomMap.put(1984, "Anjali");
        roomMap.put(155, "Ravi");

        System.out.println("\nRoom Map");
        System.out.println("Size : " + roomMap.size());
        System.out.println("Keys : " + roomMap.keySet());
        System.out.println("Values : " + roomMap.values());

        // 3. StateDTO -> ChiefMinisterDTO
        Map<StateDTO, ChiefMinisterDTO> stateMap = new HashMap<>();
        stateMap.put(new StateDTO("Karnataka"), new ChiefMinisterDTO("D.K.Shivakumar"));
        stateMap.put(new StateDTO("Tamil Nadu"), new ChiefMinisterDTO("Vijay"));
        stateMap.put(new StateDTO("Kerala"), new ChiefMinisterDTO("Pinarayi Vijayan"));
        stateMap.put(new StateDTO("Goa"), new ChiefMinisterDTO("Pramod Sawant"));
        stateMap.put(new StateDTO("Maharashtra"), new ChiefMinisterDTO("Devendra Fadnavas"));

        System.out.println("\nState Map");
        System.out.println("Size : " + stateMap.size());
        System.out.println("Keys : " + stateMap.keySet());
        System.out.println("Values : " + stateMap.values());

        // 4. MovieName -> HeroName
        Map<String, String> movieMap = new HashMap<>();
        movieMap.put("KGF", "Yash");
        movieMap.put("Pushpa", "Allu Arjun");
        movieMap.put("Salaar", "Prabhas");
        movieMap.put("Leo", "Vijay");
        movieMap.put("Jailer", "Rajinikanth");

        System.out.println("\nMovie Map");
        System.out.println("Size : " + movieMap.size());
        System.out.println("Keys : " + movieMap.keySet());
        System.out.println("Values : " + movieMap.values());

        // 5. MovieDTO -> HeroDTO
        Map<MovieDTO, HeroDTO> movieDTOMap = new HashMap<>();
        movieDTOMap.put(new MovieDTO("KGF"), new HeroDTO("Yash"));
        movieDTOMap.put(new MovieDTO("Pushpa"), new HeroDTO("Allu Arjun"));
        movieDTOMap.put(new MovieDTO("Salaar"), new HeroDTO("Prabhas"));
        movieDTOMap.put(new MovieDTO("Leo"), new HeroDTO("Vijay"));
        movieDTOMap.put(new MovieDTO("Jailer"), new HeroDTO("Rajinikanth"));

        System.out.println("\nMovieDTO Map");
        System.out.println("Size : " + movieDTOMap.size());
        System.out.println("Keys : " + movieDTOMap.keySet());
        System.out.println("Values : " + movieDTOMap.values());

        // 6. Area -> House No
        Map<String, Integer> areaMap = new HashMap<>();
        areaMap.put("BTM", 101);
        areaMap.put("HSR", 102);
        areaMap.put("Whitefield", 103);
        areaMap.put("Indiranagar", 104);
        areaMap.put("Rajajinagar", 105);

        System.out.println("\nArea Map");
        System.out.println("Size : " + areaMap.size());
        System.out.println("Keys : " + areaMap.keySet());
        System.out.println("Values : " + areaMap.values());

        // 7. Email -> Name
        Map<String, String> emailMap = new HashMap<>();
        emailMap.put("ram@gmail.com", "Ram");
        emailMap.put("anu@gmail.com", "Anu");
        emailMap.put("kiran@gmail.com", "Kiran");
        emailMap.put("divya@gmail.com", "Divya");
        emailMap.put("rahul@gmail.com", "Rahul");

        System.out.println("\nEmail Map");
        System.out.println("Size : " + emailMap.size());
        System.out.println("Keys : " + emailMap.keySet());
        System.out.println("Values : " + emailMap.values());

        // 8. Religion -> God List
        Map<String, List<String>> religionMap = new HashMap<>();
        religionMap.put("Hindu", Arrays.asList("Shiva", "Vishnu", "Ganesha"));
        religionMap.put("Christian", Arrays.asList("Jesus"));
        religionMap.put("Islam", Arrays.asList("Allah"));
        religionMap.put("Buddhism", Arrays.asList("Buddha"));
        religionMap.put("Sikhism", Arrays.asList("Waheguru"));

        System.out.println("\nReligion Map");
        System.out.println("Size : " + religionMap.size());
        System.out.println("Keys : " + religionMap.keySet());
        System.out.println("Values : " + religionMap.values());

        // 9. Bank Account Id -> Holder Name
        Map<Long, String> bankMap = new HashMap<>();
        bankMap.put(100001L, "Rahul");
        bankMap.put(100002L, "Anjali");
        bankMap.put(100003L, "Kiran");
        bankMap.put(100004L, "Sneha");
        bankMap.put(100005L, "Ravi");

        System.out.println("\nBank Map");
        System.out.println("Size : " + bankMap.size());
        System.out.println("Keys : " + bankMap.keySet());
        System.out.println("Values : " + bankMap.values());
    }
}