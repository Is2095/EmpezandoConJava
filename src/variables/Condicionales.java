package variables;

public class Condicionales {

    boolean condicion1 = true;
    boolean condicion2 = false;
    String resultado;

    private void condicionales () {
        if(condicion1 && condicion2) {
            resultado = "es true";
        }

        if(condicion2) {
            resultado = "condicional2 es true";
        } else if(condicion1) {
            resultado = "condicional1 es true";
        } else {
            resultado = "ni uno ni otro es true";
        }
    }


}
