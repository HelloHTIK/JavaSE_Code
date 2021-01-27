package hn.demo07;

/**
 * @Author WTIHK
 * @Date 2021/1/26
 */

/*
     Lambda 表达式和匿名内部类的区别
 */

public class LambdaDemo {
    public static void main(String[] args) {

        /*

        //使用匿名内部类调用
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });

        */


        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });



        //Lambda 表达式
//        useInter(() -> System.out.println("接口"));

//        useAnimal(() -> System.out.println("抽象类"));

//        useStudent(() -> System.out.println("具体类"));

//        useInter(new Inter() {
//            @Override
//            public void show() {
//                System.out.println("show");
//            }
//
//            @Override
//            public void show2() {
//                System.out.println("show2");
//            }
//        });


    }

    private static void useStudent(Student s) {
        s.study();
    }


    private static void useAnimal(Animal a) {
        a.method();
    }


    private static void useInter(Inter i) {
        i.show();
    }


}
