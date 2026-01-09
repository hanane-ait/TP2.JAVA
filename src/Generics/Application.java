package Generics;

public class Application {

    public static void main(String[] args) {

        //  Integer
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(88);



        System.out.println("Integer element: " + intStorage.getElement(0));
        intStorage.removeElement(1);
        System.out.println("Size after remove: " + intStorage.getSize());

        // String
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Java");
        stringStorage.addElement("Python");
        stringStorage.addElement("C++");

        System.out.println("String element: " + stringStorage.getElement(1));

        // Double
        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(15.5);
        doubleStorage.addElement(20.0);
        doubleStorage.addElement(18.0);

        System.out.println("Double size: " + doubleStorage.getSize());
    }
}

