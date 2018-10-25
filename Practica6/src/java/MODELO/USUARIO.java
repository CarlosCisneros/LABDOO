package MODELO;

public final class USUARIO {
    private String usuario;
    private String contraseña;
    
    public USUARIO(String usuario, String contrasena){
        setUsuario(usuario);
        setContrasena(contrasena);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contraseña;
    }
    
    public void setContrasena(String contrasena) {
        this.contraseña = contrasena;
    }
}
