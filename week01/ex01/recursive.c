//
// Created by Stephan Stofer on 27.02.22.
//

#include <stdio.h>
#include "recursive.h"

void printNumbersRecursiveFunction(int n){
    if (n > 0) {
        printNumbersRecursiveFunction(n - 1);
    }
    printf("%d ", n);
}

void printReverseNumbersRecursiveFunction(int n) {
    printf("%d ", n);
    if (n > 0) {
        printReverseNumbersRecursiveFunction(n - 1);
    }
}
