public class Wallet {

    private Long idUsuario;
    private  double cantidadDeCriptos;
    private  double saldo;

    // Trabaja con

    private Usuario usuario;

    public Wallet(Long idUsuario, double cantidadDeCriptos) {
        this.idUsuario = idUsuario;
        this.cantidadDeCriptos = cantidadDeCriptos;
        this.saldo = 0.0;
    }

    public void agregarCriptos(double criptos){
        cantidadDeCriptos+=criptos;
    }
    public void pagar(double precio){
        saldo-=precio;
    }
    public void pagarConCripto(double cripto){
        cantidadDeCriptos-=cripto;
    }
}
