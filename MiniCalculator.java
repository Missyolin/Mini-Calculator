import java.util.Scanner;
public class MiniCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        double z;
        String operator;
        System.out.println("please input the operate: ");
        operator = sc.nextLine();
        System.out.println("input your first number: ");
        x = sc.nextInt();
        System.out.println("input your second number: ");
        y = sc.nextInt();
        System.out.println("============================");

        switch(operator){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            
        }

    }
}