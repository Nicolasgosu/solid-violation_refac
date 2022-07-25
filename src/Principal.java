import java.time.*;

public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000, Duration.ofHours(12)),
        new Envio("Intermunicipal",15000, Duration.ofHours(36)),
        new Envio("Internacional",25000, Duration.ofHours(90) )
    };
    imprimirTiempoDeEnvio(envios);
    guardarEnvios(envios);
  }

  public static void guardarEnvios(Envio[] envios){
    for (Envio envio : envios) {
       //Save Envio DB
    }
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio envio : envios) {
      System.out.println("Tiempo envio "+ envio.getTiempoEntrega().toHours() + " horas");
    }
  }
}
