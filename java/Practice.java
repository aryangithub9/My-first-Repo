class Player {
    String name ;
    float height;
    float weight;
    String nationality;

  public void show_player_details(){
    System.out.println("The name of the player is "+this.name);
    System.out.println("the height of the player is "+ this.height);
    System.out.println("The weight of the player is "+this.weight);
    System.out.println("The nationlity of the player is"+ this.nationality);

  }
  public float getheight(){
    return height;
  }
}

  public class Practice {
  
    public static void main(String[] args) {
      Player p1 = new Player();
      p1.name = "Aryan";
      p1.height = 1.78f;
      p1.weight = 65;
      p1.nationality = "Indian";

      p1.show_player_details();
      System.out.println(p1.height);
      System.out.println(p1.nationality);
      System.out.println(p1.getheight());
      
    }
  }