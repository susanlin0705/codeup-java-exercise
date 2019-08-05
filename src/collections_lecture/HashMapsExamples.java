package collections_lecture;

import java.util.HashMap;

public class HashMapsExamples {
    public static void main(String[] args) {
        //SSN, PERSON'S NAME
        // HashMap relies on key.
        HashMap <Integer, String> people = new HashMap<>();
        //.put 加入數值
        people.put(12345, "Fer");
        people.put(23456, "Daniel");
        people.put(34567,"Stacy");


        System.out.println("34567 is "+ people.get(34567) );
        //.getOrDefault =  找所給的值，當找不到質也會給予default值
        System.out.println("People.getOrDefault = " + (people.getOrDefault(33333, "No person was found!")));


        //true or false

        System.out.println("People.containsKey (1111) = " + people.containsKey(1111) );
        System.out.println("people.containsValue() = " + people.containsValue("Fer"));

        //not caring about the value< > key
        people.replace(34567, "Bobby");
        System.out.println(people.containsValue("Stacy"));


        System.out.println("people.putIfAbsent(34567,\"Bobby\") = " + people.putIfAbsent(34567, "Bobby"));

        people.remove(34567);
        //hashMap has no loop
        for(Integer ssn :people.keySet()){
            System.out.println("ssn = " +ssn);
            System.out.println("name of the people = " + people.get(ssn).toUpperCase());
        }

    }
}
