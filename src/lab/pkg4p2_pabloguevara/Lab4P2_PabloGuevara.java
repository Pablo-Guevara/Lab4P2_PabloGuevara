package lab.pkg4p2_pabloguevara;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4P2_PabloGuevara {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<empleados> listaEmpleados = new ArrayList();

        int opcion = 0, opcionEmpleado = 0;
        String Usuario, Contraseña;

        Administrador Adm=new Administrador();
        
        while (opcion != 5) {
            try {

                System.out.println("1.Crear usuario: ");
                System.out.println("2.Iniciar sesión");
                System.out.println("Elija su opcion: ");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese nombre de usuario: ");
                    Usuario = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    Contraseña = leer.next();

                    if (Usuario.equals("admin") && Contraseña.equals("1234")) {
                        Adm.setUsuario(Usuario);
                        Adm.setContraseña(Contraseña);
                        listaEmpleados.add(Adm);
                        System.out.println("Se a ingresado un administrador al sistema");
                    }else{
                        System.out.println("¿Que tipo de empleado desea registrar?");
                        System.out.println("1.Desarrollador");
                        System.out.println("2.Consultor");
                        System.out.println("3.Director");
                        opcionEmpleado=leer.nextInt();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no se encuentra en la lista");
                leer.nextLine();
            }
        }

    }

}
