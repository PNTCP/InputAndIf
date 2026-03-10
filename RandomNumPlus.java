// import java.util.Scanner;
import java.util.Random;

void main(){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numAns = 0;
        int numSus = rand.nextInt(100) + 1;

        while (numAns != numSus) {
            System.out.print("Input Number : ");
            numAns = sc.nextInt();

            if (numAns < numSus) {
                System.out.println("Near Be!!");
            } else if (numAns > numSus) {
                System.out.println("Too Much!!");
            }
        }

        System.out.println("SuccessFull");
    }
