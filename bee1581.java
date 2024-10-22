import java.util.*;
public class bee1581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            String idioma = "";
            int k = sc.nextInt();
            sc.nextLine();
            String linguas[] = new String[k];
            for(int j =0; j<k; j++){
               linguas[j] = sc.nextLine();
            }
            for(int j =1; j<k; j++){
               if(linguas[0].equals(linguas[j]) ){
                idioma = linguas[0];
               }else{
                idioma = "ingles";
                j =k;
               }
             }
             System.out.println(idioma);


        }
        sc.close();
    }
}
