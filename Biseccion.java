package metodos_numericos;
public class Biseccion {
    public static void main(String[] args) {
        /**
         * aqui se parametriza la funcion de biseccion segun lo que se requira en el caso 
         */
        int iteracion = 0;
        double Xa = 0, Xb = 1, Fxa = 0, Fxb = 0, Xm = 0, Fxm = 0, Ear = 10;
        double XmAnterior = 0, condicion = 3;
        while(Ear*100 > condicion){
            
            XmAnterior = Xm;
            
            Fxa = f(Xa);
            Fxb = f(Xb);
            
            Xm = (Xa + Xb)/2;
            
            Fxm = f(Xm);
            
            Ear = Math.abs((Xm - XmAnterior)/Xm);
            //
            System.out.println("Iteracion: " + iteracion +
                    "\t\tXa: " + Xa + "\t\tXb: " + Xb + "\t\tFxa: " + 
                    Fxa + "\t\tFxb: " + Fxb + "\t\tXm: " + Xm + 
                    "\t\tFxm: " + Fxm + "\t\tEar: " + Ear);
            
            if(Fxm>= 0){
                Xb = Xm;
                Fxb = Fxm;
            }else if(Fxm < 0){
                Xa = Xm;
                Fxa = Fxm;
            }
            iteracion++;
        }
    }
    
    public static double f(double x){
        /**
         *Aqui se escribe la Funcion o la ecuacion a hacer biseccion
         **/
        x =Math.pow(x, 2)-6.8*Math.pow(x, 1.01)+9;
        return x;
    }
  
}
