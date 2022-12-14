package Annotations;

import java.lang.reflect.Method;

public class main {

    public static void main(String[] args){
        House23 house23 = new House23();

        Method methods[] = house23.getClass().getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.isAnnotationPresent(FloorDimension.class));
        }

        Class<?> clss = house23.getClass();

        System.out.println(clss.isAnnotationPresent(BuilderHistory.class));
    }
}
