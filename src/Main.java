public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 3;
        triangle.c = 7;
        System.out.println("Уч бурчтуктун (а) узундугу: "+triangle.a);
        System.out.println("Уч бурчтуктун (b) узундугу: "+triangle.b);
        System.out.println("Уч бурчтуктун (c) узундугу: "+triangle.c);
        triangle.area();
    }
}