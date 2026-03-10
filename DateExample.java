import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nowYear = LocalDateTime.now().getYear();

        System.out.println("--------------------------------------");
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);

        System.out.println("--------------------------------------");

        System.out.print("Enter Your Name : ");
        String userName = sc.nextLine();

        System.out.print("Enter Your Gender: M / FM : ");
        String userGender = sc.nextLine();

        System.out.print("Enter Your Year of Birth : ");
        int userBirth = sc.nextInt();
        
        int checkBirth = nowYear - userBirth;

        if(!userGender.equalsIgnoreCase("M") && !userGender.equalsIgnoreCase("FM")){
            System.out.println("Please Type M or FM !!!");
            return;
        }
        
            
        if(checkBirth > 18 && userGender.equalsIgnoreCase("M") ){
            System.out.print(userName + " -- You can vote and seve nation -- You " + checkBirth  );
        }else if(checkBirth > 18){
            System.out.print(userName + " -- You can vote -- You " + checkBirth);
        }else{
            System.out.print(userName + " -- You can not vote You must 18 -- Now You " + checkBirth);
        }
        // System.out.print(checkBirth);
        
    }
}