public class Main{


    public static void main (String[]args){

    // Declaramos numero
    float number = 2.2f;
    // Sacamos la parte entera del numero, para ello tendremos que parsear el valor de number de float a int
    int numeroEntero = (int) number;
    // Para sacar la parte decimal declaramos una variable float y restamos el numero entero a el numero flotante.
    float parteDecimal = numeroEntero - number;

    // Visualizamos
    System.out.println(numeroEntero);
    System.out.println(parteDecimal);


    }

}