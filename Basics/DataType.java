package Basics;

public class DataType {
    int integerType = 10;
    float floatType = 3.14f;
    double doubleType = 5.6789;
    char charType = 'A';
    String stringType = "Hello Java";
    boolean booleanType = true;

    public static void main(String[] args) {
        DataType data = new DataType();
        System.out.println("Integer Type : " + data.integerType);
        System.out.println("Float Type : " + data.floatType);
        System.out.println("Double Type : " + data.doubleType);
        System.out.println("Character Type : " + data.charType);
        System.out.println("String Type : " + data.stringType);
        System.out.println("Boolean Type : " + data.booleanType);
    }
}
