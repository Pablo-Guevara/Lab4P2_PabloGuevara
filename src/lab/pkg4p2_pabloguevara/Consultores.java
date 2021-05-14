package lab.pkg4p2_pabloguevara;

public class Consultores extends empleados{
     private String nombre;
    private String apellido;
    private long id;
    private String nacionalidad;
    private int cantProyectosRealizados;
    private int añosContrato;
    private String prinCampoExp;
    private float tiempDurConsul;

    public Consultores() {
        super();
    }

    public Consultores(String nombre, String apellido, long id, String nacionalidad, int añosContrato, String prinCampoExp, float tiempDurConsul) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosContrato = añosContrato;
        this.prinCampoExp = prinCampoExp;
        this.tiempDurConsul = tiempDurConsul;
    }

    public Consultores(String nombre, String apellido, long id, String nacionalidad, int añosContrato, String prinCampoExp, float tiempDurConsul, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosContrato = añosContrato;
        this.prinCampoExp = prinCampoExp;
        this.tiempDurConsul = tiempDurConsul;
    }

    public Consultores(String nombre, String apellido, long id, String nacionalidad, int cantProyectosRealizados, int añosContrato, String prinCampoExp, float tiempDurConsul) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.cantProyectosRealizados = cantProyectosRealizados;
        this.añosContrato = añosContrato;
        this.prinCampoExp = prinCampoExp;
        this.tiempDurConsul = tiempDurConsul;
    }

    public Consultores(String nombre, String apellido, long id, String nacionalidad, int cantProyectosRealizados, int añosContrato, String prinCampoExp, float tiempDurConsul, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.cantProyectosRealizados = cantProyectosRealizados;
        this.añosContrato = añosContrato;
        this.prinCampoExp = prinCampoExp;
        this.tiempDurConsul = tiempDurConsul;
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

    public int getCantProyectosRealizados() {
        return cantProyectosRealizados;
    }

    public void setCantProyectosRealizados(int cantProyectosRealizados) {
        this.cantProyectosRealizados = cantProyectosRealizados;
    }

    public int getAñosContrato() {
        return añosContrato;
    }

    public void setAñosContrato(int añosContrato) {
        this.añosContrato = añosContrato;
    }

    public String getPrinCampoExp() {
        return prinCampoExp;
    }

    public void setPrinCampoExp(String prinCampoExp) {
        this.prinCampoExp = prinCampoExp;
    }

    public float getTiempDurConsul() {
        return tiempDurConsul;
    }

    public void setTiempDurConsul(float tiempDurConsul) {
        this.tiempDurConsul = tiempDurConsul;
    }

    @Override
    public String toString() {
        return super.toString()+ "Consultores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad + ", cantProyectosRealizados=" + cantProyectosRealizados + ", a\u00f1osContrato=" + añosContrato + ", prinCampoExp=" + prinCampoExp + ", tiempDurConsul=" + tiempDurConsul + '}';
    }

    @Override
    public float sueldo() {
        return tiempDurConsul;
    }
    
        
}
