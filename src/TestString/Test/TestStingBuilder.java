package TestString.Test;



public class TestStingBuilder {
private static void testStringBuilderSec(java.lang.String p, int n){
    long startTime = System.currentTimeMillis();
    StringBuilder sb = new StringBuilder(p);
    for (int i = 0; i <n; i++) {
        sb.setCharAt(0,'p');
        System.out.println(sb);
    }
    System.out.println(System.currentTimeMillis() - startTime);
}


    public static void main(String[] args) {
        testStringBuilderSec("AAAAABBBBB",1000000);
    }
}
