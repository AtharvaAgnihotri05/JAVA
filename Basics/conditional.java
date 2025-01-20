public class conditional {
    public static void main(String[] args) {
        // int age = 18;
        // if (age > 18)
        // {
        //     System.out.println("You are eligible to vote");
        // }
        // else
        // {
        //     System.out.println("You are not eligible to vote");
        // }

        // int amount = 300;
        // if (amount > 100 && amount < 300)
        // {
        //     System.out.println("Don't start SIP");
        // }
        // else if (amount > 300 && amount < 500) {
        //     System.out.println("Invest in 1 or 2 SIP");
        // }
        // else
        // {
        //     System.out.println("Invest in all type of CAP");
        // }

        //ternary operator
        int a = 12;
        int b = 10;
        int c = 120;

        int max;
        max = a > b ? a > c ? a : c : b > c ? b : c;   
        System.out.println("Max value is "+max);
    }
}
