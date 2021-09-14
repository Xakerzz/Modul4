package TestString;

public class String {
    static StringBuilder mulString(java.lang.String p, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(p);
        }
        return stringBuilder;
    }

    public static void main(java.lang.String[] args) {
        System.out.println(  mulString("A", 200000));
//        StringBuilder stringBuilder = new StringBuilder("StringBuilder");
//        stringBuilder.append("- класс часто изменяемых строк.");
//        System.out.println(stringBuilder);
    }
}
