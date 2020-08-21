import java.util.Scanner;

public class Punto{
  private int x;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Punto{
  private int x;
  private int y;

  public Punto(int x, int y) {
      this.x = x;
      this.y = y;
  }
  
  public void setx(int x){
    this.x=x;
  }

  public int getx(){
    return this.x;
  }
  Scanner s= new Scanner(System.in);
  int z;
  float res;

  public void leer(){
    
    Scanner s=new Scanner(System.in);
    try
    {
      x=s.nextInt();
      y=s.nextInt();
    }
    catch(InputMismatchException ex)
    {
      System.out.println("\n(No es un numero, por defecto se le asigna 0");
      this.x=0;
      this.y=0;
    }
  }
  public void imprimir(){
    System.out.print("("+x+","+y+")");
  }
  public void distancia(Punto a,Punto b){
    res=(float)Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    System.out.print(res);
  }
  public void origen(){
    res=(float)Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    System.out.print("/distacia origen: "+res);
  }
  public void horizontal(){
    System.out.print("moviento horizontal: ");
    try{
      this.x+=s.nextInt();
    }catch(InputMismatchException ex){
      System.out.println("\n(No es un numero, por defecto se le asigna 0");
      this.x+=0;
    }
    
  }
  public void vertical(){
    System.out.print("moviento vertical: ");
    try{
      this.x+=s.nextInt();
    }catch(InputMismatchException ex){
     System.out.println("\n(No es un numero, por defecto se le asigna 0");
      this.y+=0;
    }
  }
  public void diagonal(Punto b){
    System.out.print("moviento diagonal: ");
     try{
      z=s.nextInt();
    }catch(InputMismatchException ex){
      System.out.println("\n(No es un numero, por defecto se le asigna 0");
      this.z=0;
    }
    this.x+=z;
    this.y+=z;
  } 
}
