public class Auto extends Vehiculo implements VehiculoPrinter {
    private int cantidadPasajeros;
    public Auto(String patente, int año, int capacidadCargaKg, String marca, int cantidadPasajeros) {
        super(patente, año, capacidadCargaKg, marca);
    }

    public Auto() {
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("---------------------Información del Vehículo:-----------------------");
        System.out.println("Patente: " + getPatente());
        System.out.println("Año: " + getAño());
        System.out.println("Capacidad de Carga: " + getCapacidadCargaKg() + " kg");
        System.out.println("Marca: " + getMarca());
        System.out.println("cantidadPasajeros: " + getCantidadPasajeros());
    }
}
