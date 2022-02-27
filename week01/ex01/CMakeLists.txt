cmake_minimum_required(VERSION 3.20)
project(ex01 C)

set(CMAKE_C_STANDARD 11)

include_directories(.)

add_executable(ex01
        for.c
        for.h
        goto.c
        goto.h
        main.c
        recursive.c
        recursive.h)
