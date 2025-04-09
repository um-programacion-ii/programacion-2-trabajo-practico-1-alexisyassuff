import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void tester(VehiculoPrinter t) {
        t.mostrarInformacion();
    }
    public static void main(String[] args) {
        Vehiculo Chevrolet = new Vehiculo();
        Chevrolet.setPatente("AF2320");
        Chevrolet.setMarca("Chevrolet");
        Chevrolet.setAño(2022);
        Chevrolet.setCapacidadCargaKg(270);

        Vehiculo Ford = new Vehiculo();
        Ford.setPatente("LK2720");
        Ford.setMarca("Ford");
        Ford.setAño(2024);
        Ford.setCapacidadCargaKg(370);

        Vehiculo Fiat = new Vehiculo();
        Fiat.setPatente("LA2129");
        Fiat.setMarca("Fiat");
        Fiat.setAño(2015);
        Fiat.setCapacidadCargaKg(246);

        //Ford.mostrarInformacion();
        //Fiat.mostrarInformacion();
        //Chevrolet.mostrarInformacion();

        Camion Scania = new Camion();
        Scania.setAño(2020);
        Scania.setMarca("Scania");
        Scania.setPatente("KD2342");
        Scania.setCapacidadCargaKg(100000);
        Scania.setTieneAcoplado(true);

        VehiculoPrinter Impresora = Scania;
        Impresora.mostrarInformacion();

        Auto Ferrari = new Auto();
        Ferrari.setAño(2025);
        Ferrari.setMarca("Ferrari");
        Ferrari.setPatente("KL0956");
        Ferrari.setCapacidadCargaKg(700);
        Ferrari.setCantidadPasajeros(3);
        Impresora = Ferrari;
        Impresora.mostrarInformacion();

        System.out.println("-----------------------------------------Testeo LISKOV-----------------------------------------");
        Auto Ford1 = new Auto();
        Ford1.setPatente("LK2720");
        Ford1.setMarca("Ford");
        Ford1.setAño(2024);
        Ford1.setCapacidadCargaKg(370);
        Ford1.setCantidadPasajeros(5);
        tester(Scania);
        tester(Ferrari);
        tester(Ford1);

        List<VehiculoPrinter> vehiculos =new ArrayList<>();
        System.out.println("<<<<<<< Los autos de la lista son >>>>>>>>>");
        vehiculos.add(Ford1);
        vehiculos.add(Ferrari);
        for (VehiculoPrinter v : vehiculos) {
            v.mostrarInformacion();
        }


    }


}