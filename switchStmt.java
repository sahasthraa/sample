public class switchStmt{

    public static void main(String args[]){
        char grade = 'B';
        switch(grade){
            case 'A':
                System.out.println("excellent");
            break;
        case 'B':
            System.out.println("good");
        break;
    case 'C':
        System.out.println("average");
    break;
case 'D':
System.out.println("below average");
break;
case 'E':
    System.out.println("fail");
    break;
    default:
        System.out.println("invaid grade");
        break;
        }
    }
}