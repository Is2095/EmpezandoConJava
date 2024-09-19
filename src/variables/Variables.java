package variables;

public class Variables {

    // variables -> es un espacio en memoria que espera un dato (el tipo de dato que acompaña al nombre de la variable)

    // modificador tipoDeVariable nombreVariable = valor;

    // VARIABLES NUMÉRICAS

    // números enteros
    byte miVariableByte = 1; // números muy chicos entre -128 a 127
    short miVariableShort = 9; // para númerp chicos entre -32768 a 32767
    int miVariableNumerica = 5; // números enteros entre -2,147,483,648 a 2,147,483,647
    long miVariableNumericaLong = 4; // para números (grandes) entre -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

    // número con decimal (float)
    float miVariableFloat = 5.9f; // alcance de 7 dígitos - debe llevar la f final para indicar que es float (Aproximadamente ±3.4028235E+38f)
    double miVariableDouble = 7.12; // alcance de 15 dígitos (Aproximadamente ±1.7976931348623157E+308)

    // VARIABLES CARACTER

    // variable primitiva:
    char variableChar = 'a'; // puede tener el valor de un caracter y caracter especial
    char caracterEspecial = '\u00A9'; // imprime el símbolo de Copyright

    // objeto String
    String variableString = "hola mundo"; // puede tener cualquier texto, caracteres especiales, números
    // el carácter \ sirve para escape de secuencia ej: \n->salto de línea, \"->comillas doble, etc

    //VARIABLE BOOLEANA
    boolean variableBoolean = false; // puede recibir el valor de true o false

    //CONVERSIÓN DE TIPOS
    // byte -> short -> char -> int -> long -> float -> double
    // double -> float -> long -> int -> char -> short -> byte

    int miInt = 9;
    double miIntDouble = miInt;

    double miD = 9.78;
    int miInt2 = (int)miD; // -> resultado: 9
}
