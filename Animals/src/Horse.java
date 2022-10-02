public class Horse extends Animal{
    String food = "Сено";

    @Override
    public void makeNoise(){
        System.out.println("Фрр");
    }

    @Override
    public void eat(){
        System.out.println("Лошадь ест");
    }
}
