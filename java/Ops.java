class Cylinder{
private int radius;
private int height;


  public void set_height(int height){
    this.height = height;
  }

  public void set_radius(int radius){
    this.radius = radius;
  }

  public int get_radius(){
    return radius;
  }

  public int get_height(){
    return height;
  }

  public int area_of_cylinder(){
    return  22/7*radius*radius*height;
  }
  public int circumfrance_area_of_cylinder(){
    return 2*22/7*radius*height;
  }
}

public class Ops {

  public static void main(String[] args) {
    Cylinder C1 = new Cylinder();
    C1.set_height(76);
    C1.set_radius(18);
    System.out.println(C1.get_height());
    System.out.println(C1.get_radius());

    System.out.println(C1.area_of_cylinder());
    System.out.println(C1.circumfrance_area_of_cylinder());
  }
}

