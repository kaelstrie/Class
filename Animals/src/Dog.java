public class Dog extends Animal{
    String food = "Корм";

    @Override
    public void makeNoise(){
        System.out.println("Гав");
    }

    @Override
    public void eat(){
        System.out.println("Собака ест");
    }
}