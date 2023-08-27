import java.util.List;
import java.util.ArrayList;
public class Operadores extends Token{
    private char[] operadores;
    private int linha;
    private int[] coluna;

    public Operadores(int t,String s,int linha){
        super(t);
        operadores=new char[8];
        //operadores[0]="->";
        //operadores[1]="++";
        //operadores[2]="--";
        operadores="&*+-~!,>".toCharArray();

        this.linha=linha;
        coluna=checar(s);
        imprimir();
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
    public void imprimir(){
        System.out.print("Linha: "+ linha+"\nColunas:");
        for(int i=0;i<coluna.length;i++){
            System.out.print(coluna[i]+" ");
        }
        System.out.println("\n");
    }
    
}
