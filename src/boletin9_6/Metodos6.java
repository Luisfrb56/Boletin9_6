

package boletin9_6;

import java.util.Scanner;


public class Metodos6 {
    public void calcularPorcent(){
        int cant;
        int cont;
        int sueldo;
        int mas1000=0;
        int menos1000=0;
        int error=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero de trabajadores: ");
        cant=sc.nextInt();
        for(cont=1;cont<=cant;cont++){
            System.out.println("Sueldos: ");
        sueldo=sc.nextInt();
            if(sueldo>0){
                if(1000<=sueldo && sueldo<=1750){
                    mas1000++;
                }else{
                    menos1000++;
                }
            }else{
                error++;
            }
        }
        double cantmas=(mas1000*100)/cant;
        System.out.println("Porcentaje de mayor de 1000 menor que 1750: "+cantmas+"%");
        double cantmenos=(menos1000*100)/cant;
        System.out.println("Porcentaje de menor de 1000: "+cantmenos+"%");
        double canterrores=(error*100)/cant;
        System.out.println("Porcentaje de personas con error en su sueldo=0: "+canterrores+"%");
    }
}
