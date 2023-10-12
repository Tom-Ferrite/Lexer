public class Token{
    public final int tag;
    private int[][]aonde;
    public Token(int t){
        tag=t;
        aonde=new int[1][1];
    }
    public void imprimir(){
        switch(tag){
            case 1: System.out.println("Palavras Reservadas");break;
            case 2: System.out.println("Indentificador");break;
            case 3: System.out.println("Constante Inteira");break;
            case 4: System.out.println("Constante Hexadecimal");break;
            case 5: System.out.println("Constante Octal");break;
            case 6: System.out.println("Constante Real");break;
            case 7: System.out.println("Cadeia de Caracteres");break;
            case 8: System.out.println("Caracteres");break;
            case 9: System.out.println("Operadores");break;
            case 10: System.out.println("Pontuadores");break;
            case 11: System.out.println("Espaços em Brancos");break;
            case 12: System.out.println("Apontar Erro");break;
            default: System.out.println("");break;
        }
        for(int i=1;i<aonde.length;i++){
            
            System.out.print("Linha "+i+"\nColunhas: ");
            for(int j=0;j<aonde[i].length;j++){
                
                System.out.print(aonde[i][j]+ " ");
            }
            
            System.out.println("\n");
        }
        System.out.println("\n");
    }
    public void setAonde(int[] colunas){
        int[][]res=aonde;
        aonde=new int[aonde.length+1][colunas.length];
        for(int i=0;i<res.length;i++){
            aonde[i]=res[i];
        }
        aonde[res.length]=colunas;
    }
    public int[] checar(){
        return null;
    }
    public boolean teste(char[] c){
        return false;
    }
}