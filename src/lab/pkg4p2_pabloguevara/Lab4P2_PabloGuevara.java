package lab.pkg4p2_pabloguevara;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4P2_PabloGuevara {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<empleados> listaEmpleados = new ArrayList();
        ArrayList<proyecto> listaProyectos = new ArrayList();

        int opcion = 0, opcionEmpleado = 0, cicloEmpleado = 0;
        String Usuario, Contraseña, usuarioV, contraseñaV;

        Administrador Adm = new Administrador();

        while (opcion != 10) {
            try {

                System.out.println("1.Crear usuario: ");
                System.out.println("2.Iniciar sesión");
                System.out.println("3.Crear proyecto");
                System.out.println("4.Listar proyectos");
                System.out.println("5.Eliminar proyecto");
                System.out.println("6.Modificar proyecto");
                System.out.println("7.Listar empleados");
                System.out.println("8.Eliminar empleados");
                System.out.println("9.Modificar empleados");
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
                    } else {
                        System.out.println("Ingrese nombre de usuario: ");
                        usuarioV = leer.next();
                        System.out.println("Ingrese contraseña: ");
                        contraseñaV = leer.next();

                        if (Usuario.equals("admin") && Contraseña.equals("1234")) {
                            while (cicloEmpleado == 0) {
                                try {
                                    System.out.println("¿Que tipo de empleado desea registrar?");
                                    System.out.println("1.Desarrollador");
                                    System.out.println("2.Consultor");
                                    System.out.println("3.Director");
                                    opcionEmpleado = leer.nextInt();
                                    if (opcionEmpleado == 1 || opcionEmpleado == 2 || opcionEmpleado == 3) {
                                        cicloEmpleado = 1;
                                    } else {
                                        System.out.println("Valor inválido");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no se encuentra en la lista de empleados");
                                    leer.nextLine();
                                }
                            }
                        } else {
                            System.out.println("No tiene permisos para agregar nuevos usuarios");
                        }
                        //Creación desarrollador
                        if (opcionEmpleado == 1) {
                            String nombre;
                            String apellido;

                            long ID = 0;
                            int cicloId = 0;

                            String nacionalidad;

                            int cantProyectosRealizados = 0;

                            int añosExperiencia = 0;
                            int cicloAñosExp = 0;

                            int añosContrato = 0;
                            int cicloContrato = 0;

                            String lenguajeProgaPreferido = "";

                            int horasTrabDiarias = 0;
                            int cicloHorasTrab = 0;

                            float sueldoMensual = 0;

                            System.out.println("Ingrese nombre del desarrollador: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido del desarrollador: ");
                            apellido = leer.next();

                            while (cicloId == 0) {
                                try {
                                    System.out.println("Ingrese ID del desarrolador: ");
                                    ID = leer.nextLong();
                                    cicloId = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un ID");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese nacionalidad del desarrollador: ");
                            nacionalidad = leer.next();

                            while (cicloAñosExp == 0) {
                                try {
                                    System.out.println("Ingrese los años de experiencia del desarrolador: ");
                                    añosExperiencia = leer.nextInt();
                                    cicloAñosExp = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un válido");
                                    leer.nextLine();
                                }
                            }

                            while (cicloContrato == 0) {
                                try {
                                    System.out.println("Ingrese los años de contrato del desarrolador: ");
                                    añosContrato = leer.nextInt();
                                    cicloContrato = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un válido");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese lenguaje de programación"
                                    + "preferido del desarrollador: ");
                            lenguajeProgaPreferido = leer.next();

                            while (cicloHorasTrab == 0) {
                                try {
                                    System.out.println("Ingrese las horas trabajadas del desarrolador: ");
                                    horasTrabDiarias = leer.nextInt();
                                    cicloHorasTrab = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un válido");
                                    leer.nextLine();
                                }
                            }

                            listaEmpleados.add(new Desarrolladores(nombre, apellido, ID, nacionalidad, añosExperiencia, añosContrato, lenguajeProgaPreferido, horasTrabDiarias, Usuario, Contraseña));

                            /////Antes if 1
                        }
                        //Creación director
                        if (opcionEmpleado == 2) {
                            String nombre;
                            String apellido;

                            long ID = 0;
                            int cicloId = 0;

                            String nacionalidad;

                            int añosDurantePuesto = 0;
                            int cicloAñosPuesto = 0;

                            int añosContrato = 0;
                            int cicloAñosContrato = 0;

                            System.out.println("Ingrese nombre del director: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido del director: ");
                            apellido = leer.next();

                            while (cicloId == 0) {
                                try {
                                    System.out.println("Ingrese ID del director: ");
                                    ID = leer.nextLong();
                                    cicloId = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un ID");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese nacionalidad del director: ");
                            nacionalidad = leer.next();

                            while (cicloAñosPuesto == 0) {
                                try {
                                    System.out.println("Ingrese los años del puesto del director: ");
                                    añosDurantePuesto = leer.nextInt();
                                    cicloAñosPuesto = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }

                            while (cicloAñosContrato == 0) {
                                try {
                                    System.out.println("Ingrese los años de contrato del director: ");
                                    añosContrato = leer.nextInt();
                                    cicloAñosContrato = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }

                            listaEmpleados.add(new Directores(nombre, apellido, ID, nacionalidad, añosDurantePuesto, añosContrato, Usuario, Contraseña));
                            //Antes Fin 2 
                        }
                        //Creacion consultores
                        if (opcionEmpleado == 3) {
                            String nombre;
                            String apellido;

                            long id = 0;
                            int cicloId = 0;

                            String nacionalidad;

                            int añosContrato = 0;
                            int cicloAñosContrato = 0;

                            String prinCampoExp;

                            float tiempDurConsul = 0;
                            int cicloTiempoDurConsult = 0;

                            System.out.println("Ingrese nombre del consultor: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido del consultor: ");
                            apellido = leer.next();

                            while (cicloId == 0) {
                                try {
                                    System.out.println("Ingrese ID del consultor: ");
                                    id = leer.nextLong();
                                    cicloId = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un ID");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese nacionalidad del consultor: ");
                            nacionalidad = leer.next();

                            while (cicloAñosContrato == 0) {
                                try {
                                    System.out.println("Ingrese los años de contrato del consultor: ");
                                    añosContrato = leer.nextInt();
                                    cicloAñosContrato = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese principal campo de experiencia del consultor: ");
                            prinCampoExp = leer.next();

                            while (cicloTiempoDurConsult == 0) {
                                try {
                                    System.out.println("Ingrese el tiempo de duracion de la consulta del consultor: ");
                                    tiempDurConsul = leer.nextFloat();
                                    cicloTiempoDurConsult = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }

                            listaEmpleados.add(new Consultores(nombre, apellido, id, nacionalidad, añosContrato, prinCampoExp, tiempDurConsul, Usuario, Contraseña));
                        }//Fin 3
                    }//Obtener usuario y contraseña
                    int opcDirec = 0, cicloDirec = 0;
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        if (Usuario.equals(listaEmpleados.get(i).getUsuario()) && Contraseña.equals(listaEmpleados.get(i).getContraseña())) {
                            if (listaEmpleados.get(i).getClass().getSimpleName().equals("Directores")) {

                                while (cicloDirec == 0) {
                                    try {
                                        System.out.println("1.Crear consultor");
                                        System.out.println("2.Crear desarrollador");
                                        System.out.println("Ingrese su opcion: ");
                                        opcDirec = leer.nextInt();

                                        if (opcDirec == 1 || opcDirec == 2) {
                                            cicloEmpleado = 1;
                                        } else {
                                            System.out.println("Valor inválido");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("El valor ingresado no es válido");
                                        leer.nextLine();
                                    }
                                }

                                //Creacion consultor por director
                                if (opcDirec == 1) {
                                    String nombre;
                                    String apellido;

                                    long id = 0;
                                    int cicloId = 0;

                                    String nacionalidad;

                                    int añosContrato = 0;
                                    int cicloAñosContrato = 0;

                                    String prinCampoExp;

                                    float tiempDurConsul = 0;
                                    int cicloTiempoDurConsult = 0;

                                    System.out.println("Ingrese nombre del consultor: ");
                                    nombre = leer.next();
                                    System.out.println("Ingrese apellido del consultor: ");
                                    apellido = leer.next();

                                    while (cicloId == 0) {
                                        try {
                                            System.out.println("Ingrese ID del consultor: ");
                                            id = leer.nextLong();
                                            cicloId = 1;
                                        } catch (InputMismatchException e) {
                                            System.out.println("El valor ingresado no es un ID");
                                            leer.nextLine();
                                        }
                                    }

                                    System.out.println("Ingrese nacionalidad del consultor: ");
                                    nacionalidad = leer.next();

                                    while (cicloAñosContrato == 0) {
                                        try {
                                            System.out.println("Ingrese los años de contrato del consultor: ");
                                            añosContrato = leer.nextInt();
                                            cicloAñosContrato = 1;
                                        } catch (InputMismatchException e) {
                                            System.out.println("El valor ingresado no es válido");
                                            leer.nextLine();
                                        }
                                    }

                                    System.out.println("Ingrese principal campo de experiencia del consultor: ");
                                    prinCampoExp = leer.next();

                                    while (cicloTiempoDurConsult == 0) {
                                        try {
                                            System.out.println("Ingrese el tiempo de duracion de la consulta del consultor: ");
                                            tiempDurConsul = leer.nextFloat();
                                            cicloTiempoDurConsult = 1;
                                        } catch (InputMismatchException e) {
                                            System.out.println("El valor ingresado no es válido");
                                            leer.nextLine();
                                        }
                                    }

                                    listaEmpleados.add(new Consultores(nombre, apellido, id, nacionalidad, añosContrato, prinCampoExp, tiempDurConsul, Usuario, Contraseña));
                                }//Fin creacion consultor por director
                                if (opcDirec == 2) {
                                    String nombre;
                                    String apellido;

                                    long ID = 0;
                                    int cicloId = 0;

                                    String nacionalidad;

                                    int cantProyectosRealizados = 0;

                                    int añosExperiencia = 0;
                                    int cicloAñosExp = 0;

                                    int añosContrato = 0;
                                    int cicloContrato = 0;

                                    String lenguajeProgaPreferido = "";

                                    int horasTrabDiarias = 0;
                                    int cicloHorasTrab = 0;

                                    float sueldoMensual = 0;

                                    System.out.println("Ingrese nombre del desarrollador: ");
                                    nombre = leer.next();
                                    System.out.println("Ingrese apellido del desarrollador: ");
                                    apellido = leer.next();

                                    while (cicloId == 0) {
                                        try {
                                            System.out.println("Ingrese ID del desarrolador: ");
                                            ID = leer.nextLong();
                                            cicloId = 1;
                                        } catch (InputMismatchException e) {
                                            System.out.println("El valor ingresado no es un ID");
                                            leer.nextLine();
                                        }
                                    }

                                    System.out.println("Ingrese nacionalidad del desarrollador: ");
                                    nacionalidad = leer.next();

                                    while (cicloAñosExp == 0) {
                                        try {
                                            System.out.println("Ingrese los años de experiencia del desarrolador: ");
                                            añosExperiencia = leer.nextInt();
                                            cicloAñosExp = 1;
                                        } catch (InputMismatchException e) {
                                            System.out.println("El valor ingresado no es un válido");
                                            leer.nextLine();
                                        }
                                    }

                                    while (cicloContrato == 0) {
                                        try {
                                            System.out.println("Ingrese los años de contrato del desarrolador: ");
                                            añosContrato = leer.nextInt();
                                            cicloContrato = 1;
                                        } catch (InputMismatchException e) {
                                            System.out.println("El valor ingresado no es un válido");
                                            leer.nextLine();
                                        }
                                    }

                                    System.out.println("Ingrese lenguaje de programación"
                                            + "preferido del desarrollador: ");
                                    lenguajeProgaPreferido = leer.next();

                                    while (cicloHorasTrab == 0) {
                                        try {
                                            System.out.println("Ingrese las horas trabajadas del desarrolador: ");
                                            horasTrabDiarias = leer.nextInt();
                                            cicloHorasTrab = 1;
                                        } catch (InputMismatchException e) {
                                            System.out.println("El valor ingresado no es un válido");
                                            leer.nextLine();
                                        }
                                    }
                                    Desarrolladores D = new Desarrolladores();
                                    listaEmpleados.add(new Desarrolladores(nombre, apellido, ID, nacionalidad, añosExperiencia, añosContrato, lenguajeProgaPreferido, horasTrabDiarias, Usuario, Contraseña));

                                    /////Antes if 1
                                }
                            }
                        }
                    }
                }

                if (opcion == 3) {
                    String usuario3, contraseña3;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario3 = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña3 = leer.next();

                    if (usuario3.equals("admin") && contraseña3.equals("1234")) {

                        String nombre;
                        String nombreEmpSolicitante;
                        String descripcion;

                        int cantAñosDuracion = 0;
                        int cicloAñosDuracion = 0;

                        String EstadoActual = "";
                        int opcEstado = 0;
                        int cicloOpcEstado = 0;

                        System.out.println("Ingrese nombre del proyecto: ");
                        nombre = leer.next();

                        System.out.println("Ingrese nombre de la empresa solicitante del proyecto: ");
                        nombreEmpSolicitante = leer.next();

                        System.out.println("Ingrese descripcion del proyecto: ");
                        descripcion = leer.next();

                        while (cicloAñosDuracion == 0) {
                            try {
                                System.out.println("Ingrese la cantidad de años de duracion del proyecto: ");
                                cantAñosDuracion = leer.nextInt();
                                cicloAñosDuracion = 1;
                            } catch (InputMismatchException e) {
                                System.out.println("El valor ingresado no es un válido");
                                leer.nextLine();
                            }
                        }
                        while (cicloOpcEstado == 0) {
                            try {
                                System.out.println("Ingrese estado actual del proyecto: ");
                                System.out.println("1.Iniciando");
                                System.out.println("2.En desarrollo");
                                System.out.println("3.Terminado");
                                System.out.println("Ingrese su opcion: ");
                                opcEstado = leer.nextInt();
                                if (opcEstado == 1) {
                                    EstadoActual = "Iniciando";
                                }
                                if (opcEstado == 2) {
                                    EstadoActual = "En desarrollo";
                                }
                                if (opcEstado == 3) {
                                    EstadoActual = "Terminado";
                                }
                                if (opcEstado == 1 || opcEstado == 2 || opcEstado == 3) {
                                    cicloOpcEstado = 1;
                                } else {
                                    System.out.println("Valor inválido");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("El valor ingresado no se encuentra en la lista de empleados");
                                leer.nextLine();
                            }
                        }

                        listaProyectos.add(new proyecto(nombre, nombreEmpSolicitante, descripcion, cantAñosDuracion, EstadoActual));
                    } else {
                        System.out.println("El usuario no tiene permisos para ingresar.");
                    }
                }//Fin 3

                if (opcion == 4) {
                    String usuario3, contraseña3;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario3 = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña3 = leer.next();

                    if (usuario3.equals("admin") && contraseña3.equals("1234")) {
                        for (int i = 0; i < listaProyectos.size(); i++) {
                            System.out.println(i + "-" + listaProyectos.get(i));
                        }
                    } else {
                        System.out.println("El usuario no tiene permisos para ingresar.");
                    }
                }//FIN4

                if (opcion == 5) {
                    String usuario3, contraseña3;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario3 = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña3 = leer.next();

                    if (usuario3.equals("admin") && contraseña3.equals("1234")) {
                        for (int i = 0; i < listaProyectos.size(); i++) {
                            System.out.println(i + " " + listaProyectos.get(i));
                        }
                        System.out.println("Ingrese posición a eliminar: ");
                        int posicionEli = leer.nextInt();
                        listaProyectos.remove(posicionEli);
                    } else {
                        System.out.println("El usuario no tiene permisos para ingresar.");
                    }

                }//FIn 5

                if (opcion == 6) {
                    String usuario3, contraseña3;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario3 = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña3 = leer.next();

                    if (usuario3.equals("admin") && contraseña3.equals("1234")) {
                        for (int i = 0; i < listaProyectos.size(); i++) {
                            System.out.println(i + " " + listaProyectos.get(i));
                        }
                        System.out.println("Ingrese posición a modificar: ");
                        int posicionMod = leer.nextInt();

                        String nombre;
                        String nombreEmpSolicitante;
                        String descripcion;

                        int cantAñosDuracion = 0;
                        int cicloAñosDuracion = 0;

                        String EstadoActual = "";
                        int opcEstado = 0;
                        int cicloOpcEstado = 0;

                        System.out.println("Ingrese nombre del proyecto: ");
                        nombre = leer.next();

                        System.out.println("Ingrese nombre de la empresa solicitante del proyecto: ");
                        nombreEmpSolicitante = leer.next();

                        System.out.println("Ingrese descripcion del proyecto: ");
                        descripcion = leer.next();

                        while (cicloAñosDuracion == 0) {
                            try {
                                System.out.println("Ingrese la cantidad de años de duracion del proyecto: ");
                                cantAñosDuracion = leer.nextInt();
                                cicloAñosDuracion = 1;
                            } catch (InputMismatchException e) {
                                System.out.println("El valor ingresado no es un válido");
                                leer.nextLine();
                            }
                        }
                        while (cicloOpcEstado == 0) {
                            try {
                                System.out.println("Ingrese estado actual del proyecto: ");
                                System.out.println("1.Iniciando");
                                System.out.println("2.En desarrollo");
                                System.out.println("3.Terminado");
                                System.out.println("Ingrese su opcion: ");
                                opcEstado = leer.nextInt();
                                if (opcEstado == 1) {
                                    EstadoActual = "Iniciando";
                                }
                                if (opcEstado == 2) {
                                    EstadoActual = "En desarrollo";
                                }
                                if (opcEstado == 3) {
                                    EstadoActual = "Terminado";
                                }
                                if (opcEstado == 1 || opcEstado == 2 || opcEstado == 3) {
                                    cicloOpcEstado = 1;
                                } else {
                                    System.out.println("Valor inválido");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("El valor ingresado no se encuentra en la lista de empleados");
                                leer.nextLine();
                            }

                        }
                        listaProyectos.remove(posicionMod);
                        listaProyectos.add(posicionMod, new proyecto(nombre, nombreEmpSolicitante, descripcion, cantAñosDuracion, EstadoActual));
                    } else {
                        System.out.println("El usuario no tiene permisos para ingresar.");
                    }

                }//Fin 6

                if (opcion == 7) {
                    String usuario3, contraseña3;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario3 = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña3 = leer.next();

                    if (usuario3.equals("admin") && contraseña3.equals("1234")) {
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            System.out.println(i + "-" + listaEmpleados.get(i));
                        }
                    } else {
                        System.out.println("El usuario no tiene permisos para ingresar.");
                    }
                }//Fin 7

                if (opcion == 8) {
                    String usuario3, contraseña3;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario3 = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña3 = leer.next();

                    if (usuario3.equals("admin") && contraseña3.equals("1234")) {
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            System.out.println(i + " " + listaEmpleados.get(i));
                        }
                        System.out.println("Ingrese posición a eliminar: ");
                        int posicionEli = leer.nextInt();
                        listaEmpleados.remove(posicionEli);
                    } else {
                        System.out.println("El usuario no tiene permisos para ingresar.");
                    }
                }//Fin 8

                if (opcionEmpleado == 9) {
                    String usuario3, contraseña3;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario3 = leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña3 = leer.next();

                    if (usuario3.equals("admin") && contraseña3.equals("1234")) {
                        for (int i = 0; i < listaProyectos.size(); i++) {
                            System.out.println(i + " " + listaProyectos.get(i));
                        }
                        System.out.println("Ingrese posición a modificar: ");
                        int posicionMod = leer.nextInt();
                        //MODIFICAR DESARROLLADOR
                        if (listaEmpleados.get(posicionMod).getClass().getSimpleName().equals("Desarrolladores")) {
                            String nombre;
                            String apellido;

                            long ID = 0;
                            int cicloId = 0;

                            String nacionalidad;

                            int cantProyectosRealizados = 0;

                            int añosExperiencia = 0;
                            int cicloAñosExp = 0;

                            int añosContrato = 0;
                            int cicloContrato = 0;

                            String lenguajeProgaPreferido = "";

                            int horasTrabDiarias = 0;
                            int cicloHorasTrab = 0;

                            float sueldoMensual = 0;

                            System.out.println("Ingrese nombre del desarrollador: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido del desarrollador: ");
                            apellido = leer.next();

                            while (cicloId == 0) {
                                try {
                                    System.out.println("Ingrese ID del desarrolador: ");
                                    ID = leer.nextLong();
                                    cicloId = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un ID");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese nacionalidad del desarrollador: ");
                            nacionalidad = leer.next();

                            while (cicloAñosExp == 0) {
                                try {
                                    System.out.println("Ingrese los años de experiencia del desarrolador: ");
                                    añosExperiencia = leer.nextInt();
                                    cicloAñosExp = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un válido");
                                    leer.nextLine();
                                }
                            }

                            while (cicloContrato == 0) {
                                try {
                                    System.out.println("Ingrese los años de contrato del desarrolador: ");
                                    añosContrato = leer.nextInt();
                                    cicloContrato = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un válido");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese lenguaje de programación"
                                    + "preferido del desarrollador: ");
                            lenguajeProgaPreferido = leer.next();

                            while (cicloHorasTrab == 0) {
                                try {
                                    System.out.println("Ingrese las horas trabajadas del desarrolador: ");
                                    horasTrabDiarias = leer.nextInt();
                                    cicloHorasTrab = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un válido");
                                    leer.nextLine();
                                }
                            }
                            listaEmpleados.remove(posicionMod);
                            listaEmpleados.add(posicionMod, new Desarrolladores(nombre, apellido, ID, nacionalidad, añosExperiencia, añosContrato, lenguajeProgaPreferido, horasTrabDiarias));

                        }//FIN MOD DESARROLLADOR

                        //MODIFICAR Consultores
                        if (listaEmpleados.get(posicionMod).getClass().getSimpleName().equals("Consultores")) {
                            String nombre;
                            String apellido;

                            long id = 0;
                            int cicloId = 0;

                            String nacionalidad;

                            int añosContrato = 0;
                            int cicloAñosContrato = 0;

                            String prinCampoExp;

                            float tiempDurConsul = 0;
                            int cicloTiempoDurConsult = 0;

                            System.out.println("Ingrese nombre del consultor: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido del consultor: ");
                            apellido = leer.next();

                            while (cicloId == 0) {
                                try {
                                    System.out.println("Ingrese ID del consultor: ");
                                    id = leer.nextLong();
                                    cicloId = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un ID");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese nacionalidad del consultor: ");
                            nacionalidad = leer.next();

                            while (cicloAñosContrato == 0) {
                                try {
                                    System.out.println("Ingrese los años de contrato del consultor: ");
                                    añosContrato = leer.nextInt();
                                    cicloAñosContrato = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese principal campo de experiencia del consultor: ");
                            prinCampoExp = leer.next();

                            while (cicloTiempoDurConsult == 0) {
                                try {
                                    System.out.println("Ingrese el tiempo de duracion de la consulta del consultor: ");
                                    tiempDurConsul = leer.nextFloat();
                                    cicloTiempoDurConsult = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }
                            listaEmpleados.remove(posicionMod);
                            listaEmpleados.add(posicionMod, new Consultores(nombre, apellido, id, nacionalidad, añosContrato, prinCampoExp, tiempDurConsul));
                        }//Fin mod consultor
                        //MODIFICAR director
                        if (listaEmpleados.get(posicionMod).getClass().getSimpleName().equals("Directores")) {
                            String nombre;
                            String apellido;

                            long ID = 0;
                            int cicloId = 0;

                            String nacionalidad;

                            int añosDurantePuesto = 0;
                            int cicloAñosPuesto = 0;

                            int añosContrato = 0;
                            int cicloAñosContrato = 0;

                            System.out.println("Ingrese nombre del director: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido del director: ");
                            apellido = leer.next();

                            while (cicloId == 0) {
                                try {
                                    System.out.println("Ingrese ID del director: ");
                                    ID = leer.nextLong();
                                    cicloId = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es un ID");
                                    leer.nextLine();
                                }
                            }

                            System.out.println("Ingrese nacionalidad del director: ");
                            nacionalidad = leer.next();

                            while (cicloAñosPuesto == 0) {
                                try {
                                    System.out.println("Ingrese los años del puesto del director: ");
                                    añosDurantePuesto = leer.nextInt();
                                    cicloAñosPuesto = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }

                            while (cicloAñosContrato == 0) {
                                try {
                                    System.out.println("Ingrese los años de contrato del director: ");
                                    añosContrato = leer.nextInt();
                                    cicloAñosContrato = 1;
                                } catch (InputMismatchException e) {
                                    System.out.println("El valor ingresado no es válido");
                                    leer.nextLine();
                                }
                            }
                            listaEmpleados.remove(posicionMod);
                            listaEmpleados.add(posicionMod, new Directores(nombre, apellido, ID, nacionalidad, añosDurantePuesto, añosContrato));

                        }
                        //Fin modificar director
                    }
                }//Fin 9
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no se encuentra en la lista");
                leer.nextLine();
            }
        }
        System.out.println(listaEmpleados);
    }

}
