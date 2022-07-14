#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void inverter(char vetor[]){
    int i, aux, end, tam = strlen(vetor);

    end = tam - 1; 
    for(i = 0; i < tam/2; i++){
        aux = vetor[i];
        vetor[i] = vetor[end];
        vetor[end] = aux;
        end--;
    }
}

int main() {

  char word[30] = ("target sistemas");

  printf("%s\n", word);
  inverter(word);
  printf("%s\n", word);

  
  return 0;
}
