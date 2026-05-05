public class Carparamtr {
    String brand;
    int year;
    public Carparamtr(String brand,int year){
       this.brand=brand;
       this.year=year; 
    }
    public static void main(String args[]){
        Carparamtr car1=new Carparamtr("benz",2025);
        Carparamtr car2=new Carparamtr("audi",2026);
        System.out.println(car1.brand+" "+car1.year);
        System.out.println(car2.brand+" "+car2.year);
        
    }
}