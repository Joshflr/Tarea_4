import java.util.*;

public class Menu {
    private int n, opcion;
    private double cuenta1 = 500, cuenta2= 300, x = 0;
    private int depositoretiro;
    Scanner sc = new Scanner(System.in);

    public Menu(int n){
        this.n = n;
    }
    public void Opciones(){
        switch (n) {
            case 1:
                System.out.println("Ingrese No Cuenta: ");
                System.out.println("1. Cuenta No 1 \n2. Cuenta No 2");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Saldo cuenta No 1: "+cuenta1);
                        System.out.println("1. Depositar \n2. Retirar");
                        depositoretiro = sc.nextInt();
                        if (depositoretiro == 1) {
                            Sumar sumando = new Sumar(x,cuenta1, cuenta2);
                            sumando.CalculoCuenta1();

                        } else {
                            if (depositoretiro == 2) {
                                Restar restando = new Restar(x, cuenta1,cuenta2);
                               restando.CalculoCuenta1();
                            } else {
                                System.out.println("Opcion no encontrada");

                            }
                        }
                        break;
                    case 2:
                    System.out.println("Saldo cuenta No 2: "+cuenta2);
                    System.out.println("1. Depositar \n2. Retirar");
                    depositoretiro = sc.nextInt();
                    if (depositoretiro == 1) {
                        Sumar sumando = new Sumar(x, cuenta1,cuenta2);
                        sumando.CalculoCuenta2();

                    } else {
                        if (depositoretiro == 2) {
                            Restar restando = new Restar(x, cuenta1,cuenta2);
                           restando.CalculoCuenta2();

                        } else {
                            System.out.println("Opcion no encontrada");
                        }
                    }
                      break;
                    default: System.out.println("La cuenta que ingreso no existe");
                        break;
                }
                break;
            case 2:
                System.out.println("Ha salido del menu del Banco");
                break;
            default: System.out.println("La opcion seleccionada no existe");
                break;
        }
        sc.close();
    }
}
