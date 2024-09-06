import java.util.*;

public class bee1239 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String entrada = sc.nextLine();
            
            
            StringBuilder saida = new StringBuilder();
            boolean italico = false;
            boolean negrito = false;

           
            for(int i =0; i<entrada.length();i++){
                char ch = entrada.charAt(i);
                if (ch == '_') {
                    if (italico) {
                        saida.append("</i>");
                    } else {
                        saida.append("<i>");
                    }
                    italico = !italico; 
                } else if (ch == '*') {
                    if (negrito) {
                        saida.append("</b>");
                    } else {
                        saida.append("<b>");
                    }
                    negrito = !negrito;
                } else {
                    saida.append(ch); 
                }
            }

            System.out.println(saida);
        }
        

        sc.close();
    }
}
