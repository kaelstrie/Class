public class Aspirant extends Student {

    String project;

    public Aspirant(String name, String surname, String group, double mark) {
        super(name, surname, group, mark);
    }

    @Override
    public int getScholarship(){
        if(mark == 5){
            return 20000;
        }
        else{
            return 18000;
        }
    }
}