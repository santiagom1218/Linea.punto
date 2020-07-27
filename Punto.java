import java.util.Scanner;

public class Punto{
  private int x;
  private int y;
  
  public Punto(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
      
  } 

  public void setx(int x){
    this.x=x;
  }

  public int getx(){
    return this.x;
  }
  Scanner s= new Scanner(System.in);
  int z;


  public void leer(){
    Scanner s= new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();
  }
  public void imprimir(){
    System.out.println("("+x+","+y+")");
  }
  public void distancia(Punto a,Punto b){
    res=(float)Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    System.out.println(distancia);
  }
  public void origen(){
    res=(float)Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    System.out.println("distacia origen: "+distancia);
    System.out.println("");
  }
  public void horizontal(){
    System.out.println("*horizontal: ");
    this.x+=s.nextInt();
  }
  public void vertical(){
    System.out.println("*vertical: ");
    this.y+=s.nextInt();
  }
  public void diagonal(Punto b){
    System.out.println("*diagonal: ");
    z=s.nextInt();
    this.x+=z;
    this.y+=z;
  }
  
}
