/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado2;

import alfabeto.Alfabeto;
import cifrado.InterfaceCifrado;
public class cifrado2 implements InterfaceCifrado {
private Alfabeto alfabetoMayuscula;
private Alfabeto alfabetoMinuscula;
private Alfabeto numerico;
private Integer desplazamiento=0;
private String textoCifrado="";
private Integer valorenAlfabeto=0;
 public cifrado2(Alfabeto alfabeto,Integer desplazamiento){
    this.alfabeto=alfabeto;
    this.desplazamiento=desplazamiento;
}
    @Override
    public String cifrarTexto(String texto) {
        for(Integer indice=0;indice<texto.length();indice++){
            textoCifrado+=alfabeto.devolverCaracter(ubicarenAlfabeto(alfabeto.devolverValorAsociado(texto.charAt(indice))+desplazamiento));        }
        return textoCifrado;
    }
   
    @Override
    public Integer ubicarenAlfabeto(Integer valor) {
       if(valor>=alfabeto.tamañoAlfabeto())
        return valor-alfabeto.tamañoAlfabeto();
       return valor;  
      }



}

