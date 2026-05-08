public class singleDarray {
    public static void main(String args[]){
       int [] numbers={23,12,43,66,87,92,10,51,65,34};
    int min=numbers[0];
    for(int num:numbers){
        
        if(num<min){
            min=num;
    }

}
int max=numbers[2];
for(int num:numbers){
    if(num>max){
        max=num;
    }
}
System.out.println ("the smallest number is :" +min);
System.out.println("the largest number is:" +max);
}
}
