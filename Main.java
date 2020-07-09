class Main {
  public static void main(String[] args) {
    Punto a=new Punto(0,0,0,0);
    Punto b=new Punto(0,0,0,0); 
    System.out.print("punto A:");
    a.leer();
    System.out.print("punto B:");
    b.leer();
    System.out.print("A");
    a.imprimir();
    a.origen();
    System.out.print("B");
    b.imprimir();
    b.origen();
    System.out.print("distacia de los puntos: ");
    a.distancia(a,b);
    System.out.println("DESPLAZAMIENTO DEL PUNTO A ");
    a.horizontal();
    a.vertical();
    a.diagonal(b);
    System.out.println("DESPLAZAMIENTO DEL PUNTO B");
    b.horizontal();
    b.vertical();
    b.diagonal(b);
    System.out.print("A");
    a.imprimir();
    a.origen();
    System.out.print("B");
    b.imprimir();
    b.origen();
    System.out.print("distacia entre los puntos: ");
    a.distancia(a,b);
    Linea l=new Linea();
    System.out.print("Linea:");
    l.lectura();
    System.out.print("Longitud de la Linea: ");
    l.longitud();
    System.out.print("desplazamiento de la  Linea");
    System.out.println("");
    l.lhor();
    l.lver();
    l.ldia();
    l.impresion();
    System.out.print("Longitud de la Linea: ");
    l.longitud();
  }
}
