public class StudentDemo23 {
    public static void main(String[] args) {
        TopStudents23 topstudents = new TopStudents23(5);

        topstudents.add(new Student23("2281", "Alice", "A", 3.9));
        topstudents.add(new Student23("2282", "Bob", "A", 3.7));
        topstudents.add(new Student23("2283", "Charlie", "A", 3.8));
        topstudents.add(new Student23("2284", "David", "A", 3.6));
        topstudents.add(new Student23("2285", "Eve", "A", 4.0));

        System.out.println("Original student list:");
        topstudents.print();

        topstudents.bubbleSort();

        System.out.println("Sorted student list (by GPA, descending):");
        topstudents.print();
    }
}
