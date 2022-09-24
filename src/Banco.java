import java.util.*;

public class Banco {
 public static void main(String[] args) {
   int n = 0;
   /**/
   Scanner sc = new Scanner(System.in);
   System.out.println("Ingrese opcion :");
   System.out.println("1. Ingresar a cuentas");
   System.out.println("2. Salir del Banco");
   n = sc.nextInt();


   Menu MenuOpciones = new Menu(n);
   MenuOpciones.Opciones();
   sc.close();
 }
}
