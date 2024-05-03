import java.util.*;
public class yoo {
  public static int [] bestscore(int [] arr){
    int firstlargest  = Integer.MIN_VALUE;
    int secoundlargest = Integer.MIN_VALUE;

    for(int score : arr){
      if(score>firstlargest){
        firstlargest = secoundlargest;
        firstlargest = score;
      }
      else if (score>secoundlargest && score<firstlargest){
        secoundlargest = score;
      }
    }
    return new int[]{firstlargest,secoundlargest};
  }

  public static void main(String[] args) {
    int [] arr = {1,2,3,4,55,6,7,8,9};
    int [] b = bestscore(arr);
    System.out.println(Arrays.toString(b));
    
  }
}