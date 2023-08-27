import java.io.IOException;
import java.util.HashMap;

public class ScannerManual{

    public ScannerManual(){
        TextFiles t=new TextFiles();
        int linha=1;
        t.openFile();
        linha =1;
        System.out.println("Palavras Reservadas");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            PalavraReservadas pr=new PalavraReservadas(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Indentificador");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            Indentificador i=new Indentificador(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Const Inteira");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            ConstanteInteira ci=new ConstanteInteira(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Const Hexadecimal");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            ConstanteHexadecimal ci=new ConstanteHexadecimal(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Const Octal");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            ConstanteOctal ci=new ConstanteOctal(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Const Reais");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            ConstanteReal ci=new ConstanteReal(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Cadeia de Caracteres");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            CadeiaCaracteres ci=new CadeiaCaracteres(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Caracteres");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            Caracteres ci=new Caracteres(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Operadores");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            Operadores ci=new Operadores(1, s, linha);
            linha+=1;
        }

        t.openFile();
        linha =1;
        System.out.println("Espacos em Branco");
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            EspacosBranco ci=new EspacosBranco(1, s, linha);
            linha+=1;
        }


    }
}