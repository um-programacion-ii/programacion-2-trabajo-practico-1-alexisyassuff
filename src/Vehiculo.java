public class Vehiculo {
    private String patente;
    private int año;
    private int capacidadCargaKg;
    private String marca;

    public Vehiculo(String patente, int año, int capacidadCargaKg, String marca) {
        this.patente = patente;
        this.año = año;
        this.capacidadCargaKg = capacidadCargaKg;
        this.marca = marca;
    }

    public Vehiculo() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(int capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
