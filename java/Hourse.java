public class Hourse {

  public static void traversal2darray(int[][] arr){
    for(int i =0; i<arr.length; i++){
      for(int j =0; i<arr[i].length; j++){
        System.out.println([i][j]+"");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int [] [] array = {{1,2,4},{1,2,5}};
    traversal2darray(array);
    
  }
}