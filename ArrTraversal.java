public class ArrTraversal{
    public static void main(String args[]){
        int[] numbers=new int[6];
        numbers[0]=23;
        numbers[1]=54;
        numbers[2]=98;
        numbers[3]=12;
        numbers[4]=67;
        numbers[5]=34;
        

        for( int num: numbers){
            System.out.println(num);
        }
    }
}