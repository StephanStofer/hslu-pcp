cmake_minimum_required(VERSION 3.20)
project(ex02 C)

set(CMAKE_C_STANDARD 11)

include_directories(.)

add_executable(ex02
        main.c
        stack.c
        stack.h)
