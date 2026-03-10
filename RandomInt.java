// import java.util.Scanner;
void main(){
            Scanner sc = new Scanner(System.in);

            int numAns = 0;
            int numSus = 13;

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