//package com.aurionpro.test;

//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class NameTest {
//
//    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>(Arrays.asList("Amisha", "Suraj", "Dipika", "Nikhil"));
//
//        for (String x : stringList) {
//            System.out.println(x);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String nameToRemove = sc.nextLine();
//
//        if (stringList.contains(nameToRemove)) {
//            stringList.remove(nameToRemove);
//            System.out.println(nameToRemove + " Name removed");
//        } else {
//            System.out.println(nameToRemove + " Name not found");
//        }
//
//        
//        System.out.println("New list: " + stringList);
//    }
//}






//package com.aurionpro.test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class NameTest {
//
//    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>(Arrays.asList("Amisha", "Suraj", "Dipika", "Nikhil"));
//
//        stringList.forEach(System.out::println);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String nameToRemove = sc.nextLine();
//
//        boolean removed = stringList.removeIf(name -> name.equals(nameToRemove));
//
//        if (removed) {
//            System.out.println(nameToRemove + " Name removed");
//        } else {
//            System.out.println(nameToRemove + " Name not found");
//        }
//
//        System.out.println("New list: " + stringList);
//    }
//}




package com.aurionpro.test; 
 
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.Scanner; 
import java.util.Set; 
 
public class NameTest { 
 public static void main(String[] args) { 
  Map<Integer, String> nameMap=new HashMap<>(); 
   
  nameMap.put(1, "Amisha"); 
  nameMap.put(2, "Suraj"); 
  nameMap.put(3, "Nikhil"); 
   
  System.out.println("Enter the name to delete"); 
  Scanner sc= new Scanner(System.in); 
  String inputName=sc.nextLine(); 
   
    if (nameMap.containsValue(inputName)) {    
     nameMap.values().removeIf(value -> value.equals(inputName)); 
     System.out.println("Name removed from the map."); 
    } 
    else { 
     System.out.println("Name dosen't exist"); 
    } 
//    nameMap.forEach((key, value) -> { 
//    System.out.println(key + " " + value);  });
    
    System.out.println("Updated Map: " +nameMap);
 }}
    
    
    
    
    