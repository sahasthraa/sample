public class stringtypes{
    public static void main(String args[]){
        String name="sahasthra ";
        String Name="laddu ";
        String FName="sahasthra";
        String LName="thummala";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(5));
        System.out.println(name.equals(Name));
        System.out.println(Name.trim());
        System.out.println(FName+" "+LName);
        System.out.println(FName.concat(LName));
        System.out.println("sahasthra is a \'good girl\'");
        System.out.println("vaishnavi is a \"bad girl\"");
        System.out.println("sathwika is a\\intelligent girl\\");
        System.out.println("meghana is a \\'innocent girl\\'");
        System.out.println(FName+"\n"+LName);
        System.out.println(Name+"\t"+"guddu");
        System.out.println(Name+"\b\b"+name);
    }
}