package meta.programming.sample;

import java.lang.reflect.InvocationTargetException;

public class PlayGround {
    public static void main(String[] args) {
        try {
            // リフレクションを使ってクラスを生成
            Class<?> testClassClass = Class.forName("meta.programming.sample.TestClass");
            TestClass testClass = (TestClass) testClassClass.getDeclaredConstructor().newInstance();

            System.out.println(testClass.xy());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }
}
