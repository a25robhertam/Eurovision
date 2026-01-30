
/*====================================================================
LISTA DE PAISES QUE PARTICIPAN EN EUROVISION 
===========================================================

Suecia 
Ucrania
Alemania 
Luxemburgo 
Países Bajos 
Israel 
Lituania 
España 
Estonia 
Irlanda 
Letonia 
Grecia 
Reino Unido 
Noruega 
Italia 
Serbia 
Finlandia 
Portugal 
Armenia 
Chipre 
Suiza 
Eslovenia 
Croacia 
Georgia 
Francia 
Austria 

======================================================================
*/


import java.util.scanner;



//=============================================
/*creamos la clase paises */
public class Paises{
    String varNombrePais;
    int varPuntosObtenidos = 0 ;
}
/*fin de la creacion de paises */
//=============================================




public class App {


    /*==========================================================================================================
       FUNCION PUNTOS 
    
       asignamos 1,2,3,4,5,6,7,8,10,12 puntos rspectivamente
    
    */

    public static int asignacionPuntos(int varPuntuacion) {
        
        final int PUNTOS = 10 ; /*10 PUNTOS A ASIGNAR */
        
        /*QUE PUNTOS PUEDEN DARSE */

        int varPuntos [] = new int [PUNTOS]; 
        for (int i = 0; i < PUNTOS-2; i++) {/*determinlamos los puntos del 1 al 8 */
            varPuntos[i] = i + 1;
        }

        /*los puntos 9 y 10 tienen un puntaje difernte asi que lo determinaremos aparte */
        varPuntos[8] = 10;
        varPuntos[9] = 12;

        return varPuntos[varPuntuacion];
    }
    /*  FINAL FUNCION PUNTOS  
    ==========================================================================================================*/




    
    public static void main(String[] args) throws Exception {
     
        final int NUM_PAISES = 26;/*26 PAISES PARTICIPANTES */
        Paises[] paises = new Paises[NUM_PAISES];
        
        
        
       




    }
}
