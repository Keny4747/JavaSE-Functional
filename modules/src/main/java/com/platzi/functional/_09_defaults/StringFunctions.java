package com.platzi.functional._09_defaults;

public class StringFunctions {

    public static void main(String[] args) {
        StringOperation six = ()-> 6;
        six.operate("Alumno");

        StringOperation.DoOperation operateFive = text -> System.out.println(text);
        operateFive.execute(5,"Cadena");
    }

    @FunctionalInterface
    interface StringOperation{
        int getAumount();
        default void operate(String text){
            int x = getAumount();
            while(x-- >0){
                System.out.println(text);
            }
        }

        @FunctionalInterface
        interface  DoOperation{
            void take(String text);

            default void execute(int x, String text){
                while(x-- > 0){
                    take(text);
                }
            }
        }


    }
}
