import java.io.IOException;
import java.util.HashMap;

public class ScannerManual{
    
    PalavraReservadas pr=new PalavraReservadas();
    Indentificador i=new Indentificador();
    ConstanteInteira ci=new ConstanteInteira();
    ConstanteHexadecimal ch=new ConstanteHexadecimal();
    ConstanteOctal co=new ConstanteOctal();
    ConstanteReal cr=new ConstanteReal();
    CadeiaCaracteres cc=new CadeiaCaracteres();
    Caracteres c=new Caracteres();
    Operadores o=new Operadores();
    EspacosBranco eb=new EspacosBranco();

    public ScannerManual(){
        TextFiles t=new TextFiles();
        t.openFile();
        while(t.input.hasNext()){
            String s=t.input.nextLine();
            pr.setAonde(pr.checar(s));
            i.setAonde(i.checar(s));
            ci.setAonde(ci.checar(s));
            ch.setAonde(ch.checar(s));
            co.setAonde(co.checar(s));
            cr.setAonde(cr.checar(s));
            cc.setAonde(cc.checar(s));
            c.setAonde(c.checar(s));
            o.setAonde(o.checar(s));
            eb.setAonde(eb.checar(s));
        }
        pr.imprimir();
        i.imprimir();
        ci.imprimir();
        ch.imprimir();
        co.imprimir();
        cr.imprimir();
        cc.imprimir();
        c.imprimir();
        o.imprimir();
        eb.imprimir();
    }
}