import java.util.*;
public class bee1263 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String palavras = sc.nextLine().trim();  
            if (palavras.isEmpty()) {
                continue;  
            }

            
            palavras = palavras.toUpperCase();
            String[] palavrasArray = palavras.split(" ");

            int aliteracao = 0;
            char lastInitial = '\0';
            boolean isCurrentAlliteration = false;

            for (int i = 0; i < palavrasArray.length; i++) {
                char currentInitial = palavrasArray[i].charAt(0);

                if (currentInitial == lastInitial) {
                    if (!isCurrentAlliteration) {
                        aliteracao++;
                        isCurrentAlliteration = true;
                    }
                } else {
                    isCurrentAlliteration = false;
                }

                lastInitial = currentInitial;
            }

            System.out.println(aliteracao);
        }

        sc.close();
    }
}
