public class Car{
   String brand;
    String model;
    int year;
    public static void main(String args[]){
        Car obj1=new Car();
        obj1.brand="mahindra";
        obj1.model="xuv700";
        obj1.year=2024;
        Car obj2=new Car();
        obj2.brand="tata";
        obj2.model="zxi";
        obj2.year=2023;
        System.out.println(obj1.brand+" "+obj1.model+" "+obj1.year);
        System.out.println(obj2.brand+" "+obj2.model+" "+obj2.year);



    }
}    
