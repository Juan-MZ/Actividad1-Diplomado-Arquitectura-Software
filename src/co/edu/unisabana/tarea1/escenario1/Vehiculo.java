package co.edu.unisabana.tarea1.escenario1;

public class Vehiculo {

    private String tipoMotor;
    private String color;
    private String medidaLlantas;
    private String sistemaSonido;
    private String interiores;
    private boolean sunRoof;
    private boolean navegacionGPS;

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMedidaLlantas() {
        return medidaLlantas;
    }

    public void setMedidaLlantas(String medidaLlantas) {
        this.medidaLlantas = medidaLlantas;
    }

    public String getSistemaSonido() {
        return sistemaSonido;
    }

    public void setSistemaSonido(String sistemaSonido) {
        this.sistemaSonido = sistemaSonido;
    }

    public String getInteriores() {
        return interiores;
    }

    public void setInteriores(String interiores) {
        this.interiores = interiores;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public boolean isNavegacionGPS() {
        return navegacionGPS;
    }

    public void setNavegacionGPS(boolean navegacionGPS) {
        this.navegacionGPS = navegacionGPS;
    }

    public String describir(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vehículo con las siguientes características:");
        sb.append("\n");
        sb.append("Tipo de motor: " + (this.tipoMotor != null ? this.tipoMotor : "Sin definir"));
        sb.append("\n");
        sb.append("Color: " + (this.color != null ? this.color : "Sin definir"));
        sb.append("\n");
        sb.append("Medida de Llantas: " + (this.medidaLlantas != null ? this.medidaLlantas : "Sin definir"));
        sb.append("\n");
        sb.append("Sistema de Sonido: " + (this.sistemaSonido != null ? this.sistemaSonido : "Sin definir"));
        sb.append("\n");
        sb.append("Interiores: " + (this.interiores != null ? this.interiores : "Sin definir"));
        sb.append("\n");
        sb.append("Sun Roof: " + (this.sunRoof ? "Sí" : "No"));
        sb.append("\n");
        sb.append("Navegacion GPS: " + (this.navegacionGPS ? "Sí" : "No"));
        sb.append("\n");
        return sb.toString();
    }

}
