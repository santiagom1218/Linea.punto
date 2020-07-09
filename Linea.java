public class Linea{
  private  Punto c;
  private  Punto d;

  public Linea(){
    c=new Punto(0,0,0,0);
    d=new Punto(0,0,0,0);
  }
  
  public void setc(Punto c){
    this.c=c;
  }

  public Punto getc(){
    return this.c;
  }

  public void lectura(){
    c.leer();
    d.leer();
  }
  public void impresion(){
    c.imprimir();
    d.imprimir();
  }
  public void longitud(){
    c.distancia(c,d); 
  }
  public void lhor(){
    c.horizontal();
    d.horizontal();
  }
  public void lver(){
    c.vertical();
    d.vertical();
  }
  public void ldia(){
    c.diagonal(d);
    d.diagonal(d);
  } 
}