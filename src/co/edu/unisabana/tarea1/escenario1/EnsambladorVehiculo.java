package co.edu.unisabana.tarea1.escenario1;

public class EnsambladorVehiculo implements IEnsamblador{

    private Vehiculo vehiculo;

    public EnsambladorVehiculo() {
        this.inicializar();
    }

    @Override
    public void inicializar() {
        this.vehiculo = new Vehiculo();
    }

    @Override
    public void configurarTipoMotor(String tipoMotor) {
        this.vehiculo.setTipoMotor(tipoMotor);
    }

    @Override
    public void configurarColor(String color) {
        this.vehiculo.setColor(color);
    }

    @Override
    public void configurarMedidaLlantas(String medidaLlantas) {
        this.vehiculo.setMedidaLlantas(medidaLlantas);
    }

    @Override
    public void configurarSistemaSonido(String sistemaSonido) {
        this.vehiculo.setSistemaSonido(sistemaSonido);
    }

    @Override
    public void configurarInteriores(String interiores) {
        this.vehiculo.setInteriores(interiores);
    }

    @Override
    public void configurarSunRoof(boolean sunRoof) {
        this.vehiculo.setSunRoof(sunRoof);
    }

    @Override
    public void configurarNavegacionGPS(boolean navegacionGPS) {
        this.vehiculo.setNavegacionGPS(navegacionGPS);
    }

    @Override
    public Vehiculo obtenerVehiculo() {
        return this.vehiculo;
    }
}
