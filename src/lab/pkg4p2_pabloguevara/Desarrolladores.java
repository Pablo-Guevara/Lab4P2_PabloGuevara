package lab.pkg4p2_pabloguevara;

public class Desarrolladores extends empleados{
   private String nombre;
   private String apellido;
   private long id;
   private String nacionalidad;
   private int cantProyectosRealizados;
   private int añosExperiencia;
   private int añosContrato;
   private String lenguajeProgaPreferido;
   private int horasTrabDiarias;
   private float sueldoMensual=0;

    public Desarrolladores() {
        super();
    }

    public Desarrolladores(String nombre, String apellido, long id, String nacionalidad, int añosExperiencia, int añosContrato, String lenguajeProgaPreferido, int horasTrabDiarias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosExperiencia = añosExperiencia;
        this.añosContrato = añosContrato;
        this.lenguajeProgaPreferido = lenguajeProgaPreferido;
        this.horasTrabDiarias = horasTrabDiarias;
    }

    public Desarrolladores(String nombre, String apellido, long id, String nacionalidad, int añosExperiencia, int añosContrato, String lenguajeProgaPreferido, int horasTrabDiarias, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.añosExperiencia = añosExperiencia;
        this.añosContrato = añosContrato;
        this.lenguajeProgaPreferido = lenguajeProgaPreferido;
        this.horasTrabDiarias = horasTrabDiarias;
    }

    public Desarrolladores(String nombre, String apellido, long id, String nacionalidad, int cantProyectosRealizados, int añosExperiencia, int añosContrato, String lenguajeProgaPreferido, int horasTrabDiarias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.cantProyectosRealizados = cantProyectosRealizados;
        this.añosExperiencia = añosExperiencia;
        this.añosContrato = añosContrato;
        this.lenguajeProgaPreferido = lenguajeProgaPreferido;
        this.horasTrabDiarias = horasTrabDiarias;
    }

    public Desarrolladores(String nombre, String apellido, long id, String nacionalidad, int cantProyectosRealizados, int añosExperiencia, int añosContrato, String lenguajeProgaPreferido, int horasTrabDiarias, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.cantProyectosRealizados = cantProyectosRealizados;
        this.añosExperiencia = añosExperiencia;
        this.añosContrato = añosContrato;
        this.lenguajeProgaPreferido = lenguajeProgaPreferido;
        this.horasTrabDiarias = horasTrabDiarias;
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

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosContrato() {
        return añosContrato;
    }

    public void setAñosContrato(int añosContrato) {
        this.añosContrato = añosContrato;
    }

    public String getLenguajeProgaPreferido() {
        return lenguajeProgaPreferido;
    }

    public void setLenguajeProgaPreferido(String lenguajeProgaPreferido) {
        this.lenguajeProgaPreferido = lenguajeProgaPreferido;
    }

    public int getHorasTrabDiarias() {
        return horasTrabDiarias;
    }

    public void setHorasTrabDiarias(int horasTrabDiarias) {
        this.horasTrabDiarias = horasTrabDiarias;
    }

    public float getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(float sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public String toString() {
        return super.toString()+"Desarrolladores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad + ", cantProyectosRealizados=" + cantProyectosRealizados + ", a\u00f1osExperiencia=" + añosExperiencia + ", a\u00f1osContrato=" + añosContrato + ", lenguajeProgaPreferido=" + lenguajeProgaPreferido + ", horasTrabDiarias=" + horasTrabDiarias + ", sueldoMensual=" + sueldoMensual + '}';
    }

    @Override
    public float sueldo() {
        sueldoMensual=(cantProyectosRealizados*115000*2)/cantProyectosRealizados+añosContrato;
         return sueldoMensual;
    }

    
   
}
