public class Auto extends Vehiculo implements VehiculoPrinter {
    public Auto(String patente, int año, int capacidadCargaKg, String marca) {
        super(patente, año, capacidadCargaKg, marca);
    }

    public Auto() {
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("---------------------Información del Vehículo:-----------------------");
        System.out.println("Patente: " + getPatente());
        System.out.println("Año: " + getAño());
        System.out.println("Capacidad de Carga: " + getCapacidadCargaKg() + " kg");
        System.out.println("Marca: " + getMarca());
    }
}
