package com.driver;

public class Main {

    public static class A{

        public static String meth()
        {
            return "Invoking Method of class A";
        }

    }

    public static class B extends A{

         public static String meth()
         {
             return "Method is overridden in Extended class B";
         }

    }

    public static void main(String[] args) {
        B obj = new B();
        String s = obj.meth();
        System.out.println(s);

    }

}