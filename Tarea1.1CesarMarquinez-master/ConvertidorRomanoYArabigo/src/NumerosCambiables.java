import java.util.Scanner;

public class NumerosCambiables {

    public static void main(String[] args) {
    	
    	
    	int numero;
        int valor[] = {0,1,5,10,50,100};//valores a las letras
        int ant = 0;
        int menu;
        int suma = 0;
        char letra = ' ';
        char Rom[]= {' ','I','V','X','L','C'}; //letras a comporar
        String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String Centena[]={"", "C"};
  

        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s%n","1. Convertir de Arabigos a Romanos");
        System.out.printf("%n");
        System.out.printf("%s%n","2. Convertir de Romanos a Arabigos");
        System.out.printf("%s%n","Ingresa Opcion:");
        System.out.printf("%n");
        menu = entrada.nextInt();
        
        switch(menu) {
        case 1:
        	 //arabigos a romanos
        	 Scanner sc=new Scanner(System.in);
             System.out.println("Ingresa numero entre 1 y 100");
             int N = sc.nextInt();
             int u=N%10;
             int d=(N/10)%10;
             int c=N/100;
             if(N>=100){         
                 System.out.println(Centena[c]);
             }else{
                 if(N>=10){
                     System.out.println(Decena[d]+Unidad[u]);          
                 }else{
                     System.out.println(Unidad[N]);          
                 }          
             }
        
        break;
       
        
        case 2:   
//romanos a arabigos

             System.out.printf("%s%n","Convertir numeros Romanos a Arabigos");
             System.out.printf("==========================================================%n");
             Scanner leer = new Scanner(System.in);
             System.out.printf("Ingrese el numero Romano a convertir: ");
             String romano = leer.nextLine();
             for(int i = 0; i < romano.length(); i++){

                 letra = romano.charAt(i);

                 for(int j = 0; j < Rom.length; j++){//arreglo ROM

                     if(letra == Rom[j]){//si letra recorrida = a letra contenida en rom

                                 suma = suma + valor [j]; //sumar el valor de la letra

                             if( ant < valor[j]){ //si el valor de letra anterior menor a valor letra   //actual

                                     suma = suma - ant*2 ; // restale el doble del menor de los dos

                                     ant = valor[j]; // valor anterior = valor letra actual

                             }else {//si no se cumple lo anterior

                         ant = valor[j];//el dato se guarda en anterior

                             	}

                     }

                 }

         }

         System.out.print(suma);
         break;
        }

}
}