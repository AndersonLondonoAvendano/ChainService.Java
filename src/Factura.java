public class Factura {

    private double monto;
    private String estado;

    // Trabaja con
    private Reserva reserva;

    public double calcularMontototal(double monto){
        double IVA = 0.19;
        double total = monto + (IVA*monto);
        return  total;

    }



    public void imprimirRecibo(){

    }
    public void registrarPago(){

    }
    public String consultarEstado(){

        return estado;
    }
}
