package lab.pkg4p2_pabloguevara;

import java.util.ArrayList;

public abstract class empleados {
    private String usuario;
    private String contraseña;
      protected ArrayList proyectosAsingados;

    public ArrayList getProyectosAsingados() {
        return proyectosAsingados;
    }

    public void setProyectosAsingados(ArrayList proyectosAsingados) {
        this.proyectosAsingados = proyectosAsingados;
    }

    public empleados() {
    }

    public empleados(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public abstract float sueldo();
}
