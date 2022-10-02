public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", "1", 4.5);
        Student student2 = new Student("Иван", "Иванов", "1", 5);
        Student student3 = new Student("Иван", "Иванов", "1", 3);
        Student student4 = new Aspirant("Иван", "Иванов", "1", 4);
        Student student5 = new Aspirant("Иван", "Иванов", "1", 5);

        Student[] students = {student1, student2, student3, student4, student5};

        for(Student student : students){
            System.out.println(student.getScholarship());
        }
    }
}