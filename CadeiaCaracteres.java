import java.util.ArrayList;
import java.util.List;

public class CadeiaCaracteres extends Token{

    private int linha;
    private int[] coluna;
    public CadeiaCaracteres(int t,String s,int linha) {
        super(t);
        this.linha=linha;
        coluna= checar(s);
        imprimir();
    }
    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        String[] palavras=s.split(" ");
        int k=0;
        for(int i=0;i<palavras.length;i++){
            char[] caracteres=palavras[i].toCharArray();
            if(caracteres.length>2){
                if(caracteres[0]==101 && caracteres[caracteres.length-1]==101){
                    retornar.add(k);
                }
            }
            k+=caracteres.length+1;
        }
        int[] r=new int[retornar.size()];
        for(int j=0;j<retornar.size();j++){
            r[j]=retornar.get(j);
        }
        return r;
    }

    public void imprimir(){
        System.out.print("Linha: "+ linha+"\nColunas:");
        for(int i=0;i<coluna.length;i++){
            System.out.print(coluna[i]+" ");
        }
        System.out.println("\n");
    }
    
}
