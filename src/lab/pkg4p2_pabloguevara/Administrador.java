
package lab.pkg4p2_pabloguevara;

public class Administrador extends empleados{

    private float sueldo;

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Administrador(float sueldo) {
        this.sueldo = sueldo;
    }

    public Administrador(float sueldo, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.sueldo = sueldo;
    }
    
    public Administrador() {
        super();
    }

    @Override
    public String toString() {
        return super.toString()+"Administardor{" + '}';
    }
    
    

    
    @Override
    public float sueldo() {
        return  sueldo;

    }
    
}
