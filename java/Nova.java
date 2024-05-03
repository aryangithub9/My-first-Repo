import java.util.*;
public class Nova {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks in 1st subject");
    byte sub1 = sc.nextByte();
    System.out.println("Enter your marks in 2st subject");
    byte sub2 = sc.nextByte();
    System.out.println("Enter your marks in 3st subject");
    byte sub3 = sc.nextByte();
    System.out.println("Enter your marks in 4st subject");
    byte sub4 = sc.nextByte();
    System.out.println("Enter your marks in 5st subject");
    byte sub5 = sc.nextByte();

    float persentage = (sub1+sub2+sub3+sub4+sub5)/5.0f;
    System.out.println("here is your persentage");
    System.out.println(persentage);


    if(sub1>33 && sub2>33 && sub3>33 && sub4> 33&& sub5>33 && persentage>35){
      System.out.println("you sucessfully pass the exam congratulations");
      System.out.println("you  will get about 1000$ award from univeersity");
    }
    else{
      System.out.println("you are failed better luck for next time");
    }

    

    
  }
}
