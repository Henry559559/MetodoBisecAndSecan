package metodos_numericos;

public class SecanteTest {

    public static void main(String[] args) {
        /**
         *aquí Se ejecuta el programa se pone la función o el método 
         * que se va a secante Recordatoria antes de ejecutar, 
         * 1) primero se debe escribir mano la función a secante, 
         * se debe bajar los jars (ext-1.1.1 y jep-2.4.1) o la 
         * librería Jep  de ahí descomprimir el archivo ir se a la 
         * carpeta darle doble clip y buscar la carpeta que diga dist y 
         * ahí están los jars a agregar a la librería del programa.
         * */
        Funcion f = new Funcion("x^2-6.8*x^1.01+9");
        Secante s = new Secante();
        System.out.println(s.raiz(f, 5, 6, 10, 1e-6));
    }
}
