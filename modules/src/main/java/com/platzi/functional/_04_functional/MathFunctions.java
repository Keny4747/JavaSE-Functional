package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {
        //1: FUNCTION
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(square.apply(5));

        //Otra Sintaxis:
        Function<Integer, Boolean> isOdd = x -> x % 2 ==1;

        //2. Predicate: Con los predicados podemos hacer validaciones más rapidas
        //el predicado siempre retorna un boolean
        Predicate<Integer> isEven = x-> x % 2 == 0;

        System.out.println(isEven.test(4));

        //otro ejemplo:
        Predicate<Student> isApproved = x -> x.getCalificacion() >= 6;

        Student carlos = new Student(4);
        System.out.println(isApproved.test(carlos));
    }

    static class Student{
        private double calificacion;

        public Student(double calificacion){
            this.calificacion=calificacion;
        }
        public double getCalificacion() {
            return calificacion;
        }
    }
}
