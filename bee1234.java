import java.util.*;
public class bee1234 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System .in);
        while(sc.hasNextLine()){
            String entrada = sc.nextLine();
            StringBuilder saida = new StringBuilder();
            boolean isupper =true;
            for(int i = 0; i< entrada.length();i++){
                char a = entrada.charAt(i);
                if(Character.isLetter(a)){
                    if(isupper){
                        a = Character.toUpperCase(a);
                        
                    }
                    saida.append(a);
                    isupper = !isupper;
                }else{
                    saida.append(a);
                }
            }
            System.out.println(saida);
        }
        sc.close();
    }
}
