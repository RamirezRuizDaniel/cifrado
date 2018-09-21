package cifrado;

import alfabeto.Alfabeto;
public class Cifrado implements InterfaceCifrado {
private Alfabeto alfabeto;
private Integer desplazamiento=0;
private String textoCifrado="";
private Integer valorenAlfabeto=0;
 public Cifrado(Alfabeto alfabeto,Integer desplazamiento){
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
