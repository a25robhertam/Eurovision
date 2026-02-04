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


import java.lang.Math;


//=============================================
/*creamos la clase paises */
class Paises{
    String varNombrePais = "";
    int varPuntosPaises = 0 ;
    int varAux = 0;
    int varPosiciones = 0;
}
/*fin de la creacion de paises */
//=============================================



/* -------------------------------------------------------------------------------*/
public class App {

    static final int NUM_BOTACIONES = 10 ;
    static final int NUM_PAISES = 26;/*26 PAISES PARTICIPANTES */
    static Paises[] pais = new Paises[NUM_PAISES];
/* -------------------------------------------------------------------------------*/





 /*==========================================================================================================
       FUNCION ASIGNACION NUMEROS
    
       le asignammos a cada pais un numero identificador a cada cual se le asigna un nombre y con el que podremso identificaro
    
    */


    public static int distincionDePuntuacion (int varPosicionRandom, int j) {

        int varPuntos[] = new int [NUM_BOTACIONES] ;
        for (int i = j ;i < NUM_BOTACIONES - 2 ; i ++){
            varPuntos[i] = i + 1 ;

        }
        varPuntos [8] = 10;
        varPuntos [9] = 12;


        return varPuntos [varPosicionRandom];
    }






/*======================================================================================================== */





 /*==========================================================================================================
       FUNCION ASIGNACION PUNTOS A PAIESES ALAZAR
    
    
       le asignammos a cada pais un numero identificador a cada cual se le asigna un nombre y con el que podremso identificaro
    
    */


    public static void agregarPuntuacion () {



        boolean varAux = false;
        int varPosicionRandom = 0 ;



     



            for (int j = 0 ; j < NUM_BOTACIONES ; j++){
                
                while (varAux == false){
                    varPosicionRandom = (int) (Math.random()*   NUM_BOTACIONES);
                    if ( pais[varPosicionRandom].varAux == 0) {
                        varAux = true;
                    }
          
                }
                    pais[varPosicionRandom].varPuntosPaises =  distincionDePuntuacion(varPosicionRandom,j) + pais[varPosicionRandom].varPuntosPaises;
                    pais[varPosicionRandom].varAux = 1;
            }


            
            for (int j = 0 ; j < NUM_BOTACIONES; j++){
                pais[j].varAux = 0 ;
            }



    }






/*======================================================================================================== */





        /*==========================================================================================================
       FUNCION ASIGNACION PAISES NUMEROS
    
       le asignammos a cada pais un numero identificador a cada cual se le asigna un nombre y con el que podremso identificaro
    
    */

    public static String asignacionPaisesNumeros(int varPosicionRandom ) {

        String varNombre = "" ;

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
        String varNombre = "" ;
        int varPosicionRandom = 0 ;

        while (varAux == false){
            varPosicionRandom = (int) (Math.random()*   NUM_PAISES);
             if ( pais[varPosicionRandom].varNombrePais == "") {
                varAux = true;
             }
             varNombre = asignacionPaisesNumeros(varPosicionRandom);



        }



        return varNombre;/*DEVUELVE EL NOMBRE DE 1 DE LOS PAISES PARTICIPANTES */
    }

    /*  FINAL FUNCION PUNTOS  
    ==========================================================================================================*/



























    
    public static void main (String[] args) {
        

    for (int i = 0; i < NUM_PAISES; i++) {
       pais[i] = new Paises();/*CREA LOS DIFERENTES VECTORES PARA UQE EL BALOR NO SEA NULO  */
}



        for (int i = 0; i < NUM_PAISES; i ++ ){
            pais[i].varNombrePais = posicionesNombresAutomaticas();
            pais[i].varPosiciones = i ;
        }







        /*IMPRIME LOS PAISES PAR ACOMPROBAR SI FUNCIONA O NO 
       for (int i = 0; i < NUM_PAISES; i ++ ){
            System.out.printf("%s \n", pais[i].varNombrePais);
               }
        */


               for (int i = 0 ; i < NUM_PAISES; i++){

                agregarPuntuacion();

               }


       
       for (int i = 0; i < NUM_PAISES; i ++ ){
            System.out.printf("%s %s \n", pais[i].varNombrePais, pais[i].varPuntosPaises);
               }
        



    }
}

