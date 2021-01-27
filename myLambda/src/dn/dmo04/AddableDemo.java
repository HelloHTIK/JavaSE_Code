package dn.dmo04;

/**
 * @Author WTIHK
 * @Date 2021/1/26
 */

/*
    练习3
        1.定义一个接口（Addabel），里面定义一个抽象方法： int add(int x, int y);
        2.定义一个测试类（AddableDemo），在测试类中提供两个方法
          一个方法是：useAddable(Addable a)
          一个方法是主方法，在主方法中调用 useAddable 方法
 */

public class AddableDemo {
    public static void main(String[] args) {

        //在主方法中调用useAddable方法
        useAddable((int x, int y) -> {
            return x + y;
//            return x - y;
//            return x * y;
//            return x / y;
        });


    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

}
