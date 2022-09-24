import java.util.*;

public class Sumar {
    private double x,cuenta1, cuenta2, resultado = 0;
    Scanner sc = new Scanner(System.in);

    public Sumar(double x,double cuenta1, double cuenta2){
        this.x = x;
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void CalculoCuenta1(){
        System.out.print("Ingrese cantidad a abonar: ");
        x = sc.nextInt();
        resultado = x+cuenta1;
        System.out.println("Saldo cuenta No 1: "+resultado);
    }
    public void CalculoCuenta2(){
        System.out.print("Ingrese cantidad a abonar: ");
        x = sc.nextInt();
        resultado = x+cuenta2;
        System.out.println("Saldo cuenta No 1: "+resultado);
    }
}
