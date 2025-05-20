package co.edu.unisabana.tarea1.escenario1;

public interface IBuilder {

    void inicializar();
    void configurarTipoMotor(String tipoMotor);
    void configurarColor(String color);
    void configurarMedidaLlantas(String medidaLlantas);
    void configurarSistemaSonido(String sistemaSonido);
    void configurarInteriores(String interiores);
    void configurarSunRoof(boolean sunRoof);
    void configurarNavegacionGPS(boolean navegacionGPS);
    Vehiculo obtenerVehiculo();
}
