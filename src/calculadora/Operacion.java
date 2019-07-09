package calculadora;
/**
 *
 * @author ivi
 */
public class Operacion {
    
    private String cadena;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private double resultado;

    public Operacion() {
        this.cadena="";
        this.suma=false;
        this.resta=false;
        this.multiplicacion=false;
        this.division=false;
    }
    
    public String concatenar(String cadena){
        this.cadena=this.cadena+cadena;
        return this.cadena;
    }
    
    public String borrar(String cadena){
        this.cadena="";
        return cadena;
    }
    
    public String borrarUltima(String cadena){
        String cadena2=cadena.substring(0, cadena.length()-1);
        this.cadena=cadena2;
        return cadena2;
    }
    
    public void suma(String cadena){
        if(resta==true || multiplicacion==true || division==true){
            resta=false;
            multiplicacion=false;
            division=false;
        }
        this.resultado=Double.parseDouble(cadena);
        this.cadena="";
        suma=true;
        
    }
    
    public void resta(String cadena){
        if(suma==true || multiplicacion==true || division==true){
            suma=false;
            multiplicacion=false;
            division=false;
        }
        this.resultado=Double.parseDouble(cadena);
        resta=true;
        this.cadena="";
        
    }
    
    public void multiplicacion(String cadena){
        if(resta==true || suma==true || division==true){
            resta=false;
            suma=false;
            division=false;
        }
        this.resultado=Double.parseDouble(cadena);
        multiplicacion=true;
        this.cadena="";
    }
    
    public void division(String cadena){
        if(resta==true || multiplicacion==true || suma==true){
            resta=false;
            suma=false;
            division=false;
        }
        this.resultado=Double.parseDouble(cadena);
        division=true;
        this.cadena="";
    }
    
    public double raizCuadrada(String cadena){
        double raiz=Double.parseDouble(cadena);
        this.resultado=Math.sqrt(raiz);
        return resultado;
    }
    
    public double resultado(String numero){

        if(suma==true){
            resultado=resultado+Double.parseDouble(numero);
        }
        if(resta==true){
            resultado=resultado-Double.parseDouble(numero);
        }
        if(multiplicacion==true){
            resultado=resultado*Double.parseDouble(numero);
        }
        if(division==true){
            resultado=resultado/Double.parseDouble(numero);
        }
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        
        return resultado;
    }
}
