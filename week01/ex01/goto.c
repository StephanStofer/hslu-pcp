//
// Created by Stephan Stofer on 27.02.22.
//

#include "goto.h"
#include <stdio.h>

void printNumbersGoto(int n){
    int counter = 0;
    START:
    if (n >= counter){
        printf("%d ", counter);
        counter++;
        goto START;
    }
}
