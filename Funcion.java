package metodos_numericos;

import org.nfunk.jep.JEP;

public class Funcion {

    JEP j = new JEP();

    public Funcion(String def) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());
        }

    }

    public double eval(double x) {
        double e;
        j.addVariable("x", x);
        e = j.getValue();
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());
        }
        return e;
    }
}
