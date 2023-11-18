/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_andrehechenbichler;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author andre
 */
public class Lab6P1_AndreHechenbichler {
    /**
     * @param args the command line arguments
     */
    static Scanner leer=new Scanner(System.in);
    static Random rand=new Random();
    
    public static void Imprimir(int arreg[]){
        char disp;
        for (int i = 0; i < arreg.length ; i++) {
            disp=(char) arreg[i];
            System.out.print("[ "+disp+" ]");
        }
    }
    public static int[] SET1(int size){
        int temp[]=new int[size];
        for(int i=0;i<size;i++){
            temp[i]=rand.nextInt((73-65)+1)+65;
        }
        return temp;
    }
    public static int[] SET2(int size2){
        int temp[]=new int[size2];
        for(int i=0;i<size2;i++){
            temp[i]=rand.nextInt((73-65)+1)+65;
        }
        return temp;
    }
    public static char interseccion(int[]arreg, int[] arreg2) {
        char temp=' ';
        for(int i=0;i<arreg2.length;i++){
            for(int j=0;j<arreg.length;j++){
                if(arreg2[i]==arreg[j]){
                    temp=(char)arreg2[j];
                        System.out.print("["+temp+"]");
                }
            }
        }
        return temp;
    }
    public static char diferencia(int[] arreg,int[] arreg2){
        char temp=' ';
        for(int i=0;i<arreg2.length;i++){
            for(int j=0;j<arreg.length;j++){
                if(arreg2[i]!=arreg[j]){
                    temp=(char)arreg2[j];
                    System.out.print("["+temp+"]");
                }
            }
        }
        return temp;
    }
    public static int[]Primos(int tam, int inf, int sup){
        int temp[]=new int[tam];
        for(int i=0;i<tam;i++){
            temp[i]=rand.nextInt((sup-inf)+1)+inf;
        }
        return temp;
    }
    public static void Imprimir2(int arreg2[]){
        for (int i = 0; i < arreg2.length ; i++) {
            System.out.print("[ "+arreg2[i]+" ]");
        }
    }
    public static int[]isprime(int arreg[]){
        int[] temp=new int [arreg.length];
        int cont=0;
        int result;
        char pri=' ';
        for(int i=0;i<arreg.length;i++){
            result=temp[i]%i;
            if(result==0){
                cont=cont+1;
            }
            if(cont==2){
                pri='s';
            }else{
                pri='n';
            }
        }
        return temp;
    }
    public static boolean[] ispri(int[] arreg){
        int temp[]= new int[arreg.length];
        int cont=1;
        int prim = 0;
        int rest;
        for(int i=0;i<temp.length;i++){
            while(cont<temp[i]){
                rest=temp[i]%cont;
                cont++;
                if(rest==0){
                    prim= prim + 1;
                }
            }
            if(prim==2){
                temp[i]=1;
            }else if(prim>2||prim<2){
                temp[i]=2;
            }else{
                temp[i]=2-1;
            }
            return temp;
        }
    }
    public static void main(String[] args){
        // TODO code application logic here
        System.out.println("**********MENU**********");
        System.out.println("1. Conjuntos");
        System.out.println("2. ¿Cuántos primos tienes?");
        System.out.println("3. Para salir");
        System.out.print("Elija una opcion: ");
        int opcion=leer.nextInt();
        while(opcion>0&&opcion<3){
            switch(opcion){
                case 1:{
                    int num1[];
                    int num2[];
                    System.out.println("Tamaño 1");
                    int size=leer.nextInt();
                    System.out.println("Tamaño 2");
                    int size2=leer.nextInt();
                    num1=SET1(size);
                    num2=SET2(size2);
                    System.out.print("Set 1: ");
                    Imprimir(num1);
                    System.out.println("");
                    System.out.print("Set 2: ");
                    Imprimir(num2);
                    System.out.println("");
                    System.out.println("Operaciones:");
                    System.out.println("1. Interseccion");
                    System.out.println("2. Diferencia");
                    System.out.print("Ingresa una opcion: ");
                    int opcion2=leer.nextInt();
                    switch(opcion2){
                        case 1:{
                            System.out.println("Interseccion(SET1, SET2): ");
                             char inte;
                            inte=interseccion(num1,num2);
                        break;}
                        case 2:{
                            System.out.println("Diferencia(SET1, SET2): ");
                            char dif;
                            dif=diferencia(num1,num2);
                        break;}
                    }
                break;}
                case 2:{
                    int num1[];
                    int num;
                    int numbers;
                    System.out.println("Inserte un tamaño");
                    int tam=leer.nextInt();
                    System.out.println("Limite inferior");
                    int inf=leer.nextInt();
                    System.out.println("Limite superior");
                    int sup=leer.nextInt();
                    if(sup>inf){
                        num1=Primos(tam, inf, sup);
                        System.out.print("Su arreglo es: ");
                        Imprimir2(num1);
                        System.out.println("");
                        
                    }else{
                        System.out.println("El numero superior debe ser mayor al numero inferior");
                    }
                break;}
            }
            System.out.println("**********MENU**********");
            System.out.println("1. Conjuntos");
            System.out.println("2. ¿Cuántos primos tienes?");
            System.out.println("3. Para salir");
            opcion=leer.nextInt();
        }
    }
    
}
