//
// Created by Stephan Stofer on 27.02.22.
//


#include <stdio.h>
#include <stdlib.h>
#include "goto.h"
#include "for.h"
#include "recursive.h"

#define NUMBERS 7

int main(int argc, char **argv) {
    printNumbersGoto(NUMBERS);
    printf("= printNumbersGoto(%d)\n", NUMBERS);
    printNumbersFor(NUMBERS);
    printf("= printNumbersFor(%d)\n", NUMBERS);
    printNumbersRecursiveFunction(NUMBERS);
    printf("= printNumbersRecursiveFunction(%d)\n", NUMBERS);
    printReverseNumbersRecursiveFunction(NUMBERS);
    printf("= printReverseNumbersRecursiveFunction(%d)\n", NUMBERS);
    return (EXIT_SUCCESS);
}