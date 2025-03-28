package homeassignments.task9;

public class Zoo {
    private Animal[] animals = new Animal[] {};

    public void addAnimal(Animal animal){
        Animal[] newAnimals = new Animal[animals.length+1];

        for (int i = 0; i <= animals.length; i++) {
            if (i==animals.length) {
                newAnimals[i] = animal;
            } else {
                newAnimals[i] = animals[i];
            }
            newAnimals[i].setId(i+1);
        }
        animals = newAnimals;
    }

    public void deleteAnimal(int id){
        Animal[] newAnimals = new Animal[animals.length-1];

        int j = 0;
        for (int i = 0; i <= animals.length-1; i++) {
            if (animals[i].getId() == id) {
                i++;
                if (i==animals.length) {
                    break;
                }
                newAnimals[j] = animals[i];
            }
            else {
                newAnimals[j] = animals[i];
            }
            j++;
        }
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void zooAnimalsInfo() {
        for (Animal zooAnimal : animals) {
            System.out.println(zooAnimal.toString());
        }
    }
}