package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> list=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println(list);
        double result = list.stream().map(x -> x * x)
                .mapToDouble(x -> x)
                .average().getAsDouble();
        System.out.println("Average: "+result);
        System.out.println("Task 2");
        Test test=new Test(10,"qwerty");
        try {
            Method method=test.getClass().getDeclaredMethod("square");
            method.setAccessible(true);
            method.invoke(test);
            method=test.getClass().getDeclaredMethod("UpperCase");
            method.setAccessible(true);
            System.out.println(method.invoke(test));
            method=test.getClass().getDeclaredMethod("group");
            method.setAccessible(true);
            method.invoke(test);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
