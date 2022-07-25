import java.time.*;
public class Envio {

  String tipo;
  Integer precio;
  Duration tiempoEntrega;

  Envio(String tipo, Integer precio, Duration tiempoEntrega) {
    this.tipo = tipo;
    this.precio = precio;
    this.tiempoEntrega = tiempoEntrega;
  }

  String getTipoEnvio() {
    return this.tipo;
  }

  Integer getPrecio() {
    return this.precio;
  }

  Duration getTiempoEntrega() {
    return this.tiempoEntrega;
  }

  
}