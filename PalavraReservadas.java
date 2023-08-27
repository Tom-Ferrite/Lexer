import java.util.List;
import java.util.ArrayList;
public class PalavraReservadas extends Token{
    private String[] palavrasReservadas;
    private int linha;
    private int[] coluna;

    public PalavraReservadas(int t,String s,int linha){
        super(t);
        palavrasReservadas=new String[7];
        palavrasReservadas[0]="if";
        palavrasReservadas[1]="else";
        palavrasReservadas[2]="while";
        palavrasReservadas[3]="do";
        palavrasReservadas[4]="int";
        palavrasReservadas[5]="char";
        palavrasReservadas[6]="void";
        this.linha=linha;
        coluna=checar(s);
        imprimir();
    }
    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        String[] palavras=s.split(" ");
        int i=0;
        int k=0;
        while(i<palavras.length){
            for(int j=0;j<7;j++){
                if( palavras[i].equals(palavrasReservadas[j])){
                    retornar.add(k);
                }
            }
            k+=palavras[i].toCharArray().length+1;
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
