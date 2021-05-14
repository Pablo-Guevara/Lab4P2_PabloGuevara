package lab.pkg4p2_pabloguevara;

import java.util.ArrayList;

public class Directores extends empleados{
    private String nombre;
    private String apellido;
    private long id;
    private String nacionalidad;
    private int añosDurantePuesto;
    private int añosContrato;
    private ArrayList<Desarrolladores> desarrolladoresAsig;
    private int cantProyectosRealizados;
    private float sueldoMensual;

    public Directores() {
        super();
    }

    public Directores(String nombre, String apellido, long id, String nacionalidad, int añosDurantePuesto, int añosContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosDurantePuesto = añosDurantePuesto;
        this.añosContrato = añosContrato;
    }

    public Directores(String nombre, String apellido, long id, String nacionalidad, int añosDurantePuesto, int añosContrato, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosDurantePuesto = añosDurantePuesto;
        this.añosContrato = añosContrato;
    }

    public Directores(String nombre, String apellido, long id, String nacionalidad, int añosDurantePuesto, int añosContrato, ArrayList<Desarrolladores> desarrolladoresAsig, int cantProyectosRealizados, float sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosDurantePuesto = añosDurantePuesto;
        this.añosContrato = añosContrato;
        this.desarrolladoresAsig = desarrolladoresAsig;
        this.cantProyectosRealizados = cantProyectosRealizados;
        this.sueldoMensual = sueldoMensual;
    }

    public Directores(String nombre, String apellido, long id, String nacionalidad, int añosDurantePuesto, int añosContrato, ArrayList<Desarrolladores> desarrolladoresAsig, int cantProyectosRealizados, float sueldoMensual, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosDurantePuesto = añosDurantePuesto;
        this.añosContrato = añosContrato;
        this.desarrolladoresAsig = desarrolladoresAsig;
        this.cantProyectosRealizados = cantProyectosRealizados;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAñosDurantePuesto() {
        return añosDurantePuesto;
    }

    public void setAñosDurantePuesto(int añosDurantePuesto) {
        this.añosDurantePuesto = añosDurantePuesto;
    }

    public int getAñosContrato() {
        return añosContrato;
    }

    public void setAñosContrato(int añosContrato) {
        this.añosContrato = añosContrato;
    }

    public ArrayList<Desarrolladores> getDesarrolladoresAsig() {
        return desarrolladoresAsig;
    }

    public void setDesarrolladoresAsig(ArrayList<Desarrolladores> desarrolladoresAsig) {
        this.desarrolladoresAsig = desarrolladoresAsig;
    }

    public int getCantProyectosRealizados() {
        return cantProyectosRealizados;
    }

    public void setCantProyectosRealizados(int cantProyectosRealizados) {
        this.cantProyectosRealizados = cantProyectosRealizados;
    }

    public float getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(float sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public String toString() {
        return super.toString()+"Directores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad + ", a\u00f1osDurantePuesto=" + añosDurantePuesto + ", a\u00f1osContrato=" + añosContrato + ", desarrolladoresAsig=" + desarrolladoresAsig + ", cantProyectosRealizados=" + cantProyectosRealizados + ", sueldoMensual=" + sueldoMensual + '}';
    }

    @Override
    public float sueldo() {
        return sueldoMensual;
    }
    
    
    
}
