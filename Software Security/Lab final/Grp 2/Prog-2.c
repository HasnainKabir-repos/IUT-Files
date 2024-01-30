// Points: 10 pts

// Encode the ">" character

#define MAX_SIZE 16
#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <stdlib.h>


int main(int argc, char *argv[]){
    int i, j=0;
    char buf[MAX_SIZE];
    
    /*checks if the user provided an input*/
    if (argc<2) return 0;
    
    /*checks if the input provided by the user fits in the array a*/
    if (MAX_SIZE <= strlen(argv[1])){
       printf("Long String....");
       return 0;
    }
 
    /*performs the encoding*/
    for (i=0; i < strlen(argv[1]); i++){
        if( '>' == argv[1][i] ){
            buf[j++] = '&';
            buf[j++] = 'g';
            buf[j++] = 't';
            buf[j++] = ';';
        }
        else buf[j++]=argv[1][i]; 
     }
     printf("The encoded string is %s \n",buf);
     return 0;
}