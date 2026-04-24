public class switchcalci {
    static int a=4;
    static int b=8;
    public static void main(String args[]){
        String operator="%";
        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
                case "-":
                    System.out.println(a-b);
                        break;
                         case "*":
                               System.out.println(a*b);
                               break;
                               case "/":
                               System.out.println(a/b);
                               break;
                               case "%":
                                System.out.println(a%b);
                                break;
                                case "==":
                                    System.out.println(a==b);
                                break;
                            default:
                        System.out.println("invalid operator");
                    break;                  
        }
    }
    }
    

