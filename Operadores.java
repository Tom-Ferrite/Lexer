import java.util.List;
import java.util.ArrayList;
public class Operadores extends Token{
    private char[] operadores;

    public Operadores(){
        super(9);
        operadores=new char[8];
        //operadores[0]="->";
        //operadores[1]="++";
        //operadores[2]="--";
        operadores="&*+-~!,>".toCharArray();
    }
    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        char[] palavras=s.toCharArray();
        int i=0;
        while(i<palavras.length){
            if(palavras[i]==operadores[3] && palavras[i+1]==operadores[7]){
                retornar.add(i);
                i++;
            }
            else if(palavras[i]==operadores[2] && palavras[i+1]==operadores[2]){
                retornar.add(i);
                i++;
            }
            else if(palavras[i]==operadores[3] && palavras[i+1]==operadores[3]){
                retornar.add(i);
                i++;
            }
            else{
                for(int j=0;j<7;j++){
                    if(palavras[i]==operadores[j]){
                        retornar.add(i);
                    }
                }
            }
            i++;
        }
        int[] r=new int[retornar.size()];
        for(int j=0;j<retornar.size();j++){
            r[j]=retornar.get(j);
        }
        return r;
    }
    
}
