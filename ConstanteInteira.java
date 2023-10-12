import java.util.ArrayList;
import java.util.List;

public class ConstanteInteira extends Token{
    public ConstanteInteira() {
        super(3);
    } 
    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        String[] palavras=s.split(" ");
        int i=0;
        int k=0;
        while(i<palavras.length){
            char[] caracteres=palavras[i].toCharArray();
            if(caracteres.length>1){
                if(caracteres[0]==43 || caracteres[0]==45){
                    char[]t=new char[(caracteres.length)-1];
                    for(int j=0;j<t.length;j++){
                        t[j]=caracteres[j+1];
                    }
                    if(teste(t)){
                        retornar.add(k);
                    }
                }
                if(teste(caracteres)){
                    retornar.add(k);
                }
            }
            k+=caracteres.length+1;
            i++;
        }
        int[] r=new int[retornar.size()];
        for(int j=0;j<retornar.size();j++){
            r[j]=retornar.get(j);
        }
        return r;
    }
    public boolean teste(char[] c){
        for(int i=0;i<c.length;i++){
            if(c[i]<47 || c[i]>58){
                return false;
            }
        }
        return true;
    }
}
