public class arraySum{
    public static void min(String args[]){
        int [] numbers={43,56,90,62,39,12,17,83};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}