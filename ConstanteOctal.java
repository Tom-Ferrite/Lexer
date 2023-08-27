import java.util.ArrayList;
import java.util.List;

public class ConstanteOctal extends Token{

    private int linha;
    private int[] coluna;
    public ConstanteOctal(int t,String s,int linha) {
        super(t);
        this.linha=linha;
        coluna= checar(s);
        imprimir();
    }
    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        String[] palavras=s.split(" ");
        int i=0;
        int k=0;
        while(i<palavras.length){
            char[] caracteres=palavras[i].toCharArray();
            if(caracteres.length>1){
                if(caracteres[0]==48){
                    if(teste(caracteres)){
                        retornar.add(k);
                    }
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
        for(int i=1;i<c.length;i++){
            if( ((c[i]<48 || c[i]>55))){
                return false;
            }
        }
        return true;
    }
    public void imprimir(){
        System.out.print("Linha: "+ linha+"\nColunas:");
        for(int i=0;i<coluna.length;i++){
            System.out.print(coluna[i]+" ");
        }
        System.out.println("\n");
    }
}