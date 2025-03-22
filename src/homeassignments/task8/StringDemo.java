package homeassignments.task8;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(stringMethods("Я люблю java", "java"));
    }

    public static String stringMethods (String str1, String str2) {
        if (str1.endsWith(str2)) {
            return str1.substring(0,str1.indexOf(str2));
        }
        else return str1.toUpperCase();
    }
}