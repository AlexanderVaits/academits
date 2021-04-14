package academits.vaits.vector_main;

import academits.vaits.vector.Vector;

public class Main {
    public static void main(String[] args) {
        // Constructors tests
        // First constructor test

        int testSize1 = 5;
        Vector vector1 = new Vector(testSize1);
        System.out.println("Вектор созданный первым конструктором: " + vector1);
        System.out.println();

        // Second constructor test

        double[] testComponents1 = {1, 2, 4, 5};

        Vector vector2 = new Vector(testComponents1);
        System.out.println("Вектор созданный вторым конструктором: " + vector2);
        System.out.println();

        // Third constructor test

        int testSize2 = 3;
        double[] testComponents2 = {5, 6, 7, 8};

        Vector vector3 = new Vector(testSize2, testComponents2);
        System.out.println("Вектор созданный третьим конструктором: " + vector3);
        System.out.println();

        // Fourth constructor test

        Vector vector4 = new Vector(vector2);
        System.out.println("Вектор созданный четвертым конструктором: " + vector4);
        System.out.println();

        // getSize test

        System.out.println("Размерность вектора 4: " + vector4.getSize());
        System.out.println();

        // Static method tests
        // Add test

        Vector resultingAdditionVector = Vector.getSum(vector2, vector3);
        System.out.println("Результат сложения векторов 2 и 3: " + resultingAdditionVector);
        System.out.println();

        // Deduct test

        Vector resultingDifferenceVector = Vector.getDifference(vector2, vector3);
        System.out.println("Результат разницы векторов 2 и 3: " + resultingDifferenceVector);
        System.out.println();

        // Scalar Product test

        double scalarProductResult = Vector.getScalarProduct(vector2, vector3);
        System.out.println("Скалярное произведение векторов 2 и 3 = " + scalarProductResult);
        System.out.println();

        // Not static method test
        // Add test

        vector1.add(vector3);
        System.out.println("Результат прибавления вектора 3 к вектору 1: " + vector1);
        System.out.println();

        // Deduct test

        vector1.subtract(vector4);
        System.out.println("Результат вычитания вектора 4 из вектора 3: " + vector1);
        System.out.println();

        // multiply by scalar test

        resultingAdditionVector.multiplyByScalar(2);
        System.out.println("Резульатат умножения вектора на скаляр: " + resultingAdditionVector);
        System.out.println();

        // Reverse test

        resultingAdditionVector.reverse();
        System.out.println("Результат разворота вектора: " + resultingAdditionVector);
        System.out.println();

        // Get length test

        System.out.println("Длина вектора: " + resultingAdditionVector.getLength());
        System.out.println();

        // Get/Set component by index

        System.out.println("Компонента вектора по индексу: " + resultingAdditionVector.getComponent(3));
        System.out.println();

        resultingAdditionVector.setComponent(3, 10);
        System.out.println("Измененная компонента по индексу: " + resultingAdditionVector.getComponent(3));
        System.out.println();

        double[] vectorTest1comp = {1, 2, 3, 4, 5,};
        double[] vectorTest3comp = {1, 2, 3, 4, 5,};
        Vector vectorTest1 = new Vector(vectorTest1comp);
        Vector vectorTest2 = new Vector(vectorTest1);
        Vector vectorTest3 = new Vector(vectorTest3comp);
        vectorTest1.add(vectorTest3);
        System.out.println(vectorTest1);
        System.out.println(vectorTest2);
    }
}
