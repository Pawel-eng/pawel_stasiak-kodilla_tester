import java.lang.management.ManagementFactory;

public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int[] getGrades() {
        return grades;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }
        return sum / this.grades.length;
    }

    public int returnLastElement() {
        return grades[grades.length - 1];
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        System.out.println(grades.getGrades());
        grades.add(1);
        grades.add(3);
        grades.add(5);
        grades.add(7);
        grades.add(8);
        grades.add(2);
        grades.add(1);
        grades.add(3);
        grades.add(5);
        grades.add(4);
        System.out.println("ostatni element" + " " + grades.returnLastElement());
        System.out.println(grades.getGrades()[0]);
        System.out.println(grades.getGrades()[1]);
        System.out.println(grades.getGrades()[2]);
        System.out.println(grades.getGrades()[3]);
        System.out.println(grades.getGrades()[4]);
        System.out.println(grades.getGrades()[5]);
        System.out.println(grades.getAverage());
    }
}