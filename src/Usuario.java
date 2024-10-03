import java.util.Date;

public class Usuario {

    private int id ;
    private String nombre;
    private int fechaDeNacimiento;
    private double saldo;
    private String fotoPerfil;
    private String biografia;

    // Trabaja con :
    private Wallet wallet;
    private Reserva reserva;
    private Publicacion publicacion;
    private Reseña reseña;


    public Usuario(int id, String nombre, int fechaDeNacimiento, double saldo, String fotoPerfil, String biografia) {
        this.id = id;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.saldo = saldo;
        this.fotoPerfil = fotoPerfil;
        this.biografia = biografia;
    }

    public int getId(){
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getFotoPerfil() {
        return fotoPerfil;
    }
    public String getBiografia() {
        return biografia;
    }
}
