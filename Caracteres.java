import java.util.ArrayList;
import java.util.List;

public class Caracteres extends Token{

    private int linha;
    private int[] coluna;
    public Caracteres(int t,String s,int linha) {
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
            if(caracteres.length==3){
                if(caracteres[0]==101 && caracteres[caracteres.length-1]==101){
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

    public void imprimir(){
        System.out.print("Linha: "+ linha+"\nColunas:");
        for(int i=0;i<coluna.length;i++){
            System.out.print(coluna[i]+" ");
        }
        System.out.println("\n");
    }
    
}
