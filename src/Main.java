import java.net.SocketTimeoutException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

    }


}