package homeassignments.task9;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog ("коричневый", 15, "мясо", "Рекс","Бигль",10);
        Bird bird = new Bird("серый", 10, "насекомые", "Синица",100);

        System.out.println("Что может собака?");
        dog.makeSound();
        dog.bite();
        dog.jump();
        dog.play();
        dog.run();

        System.out.println("Что может птица?");
        bird.makeSound();
        bird.peck();
        bird.hatch();
        bird.play();

        Zoo zoo = new Zoo();

        Dog dog1 = new Dog ("чёрный", 20, "мясо", "Бим","Лабрадор",30);
        Dog dog2 = new Dog ("рыжий", 15, "мясо", "Микки","Корги",20);
        Dog dog3 = new Dog ("серый", 12, "мясо", "Джим","Мопс",10);
        Bird bird1 = new Bird("серый", 10, "насекомые", "Синица",300);
        Bird bird2 = new Bird("зелёный", 20, "растения", "Попугай",150);
        Bird bird3 = new Bird("коричневый", 10, "насекомые", "Воробей",200);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        System.out.println("\nПоведение животных зоопарка:");

        for (Animal animal : zoo.getAnimals()) {
            animal.makeSound();
            animal.play();
        }

        Lion lion1 = new Lion ("коричневый", 20, "мясо", "Берберийски лев");
        Lion lion2 = new Lion ("рыжий", 15, "мясо","Азиатский лев");
        Lion lion3 = new Lion ("белый", 10, "мясо", "Сенегальский лев");
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        System.out.println("\nПоведение животных зоопарка, включая львов:");

        for (Animal animal : zoo.getAnimals()) {
            animal.makeSound();
            animal.play();
        }

        System.out.println("\nИнформация о всех животных зоопарка:");
        zoo.zooAnimalsInfo();

        int idToDelete = 5;
        zoo.deleteAnimal(idToDelete);
        System.out.println("\nЖивотные зоопарка после удаления животного с номером " + idToDelete+":");
        zoo.zooAnimalsInfo();
    }
}