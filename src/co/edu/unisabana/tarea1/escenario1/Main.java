package co.edu.unisabana.tarea1.escenario1;

public class Main {

    public static void main(String[] args) {
        IEnsamblador ensamblador = new EnsambladorVehiculo();
        //Vehículo Cliente 1
        ensamblador.configurarColor("Rojo");
        ensamblador.configurarInteriores("Estándard");
        ensamblador.configurarMedidaLlantas("Rin 16");
        ensamblador.configurarNavegacionGPS(false);
        ensamblador.configurarSistemaSonido("Sony");
        ensamblador.configurarSunRoof(false);
        ensamblador.configurarTipoMotor("Gasolina");

        Vehiculo vehCliente1 = ensamblador.obtenerVehiculo();

        //Vehículo Cliente 2
        ensamblador.inicializar();
        ensamblador.configurarColor("Negro");
        ensamblador.configurarInteriores("Lujo");
        ensamblador.configurarMedidaLlantas("Rin 18");
        ensamblador.configurarNavegacionGPS(true);
        ensamblador.configurarSistemaSonido("BOSE");
        ensamblador.configurarSunRoof(true);
        ensamblador.configurarTipoMotor("Eléctrico");

        Vehiculo vehCliente2 = ensamblador.obtenerVehiculo();

        System.out.println("Vehículo del cliente 1: ");
        System.out.println(vehCliente1.describir());

        System.out.println("Vehículo del cliente 2: ");
        System.out.println(vehCliente2.describir());

    }

}
