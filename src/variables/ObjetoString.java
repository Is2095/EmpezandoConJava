package variables;

public class ObjetoString {

    String variableString = "Hola Mundo";
    String variableConcat = "string concatenado";
    char varibaleChar = 'a';

    int resultado = variableString.length(); // propociona longitud de la variable variableString
    String resultado1 = variableString.toUpperCase(); // convierte todo a mayúsculas
    String resultado2 = variableString.toLowerCase(); // convierte todo a minúsculas
    int resultado3 = variableString.indexOf("Mundo"); // proporciona el índice donde se encuentra "Mundo"
    String resultado4 = variableString.concat(variableConcat); // a la variable variableString se le concatena el valor de la variable variableConcat
    String resultado5 = Character.toString(varibaleChar);
    boolean resultado6 = variableString.equals(variableConcat); // equals compara dos objetos
    String resultado7 = variableString.substring(7); // proporciona una subcadena a partir del índice 7
    boolean resultado8 = variableString.contains("mundo"); // da true si se encuentra "mundo" false caso contrario no observa mayús o minús
    String resultado9 = variableString.replace("Hola", "hola"); // reemplaza la palabra "Hola" por "hola"
    char resultado10 = variableString.charAt(5); // extrae el caracter que se encuentra en el índice 5


}
