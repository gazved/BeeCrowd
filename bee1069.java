import java.util.*;
class bee1069{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            String entrada = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            int diamantes = 0;
            
            for (int j = 0; j < entrada.length(); j++) {
                char ch = entrada.charAt(j);
                
                if (ch == '<') {
                    stack.push(ch);
                } else if (ch == '>' && !stack.isEmpty()) {
                    stack.pop();
                    diamantes++;
                }
            }
            
            System.out.println(diamantes);
        }
        sc.close();
    }
}