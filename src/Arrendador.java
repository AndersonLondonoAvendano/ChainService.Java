import java.util.ArrayList;
import java.util.List;

public class Arrendador extends Usuario{

    private int cantidadReservas;
    private List<Reserva>reservas;

    public Arrendador(int id, String nombre, int fechaDeNacimiento, double saldo, String fotoPerfil, String biografia) {
        super(id, nombre, fechaDeNacimiento, saldo, fotoPerfil, biografia);
        this.reservas = new ArrayList<>();
    }

    public void verReservas(){
        System.out.println("Reservas de "+getNombre());
        for (Reserva reserv : reservas){
            System.out.println(reserv);
        }
    }
    public void reservar(int id,int idPublicacion,double precio,int dias,int personas,int habitaciones){
        Reserva reserva = new Reserva(id,idPublicacion,precio,dias,personas,habitaciones);
        reservas.add(reserva);

    }
    public void cancelarReserva(){

    }
    public void pagar(){

    }
}
