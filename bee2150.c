#include <stdio.h>
#include <string.h>

int main() {
    char vogais[1000];
    char principal[1000];
   
    while (scanf("%s", vogais) != EOF) {
        scanf("%s", principal);
        int contador = 0; 
        
        int tamanho_principal = strlen(principal);
        int tamanho_vogais = strlen(vogais);
        
        
        for (int i = 0; i < tamanho_principal; i++) {
            for (int j = 0; j < tamanho_vogais; j++) {
                if (principal[i] == vogais[j]) {
                    contador++;
                }
            }
        }
        
        printf("%d\n", contador);  
    }

    return 0;
}
