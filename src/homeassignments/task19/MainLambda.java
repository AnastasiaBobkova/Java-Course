package homeassignments.task19;

public class MainLambda {
    public static void main(String[] args) {
        UppercaseString uppercaseString = (String str) -> {
            return str.toUpperCase();
        };

        String newStr = uppercaseString.getUppercaseString("random lowercase string transformed to uppercase");
        System.out.println(newStr);
    }
}