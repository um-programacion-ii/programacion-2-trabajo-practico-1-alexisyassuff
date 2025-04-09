public class Camion extends Vehiculo implements VehiculoPrinter {
    private Boolean tieneAcoplado;

    public Boolean getTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(Boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public void mostrarInformacion() {
            System.out.println("---------------------Información del Vehículo:-----------------------");
            System.out.println("Patente: " + getPatente());
            System.out.println("Año: " + getAño());
            System.out.println("Capacidad de Carga: " + getCapacidadCargaKg() + " kg");
            System.out.println("Marca: " + getMarca());
            System.out.println("Tiene Acoplado?: " + getTieneAcoplado());
        }
    }
