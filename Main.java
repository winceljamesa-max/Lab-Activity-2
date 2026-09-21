public class Main {
   public static void main(String[] args) { 
      
      Vehicle v1 = new Vehicle(); 
      v1.brand = "Toyota"; 
      v1.model = "Corolla"; 
      v1.year = 1995; 
      
      Vehicle v2 = new Vehicle(); 
      v2.brand = "Honda"; 
      v2.model = "Civic"; 
      v2.year = 2015; 
      
      Vehicle v3 = new Vehicle(); 
      v3.brand = "Ford"; 
      v3.model = "Mustang"; 
      v3.year = 2020; 
      
      v1.displayInfo(); 
      System.out.println(v1.calculateAge()); 
      System.out.println(v1.isVintage()); 
      
      v2.displayInfo(); 
      System.out.println(v2.calculateAge()); 
      System.out.println(v2.isVintage()); 
      
      v3.displayInfo(); 
      System.out.println(v3.calculateAge()); 
      System.out.println(v3.isVintage()); 
      
      } 
 }