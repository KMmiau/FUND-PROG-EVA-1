package eva1_11_inicializacion;

public class EVA1_11_INICIALIZACION {

    public static void main(String[] args) {
        // Los paréntesis denotan una funcion
        // println() <<--- funcion
        // main() <<--- funcion
        System.out.println("Hola mundo");
        int valor = 0; //inicializar la variable para usarla
        System.out.println(valor);
        
        // declaramos e inicializamos variables del tipo double
        double salario = 0, iva = 0.16, subtotal = 10000;
        
        final int CALIFA_PASAR = 70;
        final String ESCUELA = "instituo tecnologico de chihuahua II";
        
        System.out.println(ESCUELA);
        System.out.println("La califa minima para pasar es:");
        System.out.println(CALIFA_PASAR);
        
        //error: solo se puede asignar una vez final
        //CALIFA_PASAR = 100;
        //CALIFA_PASAR = 20;
        
        /*
        IGNORA
        VARIAS LINEAS DE TEXTO
        SI VAN A TIRAR MUCHO
        
        ROLLO
        */
        int x;//esto ya es ignorado
        
        byte valores = 120;
        //valores = 128;
        int mivalor = Integer.MAX_VALUE;
        System.out.println(mivalor + 1);
    
    }
    
}
