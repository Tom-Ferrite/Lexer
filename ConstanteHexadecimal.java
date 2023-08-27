import java.util.ArrayList;
import java.util.List;

public class ConstanteHexadecimal extends Token{

    private int linha;
    private int[] coluna;
    public ConstanteHexadecimal(int t,String s,int linha) {
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
            if(caracteres.length==2 && caracteres[0]==48 && caracteres[1]==120){
                retornar.add(k);
            }
            if(caracteres.length>2){
                if(caracteres[0]==48 && caracteres[1]==120){
                    if(teste(caracteres)){
                        retornar.add(k);
                    }
                }
            }
            i++;
            k+=caracteres.length+1;
        }   
        int[] r=new int[retornar.size()];
        for(int j=0;j<retornar.size();j++){
            r[j]=retornar.get(j);
        }
        return r;
    }
    public boolean teste(char[] c){
        for(int i=2;i<c.length;i++){
            if( ((c[i]<48 || c[i]>57)) && (c[i]<97 || c[i]>102)){
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
