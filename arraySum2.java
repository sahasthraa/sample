public class arraySum2 {
    public static void main(String args[]){
        int sum=0;
        int[] numbers={12,34,56,82,90,75,80,33,56,18};

        for(int num:numbers){
            sum=sum+num;

        }
        System.out.println("sum of array elements:" + sum);
    }
}
