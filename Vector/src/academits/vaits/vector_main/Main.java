package academits.vaits.vector_main;

import academits.vaits.vector.Vector;

public class Main {
    public static void main(String[] args) {
        // Constructor tests
        // First constructor test

        int testSize1 = 5;
        Vector vector1 = new Vector(testSize1);
        System.out.println("Вектор созданный первым конструктором: " + vector1);
        System.out.println();

        // Second constructor test

        double[] testComponents1 = {
                1, 2, 4, 5
        };

        Vector vector2 = new Vector(testComponents1);
        System.out.println("Вектор созданный вторым конструктором: " + vector2);
        System.out.println();

        // Third constructor test

        int testSize2 = 8;
        double[] testComponents2 = {
                3, 2, 4, 5, 6, 7, 8
        };

        Vector vector3 = new Vector(testSize2, testComponents2);
        System.out.println("Вектор созданный третьим конструктором: " + vector3);
        System.out.println();

        // Fourth constructor test

        Vector vector4 = new Vector(vector2);
        System.out.println("Вектор созданный четвертым конструктором: " + vector4);
        System.out.println();

        // getSize test

        System.out.println("Размерность вектора 4: " + Vector.getSize(vector4));
        System.out.println();

        // Static method tests
        // Add test
        Vector vectorAdd = Vector.add(vector2,vector3);
        System.out.println("Результат сложения векторов 2 и 3: " + vectorAdd);
        System.out.println();

        // Deduct test
        Vector vectorDeduct = Vector.deduct(vector2,vector3);
        System.out.println("Результат разницы векторов 2 и 3: " + vectorDeduct);
        System.out.println();

        // Scalar Product test
        double productResult = Vector.getScalarProductResult(vector2,vector3);
        System.out.println("Скалярное произведение векторов 2 и 3 = " + productResult);
        System.out.println();

        // Not static method test
        // Add test
        vector1.add(vector3);
        System.out.println("Результат прибавления вектора 3 к вектору 1: " + vector1);
        System.out.println();

        // Deduct test
        vector1.deduct(vector4);
        System.out.println("Результат вычитания вектора 4 из вектора 3: " + vector1);
        System.out.println();

        // multiply by scalar test
        vectorAdd.multiplyByScalar(2);
        System.out.println("Резульатат умножения вектора на скаляр: " + vectorAdd);
        System.out.println();

        // Expand test
        vectorAdd.expand();
        System.out.println("Результат разворота вектора: " + vectorAdd);
        System.out.println();

        // Get length test
        System.out.println("Длина вектора: " + vectorAdd.getLength());
        System.out.println();

        // Get/Set component by index
        System.out.println("Компонента вектора по индексу: " + vectorAdd.getComponent(3));
        System.out.println();

        vectorAdd.setComponent(3, 10);
        System.out.println("Измененная компонента по индексу: " + vectorAdd.getComponent(3));
        System.out.println();
    }
}
