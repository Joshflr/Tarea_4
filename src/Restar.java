import java.util.*;

public class Restar {
    private double x,cuenta1, cuenta2, resultado = 0;
    Scanner sc = new Scanner(System.in);

    public Restar(double x,double cuenta1, double cuenta2){
        this.x = x;
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void CalculoCuenta1(){
        System.out.print("Ingrese cantidad a retirar: ");
        x = sc.nextInt();
        resultado = cuenta1-x;

        if (resultado < 0) {
            System.out.println("Saldo insuficiente ");
        } else {
            System.out.println("Saldo cuenta No 1: "+resultado);
        }
    }

    public void CalculoCuenta2(){
        System.out.print("Ingrese cantidad a retirar: ");
        x = sc.nextInt();
        resultado = cuenta2-x;

        if (resultado < 0) {
            System.out.println("Saldo insuficiente ");
        } else {
            System.out.println("Saldo cuenta No 2: "+resultado);
        }
    }

}
