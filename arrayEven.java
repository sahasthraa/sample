public class arrayEven {
    public static void main(String args[]){
        int[] numbers={2,4,5,9,6,12,14,11,61,99,42};

        int countEven=0;
        int countOdd=0;

        for(int i=0;i<numbers.length;i++){
if(numbers[i]%2==0){
    countEven++;
}else{
    countOdd++;
}
}
    System.out.println("Even count:" + countEven);
    System.out.println("Odd count:" + countOdd);
}
        }
    
    

