package variables;

public class Bubles {

    public int numero1 = 3;
    public String resultado;

    private void Bucles() {

        // switch
        switch (numero1) {
            case 1: {
                resultado = "numero1 es igual a 1";
                break;
            }
            case 2: {
                resultado = "numero1 es igual a 2";
                break;
            }
            case 3: {
                resultado = "numero1 es igual a 3";
                break;
            }
            default:
                break;
        }

        // BUCLE WHILE -> mientras se cumpla la condición ejecutar el código
        int contador = 0;
        while (contador < 5) { // mientras se compla que contador sea menor que 5 imprimirá por consola el valor de contador
            System.out.println(contador);
            contador++;
        }

        // DO WHILE -> se ejecuta el código y luego hace la condición, igual que el while pero al menos una vez se ejecutará el código
        do{
            System.out.println(contador);
            contador++;
        } while (contador < 5);

        // BUCLE FOR
        for(int x=0; x<10; x++) { // imprimirá por consola del 0 al 9
            System.out.println(x);
        }

        // BUCLE FOR EACH --> para recorrer Array
        String[] frutas = {"manzana", "pera", "ananá"};
        for(String fruta: frutas) { // iterará el Array y cada elemento del Array frutas y será en fruta
            System.out.println(fruta);
        }
    }
}
