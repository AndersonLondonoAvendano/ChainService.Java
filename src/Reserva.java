public class Reserva {

    private int id;
    private int idPublicacion;
    private  double precio;
    private int cantidaDias;
    private int cantidadPersonas;
    private int cantidadHabitaciones;


    // Trabajan con
    private Factura factura;
    private Arrendador arrendador;

    public Reserva(int id, int idPublicacion, double precio, int cantidaDias, int cantidadPersonas, int cantidadHabitaciones) {
        this.id = id;
        this.idPublicacion = idPublicacion;
        this.precio = precio;
        this.cantidaDias = cantidaDias;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    @Override
    public String toString() {
        return "id: "+id+" Id publicacion: "+idPublicacion+" Precio de reserva: "+precio+" Cantidad de dias: "+cantidaDias+" Cantidad  de habitaciones: "+cantidadHabitaciones+" Cantidad de personas: "+cantidadPersonas;
    }

    public void pagar(){

    }
    public void pagarConCripto(){

    }
    public void cancelarPago(){

    }
    public void cancelarPagoConCripto(){}
}
