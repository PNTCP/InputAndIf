// import java.util.Scanner;
import java.util.Random;

void main(){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numAns = 0;
        int numSus = rand.nextInt(100) + 1;
        int count = 0;
        int score = 100;

        while (numAns != numSus) {
            System.out.print("Input Number : ");
            numAns = sc.nextInt();

            if (numAns < numSus) {
                System.out.println("Lower Num!!");
                count++;
            } else if (numAns > numSus) {
                System.out.println("Too Much!!");
                count++;
            }
        }
        
        System.out.println("SuccessFull ");
        System.out.println("Your Score is : " +(score-count));


    }
