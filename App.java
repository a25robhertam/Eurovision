
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


import java.io.StringReader;
import java.util.Scanner;



//=============================================
/*creamos la clase paises */
class Paises{
    String varNombrePais;
    int varPuntosObtenidos = 0 ;
    int varNumIdentificador = 0;
}
/*fin de la creacion de paises */
//=============================================




public class App {


        static final int NUM_PAISES = 26;/*26 PAISES PARTICIPANTES */
        static Paises[] pais = new Paises[NUM_PAISES];







        /*==========================================================================================================
       FUNCION ASIGNACION PAISES NUMEROS
    
       le asignammos a cada pais un numero identificador a cada cual se le asigna un nombre y con el que podremso identificaro
    
    */

    public static String asignacionPaisesNumeros(Integer varPosicionRandom ) {

        String varNombre;

        switch (varPosicionRandom) {
            case 0:  varNombre = "Suecia"; break;
            case 1:  varNombre = "Ucrania"; break;
            case 2:  varNombre = "Alemania"; break;
            case 3:  varNombre = "Luxemburgo"; break;
            case 4:  varNombre = "Países Bajos"; break;
            case 5:  varNombre = "Israel"; break;
            case 6:  varNombre = "Lituania"; break;
            case 7:  varNombre = "España"; break;
            case 8:  varNombre = "Estonia"; break;
            case 9:  varNombre = "Irlanda"; break;
            case 10: varNombre = "Letonia"; break;
            case 11: varNombre = "Grecia"; break;
            case 12: varNombre = "Reino Unido"; break;
            case 13: varNombre = "Noruega"; break;
            case 14: varNombre = "Italia"; break;
            case 15: varNombre = "Serbia"; break;
            case 16: varNombre = "Finlandia"; break;
            case 17: varNombre = "Portugal"; break;
            case 18: varNombre = "Armenia"; break;
            case 19: varNombre = "Chipre"; break;
            case 20: varNombre = "Suiza"; break;
            case 21: varNombre = "Eslovenia"; break;
            case 22: varNombre = "Croacia"; break;
            case 23: varNombre = "Georgia"; break;
            case 24: varNombre = "Francia"; break;
            case 25: varNombre = "Austria"; break;
        }

        return varNombre;
    }


 
 /*  FINAL FUNCION ASIGNACION PAISES NUMEROS 
    ==========================================================================================================*/



    /*==========================================================================================================
       FUNCION RELLENAR NOMBTE DE PAISES    */

    public static String posicionesNombresAutomaticas( ){

        boolean varAux = false;
        String varNombre ;
        Integer varPosicionRandom = null ;

        while (varAux == false){
            varPosicionRandom = (int) (Math.random()*   NUM_PAISES);
             if ( pais[varPosicionRandom].varNombrePais == null){
                varAux = true;
             }
             varNombre = asignacionPaisesNumeros(varPosicionRandom);



        }



        return varNombre;
    }

    /*  FINAL FUNCION PUNTOS  
    ==========================================================================================================*/




    
    public static void main(String[] args) throws Exception {

        
     
        for (int i = 0; i < NUM_PAISES; i ++ ){
            pais[i].varNombrePais = posicionesNombresAutomaticas();

        }

       for (int i = 0; i < NUM_PAISES; i ++ ){
            System.out.printf("%s \n", pais[i].varNombrePais);
               }


    }
}

