import javax.xml.namespace.QName;

import static java.lang.Long.sum;


public class main {
    public static void main(String[] arg) {

        int number = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Nicky";

        hello();
        positiveOrNegative(number);
        bartender(name);
        sum(input1, input2);


    }

    public static void hello() {
        System.out.println("Hello,");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        } else {
            postiveOrZeroOrNegativ(number);
        }
    }

    public static void postiveOrZeroOrNegativ(int number) {
        System.out.println("This number is zero!");
    }
    public static void bartender(String name) {
        switch (name) {
            case "henk":
                System.out.println("Henk wil een biertje");
                break;
            case "loes":
                System.out.println("Loes wilt een cola");
                break;
            case "Kees":
                System.out.println("Kees wants a beer");
                break;
            case "Cassie":
                System.out.println("Cassie wants a withe wine");
                break;
            case "Jack":
                System.out.println("Jack wants a coke");
                break;
            case "Nicky":
                System.out.println("Nicky wants a red wine");
                break;
        }
    }
        public static void sum ( int input1, int input2){
            System.out.println(input1 + " summed with " + input2 + " = " + (input1 + input2));

        }
    }