import java.util.ArrayList;
import java.util.List;

public class Arrendatario extends Usuario{
    private List<Publicacion> publicaciones;
    private String propiedades;
    private double ganancias;

    public Arrendatario(int id, String nombre, int fechaDeNacimiento, double saldo, String fotoPerfil, String biografia, String propiedades, double ganancias) {
        super(id, nombre, fechaDeNacimiento, saldo, fotoPerfil, biografia);
        this.propiedades = propiedades;
        this.ganancias = ganancias;
        this.publicaciones = new ArrayList<>();
    }

    public void publicar(int id, String titulo, String descripcion, double precio, String ubicacion, int cantidadHabitaciones, int calificacion, boolean disponibilidad){
        Publicacion publicacion = new Publicacion(id,titulo,descripcion,precio,ubicacion,cantidadHabitaciones,calificacion,disponibilidad);
        publicaciones.add(publicacion);

    }
    public  void actualizarPublicacion(){

    }
    public  void cancelarPublicacion(){

    }
    public void verPublicaciones(){
        System.out.println("Publicaciones de "+getNombre());
        for (Publicacion publi: publicaciones){
            System.out.println(publicaciones);
        }
    }
    public void recibirPago(){

    }
}
