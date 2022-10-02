public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal animal3 = new Cat();

        animal1.location = "Будка";
        animal2.location = "Стойло";
        animal3.location = "Дом";

        Animal[] animals = {animal1, animal2, animal3};

        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal : animals){
            veterinarian.treatAnimal(animal);
        }
    }
}