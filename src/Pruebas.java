public class Pruebas {

    public static void main(String[] args) {
        // Usuario Arrendatario

        Arrendatario ander = new Arrendatario(1,"ander",2007,0.0,"Soy un arrendatario","Soy un arrendatario","null",0.0);

        // Hacer publicacion como arrendatario

        ander.publicar(1,"publicacion","publicacion",99.9,"medellin",4,5,true);

        //ver historial de publicaciones del arrendatario
        ander.verPublicaciones();


        // Usuario Arrendador

        Arrendador juanes = new Arrendador(1,"juanes",1999,999.9,"null","soy un arrendador");

        // reservar
        juanes.reservar(1,1,99.9,4,2,6);

        // Ver historial de reservas del arrendador
        juanes.verReservas();


    }
}
