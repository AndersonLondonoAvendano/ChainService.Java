import java.util.List;

public class Publicacion {

    private int id;
    private String titulo;
    private String descripcion;
    private double precio;
    private String ubicacion;
    private  int cantidadHabitaciones;
    private  int calificacion;
    private boolean disponibilidad;

    // Trabaja con

    private Inmuebles inmuebles;
    //se compone de
    private List<Resenia> resenias;


    public Publicacion(int id, String titulo, String descripcion, double precio, String ubicacion, int cantidadHabitaciones, int calificacion, boolean disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.calificacion = calificacion;
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "id: " + id+" Titulo: "+titulo+" Descripcion: "+descripcion+" Precio: "+precio+" Ubicacion: "+ ubicacion+" Calificacion: "+calificacion+" Disponibilidad: "+disponibilidad;
    }

    public  void  publicar(){

    }
    public void editarPublicacion(){

    }
    public void cancelarPublicacion(){

    }

}
