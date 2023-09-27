public class Main {
    public static void main(String[] args) {
        //Create Engineering Faculty
        FacultyFactory engineeringFactory = new EngineeringFactory();
        Faculty engineeringFaculty = engineeringFactory.createFaculty();

        System.out.println("It is the " + engineeringFaculty.getFaculty());

        //Create Medicine Faculty
        FacultyFactory medicineFactory = new MedicineFactory();
        Faculty medicineFaculty = medicineFactory.createFaculty();

        System.out.println("It is the " + medicineFaculty.getFaculty());

        //Create Math Faculty
        FacultyFactory mathematicsFactory = new MathematicsFactory();
        Faculty mathematicsFaculty = mathematicsFactory.createFaculty();

        System.out.println("It is the " + mathematicsFaculty.getFaculty());

        //Create Business Faculty
        FacultyFactory businessFactory = new BusinessFactory();
        Faculty businessFaculty = businessFactory.createFaculty();

        System.out.println("This is the " + businessFaculty.getFaculty());

        //Create Science Faculty
        FacultyFactory scienceFactory = new ScienceFactory();
        Faculty scienceFaculty = scienceFactory.createFaculty();

        System.out.println("This is the " + scienceFaculty.getFaculty());

    }
}
