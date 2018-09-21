package alfabeto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Alfabeto implements InterfaceAlfabeto{
    private Map<Integer,Character> alfabeto;
    private String alfabetoOriginal="abcdefghijklmnopqrstuvwxyz";
    private Integer buscado=0;
    
    public Alfabeto(String alfabetoOriginal){
    this.alfabetoOriginal=alfabetoOriginal;
    this.crearAlfabeto();
    }
    public Alfabeto(){
    this.crearAlfabeto();
    }
    public  void crearAlfabeto(){
    alfabeto=new HashMap<Integer,Character>();
      for(Integer indice=0;indice<alfabetoOriginal.length();indice++){
        alfabeto.put(indice,alfabetoOriginal.charAt(indice));
      }
    }
    @Override
    public Integer tamañoAlfabeto(){
    return alfabeto.size();
    }
    @Override
    public void agregarCaracter(Character nuevo) {
        alfabeto.put(Integer.SIZE, nuevo);
    }

    @Override
    public Character devolverCaracter(Integer posicion) {
    return alfabeto.get(posicion);
    }

    @Override
    public Integer devolverValorAsociado(Character caracter) {
        for (Integer key : alfabeto.keySet()) {
            if(alfabeto.get(key).charValue()==caracter.charValue())
                buscado=key;
        }         
        return buscado;
    }

    @Override
    public void imprime() {
    Iterator it = alfabeto.keySet().iterator();
      while(it.hasNext()){
        Integer key = (Integer) it.next();
          System.out.println("Clave: " + key + " -> Valor: " + alfabeto.get(key));
      }
    }
}
