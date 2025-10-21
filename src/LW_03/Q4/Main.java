package LW_03.Q4;

public class Main {
    public static void main(String[] args) {

        Course course = new Course();
        Lecture lecture = new Lecture();
        Student student = new Student();

        course.setCourseName("Engineering Technology");
        course.setCourseCode("ET_2022_035");
        course.setLecture(lecture);


        System.out.println();
        System.out.println(course.getLecture());
        System.out.println(course.getCourseName());
        System.out.println(course.getCourseCode());

        lecture.setLectureName("Pradeep");
        lecture.setCourseTeaching("CHEMISTRY");

        System.out.println();
        System.out.println(lecture.getLectureName());
        System.out.println(lecture.getCourseTeaching());

        student.setStudentName("Tharuka");
        student.setDegreeName("BSc(Hons)Engineering Technology");
        student.setCourseFollowing("Special");

        System.out.println();
        System.out.println(student.getStudentName());
        System.out.println(student.getDegreeName());
        System.out.println(student.getCourseFollowing());




    }
}