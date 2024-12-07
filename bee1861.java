import java.util.*;
public class bee1861 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Assassino;
        while(sc.hasNextLine()){
            boolean morto;
            Assassino = sc.nextLine();
            String dead = sc.nextLine();
            No x = new No(Assassino, false);


            


        }
        
    }
    
}

class No{
    String elemento;
    boolean morto = false;

    No dir;
    No esq;
    No(String elemento, boolean morto){
        this(elemento,null,null);
        this.morto = morto;
    }
    No(String elemento, No dir, No esq){
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
    No Inserir(No i, String x)throws Exception{
        if(i == null){
            i = new No(x, );
        }else if(i.elemento.compareTo(x)> 0){
            i.dir = Inserir(i.dir, x);
        }else if(i.elemento.compareTo(x) < 0){
            i.esq = Inserir(i.esq, x);
        }else{
            throw new Exception("erro");
        }
        return i;
    }

}




//inserção em arvore binaria   
/*
 * No Inserir(No i, int x){
 * if(i ==null){
 *   i = new No(x);
 * }else if(i.elemento>x){
 * i.dir = Inserir(i.dir, x);
 * }
 * }
 * 
 * 
 */