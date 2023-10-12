
import java.util.ArrayList;
import java.util.List;

public class ConstanteReal extends Token{
    public ConstanteReal() {
        super(6);
    } 

    public int[] checar(String s){
        List <Integer> retornar=new ArrayList<Integer>();
        String[] palavras=s.split(" ");
        int i=0;
        int k=0;
        while(i<palavras.length){
            if(teste(palavras[i])){
                retornar.add(k);
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

    public boolean teste(String s){
        String[] a =s.split("\\.");
        int b =0;
        if(a.length!=2){
            return false;
        }

        char[] pri=a[0].toCharArray();
        if(!checar(pri)){
            return false;
        }
        char[] doise=a[1].toCharArray();
        int se=0;
        for(int i=0;i<doise.length;i++){
            if(doise[i]==101 && se==1){
                return false;
            }
            if(doise[i]==101){
                se=1;
            }
        }
        String[] depoisPonto=a[1].split("e");
        if(depoisPonto.length==1){
            char[] seg=a[1].toCharArray();
            if(seg[0]!=43 && seg[0]!=45){
                return checar(seg);
            }
            return false;
        }

        if(depoisPonto.length!=2){
            return false;
        }

        char[] seg=depoisPonto[0].toCharArray();
        if(!checar(seg)){
            return false;
        }
        if(seg[0]==43 || seg[0]==45){
            return false;
        }
        seg=depoisPonto[1].toCharArray();
        if(!checar(seg)){
            return false;
        }
        
        if(b==1){
            return false;
        }
        return true;
    }

    public boolean checar(char[] c){
        if(c[0]==43 ||c[0]==45 || (c[0]>46 && c[0]<59)){
            for(int i=1;i<c.length;i++){
                if(c[i]<47 || c[i]>58){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
}
