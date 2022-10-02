public class Student {

    String name;
    String surname;
    String group;
    double mark;

    public Student(String name, String surname, String group, double mark){
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.mark = mark;
    }

    public int getScholarship(){
        if (mark == 5){
            return 10000;
        }
        else{
            return 8000;
        }
    }
}