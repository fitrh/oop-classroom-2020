import java.util.HashMap;
import java.util.Map;

public class StudIdMain {
    public static void main(String[] args) {
        Map<String, String> facultyMap = new HashMap<>();
        Map<String, String> majorMap = new HashMap<>();
        facultyMap.put("Ekonomi dan Bisnis", "A");
        facultyMap.put("Hukum", "B");
        facultyMap.put("Kedokteran", "C");
        facultyMap.put("Teknik", "D");
        facultyMap.put("Ilmu Sosial dan Ilmu Politik", "E");
        facultyMap.put("Ilmu Budaya", "F");
        facultyMap.put("Pertanian", "G");
        facultyMap.put("MIPA", "H");
        majorMap.put("Matematika", "01");
        majorMap.put("Fisika", "02");
        majorMap.put("Kimia", "03");
        majorMap.put("Biologi", "04");
        majorMap.put("Statistika", "05");
        majorMap.put("Geofisika", "06");
        majorMap.put("Ilmu Komputer", "07");
        majorMap.put("Aktuaria", "08");

        StudentIdentity student1 = new StudentIdentity();
        StudentIdentity student2 = new StudentIdentity();
        StudentIdentity student3 = new StudentIdentity();

        student1.setFirstName("mUHammAd");
        student1.setLastName("fITRAH");
        student1.setRegisterYear(2017);
        student1.setFaculty("MIPA");
        student1.setDepartment("Matematika");
        student1.setMajor("Ilmu Komputer");
        student1.setId(facultyMap, majorMap);
        student1.setEmail(facultyMap);

        student2.setFirstName("KENNEDY");
        student2.setLastName("");
        student2.setRegisterYear(2017);
        student2.setFaculty("MIPA");
        student2.setDepartment("Matematika");
        student2.setMajor("Ilmu Komputer");
        student2.setId(facultyMap, majorMap);
        student2.setEmail(facultyMap);

        student3.setFirstName("Khawaritzmi");
        student3.setLastName("abdallah ahmad");
        student3.setRegisterYear(2017);
        student3.setFaculty("MIPA");
        student3.setDepartment("Matematika");
        student3.setMajor("Ilmu Komputer");
        student3.setId(facultyMap, majorMap);
        student3.setEmail(facultyMap);

        student1.description();
        student2.description();
        student3.description();
    }
}