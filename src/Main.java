import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> StudentClassA = new ArrayList<>();
        List<String> StudentClassB = new ArrayList<>();
        List<String> StudentClassC = new ArrayList<>();

        StudentClassA.add("Murathan Güleç");
        StudentClassA.add("Serkan Öz");
        StudentClassA.add("Murathan Güler");
        StudentClassA.add("Furkan Demir");

        StudentClassB.add("Mert Uslu");
        StudentClassB.add("Ahmethan Yılmaz");
        StudentClassB.add("Emrecan Demir");
        StudentClassB.add("Handan Kara");

        StudentClassC.add("Leylan Tatlı");
        StudentClassC.add("Kayra Uçar");
        StudentClassC.add("Ayla Metehan");
        StudentClassC.add("Aslı Koçak");


        Map<String, List<String>> classStudent = new HashMap<>();
        classStudent.put("A", StudentClassA);
        classStudent.put("B", StudentClassB);
        classStudent.put("C", StudentClassC);

        for (Map.Entry<String, List<String>> entry : classStudent.entrySet()) {
            String className = entry.getKey();
            List<String> students = entry.getValue();

            for (String student : students) {
                String[] split = student.split(" ");
                String name = split[0];

                if (name.endsWith("an")) {
                    System.out.println("class:" + className + ": " + student);
                }
            }
        }
    }
}


