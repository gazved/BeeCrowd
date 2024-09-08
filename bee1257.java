import java.util.*;
public class bee1257 {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        Map<Character, Integer> alfabetoMap = new HashMap<>();
        for(char c = 'A'; c<='Z'; c++){
            alfabetoMap.put(c, c- 'A');
        }
        
        for(int i = 0; i<N;i++){
            int L = sc.nextInt();
            sc.nextLine();
            int value = 0;
            
           for(int j=0;j<L;j++){
             String line = sc.nextLine();
              for(int k =0;k<line.length();k++){
                char c = line.charAt(k);
                value += j + alfabetoMap.get(c) + k;
              }
           }
           System.out.println(value);
        }
        sc.close();
    }
}
