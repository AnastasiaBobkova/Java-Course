package homeassignments.task17;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged,and so Nicholas, acquiring a trotter of his own, very stylish riding breeches " +
                "of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his " +
                "time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he " +
                "had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his " +
                "kissing Sónya on the sly — he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced " +
                "with silver, and wearing the Cross of St. George, awarded to soldiers for bravery inaction, and in the company of well-known, elderly, and respected racing men was " +
                "traiing a trotter of his own for a race. He knew a lady on one of theboulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ " +
                "ball, talked about the war with Field Marshal Kámenski, visited the EnglishClub, and was on intimate terms with a colonel of forty to whom Denísov had " +
                "introduced him.";
        String fileAbsolutePath = "C:\\Users\\anastasiya.bobkova\\Documents\\Курс Java\\Урок 17";
        String fileRelativePath = "files\\secondFile.txt";

        writeViaAbsolutePath(text, fileAbsolutePath);
        writeViaRelativePath(text, fileRelativePath);
        readViaAbsolutePath(fileAbsolutePath);
        readViaRelativePath(fileRelativePath);

        Car car = createCar();
        String pathForSerialization = "files/carSerialization.txt";
        serialize(car, pathForSerialization);
        Car newCar = deserialize(pathForSerialization);
        System.out.println(newCar);
    }

    private static void writeViaAbsolutePath(String text, String fileAbsolutePath) {
        File file = new File(fileAbsolutePath, "firstFile.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }

    private static void writeViaRelativePath(String text, String fileRelativePath) {
        File file = new File(fileRelativePath);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }

    private static void readViaAbsolutePath(String fileAbsolutePath) {
        File file = new File(fileAbsolutePath, "firstFile.txt");
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readText = bufferedReader.readLine();
            System.out.println(readText);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }

    private static void readViaRelativePath(String fileRelativePath) {
        File file = new File(fileRelativePath);
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readText = bufferedReader.readLine();
            System.out.println(readText);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }

    private static Car createCar() {
        return new Car("BMW X5", 250, "Германия");
    }

    private static void serialize(Car car, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }

    private static Car deserialize(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car car = (Car) objectInputStream.readObject();
            return car;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }
}