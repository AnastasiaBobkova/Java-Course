package homeassignments.task8;

public class StringInsertion {
    public static void main(String[] args) {
        int k = 2;
        String str = "IT";
        String newString = insertUserString(k, str);
        System.out.println("Новая строка: " + newString);
    }

    public static String insertUserString (int k, String str) {
        String initialString =
                "Каждая строка , создаваемая с помощью оператора new , литерала ( заключенная в двойные апострофы ) или метода класса , создающего строку , является экземпляром класса String . " +
                "Особенностью объекта класса String является то , что его значение не может быть изменено после создания объекта при помощи любого метода класса . " +
                "Изменение строки всегда приводит к созданию нового объекта в heap . Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке . " +
                "Произведенные изменения можно сохранить переинициализируя ссылку .";
        String splitter = " ";

        String[] words = initialString.split(splitter);
        String newString = new String();

        for (String word : words) {
               if (word.length() <= k) {
                   newString += word + splitter;
                }
               else {
                   newString += word.substring(0,k) + str + splitter;
               }
           }
        return newString;
    }
}