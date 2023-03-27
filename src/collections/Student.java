package collections;

public class Student {
    int id;
    String name;
    float average;

    public Student(int id, String name, float average) {
        this.id = id;
        this.name = name;
        this.average = average;
    }

    @Override
    public String toString() {
        return "\n\tStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", average=" + average +
                "}";
    }
}
