import java.util.List;
import java.util.ArrayList;
public class Pontuadores extends Token{
    private char[] pontuadores;
    private int linha;
    private int[] coluna;

    public Pontuadores(int t,String s,int linha){
        super(t);
        pontuadores="[](),".toCharArray();
        this.linha=linha;
        coluna=checar(s);
        imprimir();
    }
    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        char[] palavras=s.toCharArray();
        int i=0;
        while(i<palavras.length){
            for(int j=0;j<5;j++){
                if(palavras[i]==pontuadores[j]){
                    retornar.add(i);
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
    public void imprimir(){
        System.out.print("Linha: "+ linha+"\nColunas:");
        for(int i=0;i<coluna.length;i++){
            System.out.print(coluna[i]+" ");
        }
        System.out.println("\n");
    }
    
}
