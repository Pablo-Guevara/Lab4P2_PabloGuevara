package lab.pkg4p2_pabloguevara;

import java.util.ArrayList;

public class proyecto {
    private String nombre;
    private String nombreEmpSolicitante;
    private String descripcion;
    private int cantAñosDuracion;
    private String EstadoActual;
    private ArrayList<Directores> DirectoresEncargados;
    private ArrayList<Desarrolladores> desarrolladoreses;
    private ArrayList<Consultores> Consultores;

    public proyecto() {
    }

    public proyecto(String nombre, String nombreEmpSolicitante, String descripcion, int cantAñosDuracion, String EstadoActual, ArrayList<Directores> DirectoresEncargados, ArrayList<Desarrolladores> desarrolladoreses, ArrayList<Consultores> Consultores) {
        this.nombre = nombre;
        this.nombreEmpSolicitante = nombreEmpSolicitante;
        this.descripcion = descripcion;
        this.cantAñosDuracion = cantAñosDuracion;
        this.EstadoActual = EstadoActual;
        this.DirectoresEncargados = DirectoresEncargados;
        this.desarrolladoreses = desarrolladoreses;
        this.Consultores = Consultores;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEmpSolicitante() {
        return nombreEmpSolicitante;
    }

    public void setNombreEmpSolicitante(String nombreEmpSolicitante) {
        this.nombreEmpSolicitante = nombreEmpSolicitante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantAñosDuracion() {
        return cantAñosDuracion;
    }

    public void setCantAñosDuracion(int cantAñosDuracion) {
        this.cantAñosDuracion = cantAñosDuracion;
    }

    public String getEstadoActual() {
        return EstadoActual;
    }

    public void setEstadoActual(String EstadoActual) {
        this.EstadoActual = EstadoActual;
    }

    public ArrayList<Directores> getDirectoresEncargados() {
        return DirectoresEncargados;
    }

    public void setDirectoresEncargados(ArrayList<Directores> DirectoresEncargados) {
        this.DirectoresEncargados = DirectoresEncargados;
    }

    public ArrayList<Desarrolladores> getDesarrolladoreses() {
        return desarrolladoreses;
    }

    public void setDesarrolladoreses(ArrayList<Desarrolladores> desarrolladoreses) {
        this.desarrolladoreses = desarrolladoreses;
    }

    public ArrayList<Consultores> getConsultores() {
        return Consultores;
    }

    public void setConsultores(ArrayList<Consultores> Consultores) {
        this.Consultores = Consultores;
    }

    @Override
    public String toString() {
        return super.toString()+"proyecto{" + "nombre=" + nombre + ", nombreEmpSolicitante=" + nombreEmpSolicitante + ", descripcion=" + descripcion + ", cantA\u00f1osDuracion=" + cantAñosDuracion + ", EstadoActual=" + EstadoActual + ", DirectoresEncargados=" + DirectoresEncargados + ", desarrolladoreses=" + desarrolladoreses + ", Consultores=" + Consultores + '}';
    }
    
    
}
