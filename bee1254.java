import java.util.*;
public class bee1254 {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String inicial = sc.nextLine();
            String subs = sc.nextLine();
            String principal = sc.nextLine();
            StringBuilder dentro = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            boolean dentroDeTag = false;
            for(int i =0;i<principal.length();i++){
                char a = principal.charAt(i);
                if (a == '<') {
                    dentroDeTag = true;
                    temp.setLength(0); 
                }
                
                if (dentroDeTag) {
                    temp.append(a);
                    if (a == '>') {
                        dentroDeTag = false;
                        String str = temp.toString();
                        if (str.toLowerCase().contains(inicial.toLowerCase())) {
                            dentro.append(str.replaceAll("(?i)"+ inicial, subs));
                        } else {
                            dentro.append(str);
                        }
                    }
                } else {
                    dentro.append(a);
                }
            }
            System.out.println(dentro);
            }
           
           
            sc.close();

        }
       
    }
    
    

