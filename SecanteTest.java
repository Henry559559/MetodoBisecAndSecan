package metodos_numericos;

public class SecanteTest {

    public static void main(String[] args) {
        /**
         * aqui Se ejecuta el programa se pone la funcion o el metodo
         * Que se va a secante Recordatoria antes de ejecutar priemro se debe escribir mano la funcion a secante
         * y se debe bajar los jars ext-1.1.1
         * y  jep-2.4.1 o la libreria Jep  de hai desconmprirmir el archivo ir se a la carpeta darle doble clip y buscar
         * la carpeta que diga dist y ahi estan los jars a agregar a la libreria del programa
         * */
        Funcion f = new Funcion("x^2-6.8*x^1.01+9");
        Secante s = new Secante();
        System.out.println(s.raiz(f, 0, 1000, 1000, 1e-8));
    }
}
