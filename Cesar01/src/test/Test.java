package test;

import alfabeto.Alfabeto;
import cifrado.Cifrado;


public class Test {
     public static void main(String []args){
         String americano="abcdefghijklmnopqrst";
     Alfabeto alfabetoAmericano=new Alfabeto(americano);
      Cifrado cifradoAmericano=new Cifrado(alfabetoAmericano,3);
   System.out.println("Americano: " + cifradoAmericano.cifrarTexto("cd"));
         
     /* String ruso="AБBГДEЁЖЗИЙКЛМHOПPCTУФXЦЧШЩЪЫЬЭЮЯ";
      Alfabeto alfabetoRuso=new Alfabeto(ruso);
      Cifrado cifradoRuso=new Cifrado(alfabetoRuso,3);
   System.out.println("Ruso: " + cifradoRuso.cifrarTexto("ЭЮЯ"));
 
    
    String frances="abcdefghijklmnopqrstuvwxyzàâæçéèêëîïôœùüÿ";
     Alfabeto alfabetoFrances=new Alfabeto(frances);
      Cifrado cifradoFrances=new Cifrado(alfabetoFrances,3);
   System.out.println("Frances: " + cifradoFrances.cifrarTexto("xyzàâæçéèê"));
   
     String numeros="123456789";
     Alfabeto alfabetoNumeros=new Alfabeto(numeros);
      Cifrado cifradoNumeros=new Cifrado(alfabetoNumeros,3);
   System.out.println("Frances: " + cifradoNumeros.cifrarTexto("567"));*/
   
   
   
   
   
    
    
    
    
    
    }
    
}
