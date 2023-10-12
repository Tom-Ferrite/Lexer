import java.util.ArrayList;
import java.util.List;

public class EspacosBranco extends Token{
    private char[] tabulacao;

    public EspacosBranco(){
        super(11);
        tabulacao="/*".toCharArray();
        
    }

    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        char[] caracteres=s.toCharArray();
        int i=0;
        int tab=0,indicetab=-1;
        while(i<caracteres.length){
            if(caracteres[i]==32){
                retornar.add(i);
            }
            if(caracteres[i]==tabulacao[0] && i+1<caracteres.length){
                if(caracteres[i+1]==tabulacao[1]){
                    tab=1;
                    indicetab=i;
                }
            }  
            if(caracteres[i]==tabulacao[1] && i+1<caracteres.length){
                if(caracteres[i+1]==tabulacao[0] && tab==1){
                    retornar.add(indicetab);
                    tab=0;
                    indicetab=-1;
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
