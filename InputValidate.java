// import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);

    int age = -1;

    while (age < 0 || age > 150){
        System.out.print("Input Your Age : ");
        age = sc.nextInt();
    }
    System.out.println("Register SuscessFull !!! \n You age is : " + age);
}