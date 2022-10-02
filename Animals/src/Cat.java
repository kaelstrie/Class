public class Cat extends Animal{
    String food = "Рыба";

    @Override
    public void makeNoise(){
        System.out.println("Мяу");
    }

    @Override
    public void eat(){
        System.out.println("Кот ест");
    }
}