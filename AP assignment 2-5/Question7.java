import java.util.Scanner;

class Question7{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int many=0;
        int sides=0;
        int total   = 0;
        String ans  = "y";
        int value=0;
        while (ans.equals("y")) {

            
            System.out.print("How many D6's do you want to roll? ");
            many = sc.nextInt();
            System.out.print("How many sides do these dice have? ");
            sides=sc.nextInt();
             
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < many; i++) {
                value=rollDie(sides);
                total = total + value;
                System.out.print(value + " ");
            }

            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");

            System.out.print("Again? [y,n] ");
            ans = sc.next();
            System.out.println("");  

        }
        System.out.print("Good-bye!");
    }

    public static int rollDie(int side){

       return (int) (Math.random()*side)+1;

    }
}

    
