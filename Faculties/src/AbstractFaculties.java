interface Faculty{
    String getFaculty();
}

class EngineeringFaculty implements Faculty{
    @Override
    public String getFaculty(){
        return "Engineering Faculty";
    }
}
class MathematicsFaculty implements Faculty{
    @Override
    public String getFaculty() {
        return "Mathematics Faculty";
    }
}
class ScienceFaculty implements Faculty{
    @Override
    public String getFaculty() {
        return "Science Faculty";
    }
}
class BusinessFaculty implements Faculty{
    @Override
    public String getFaculty() {
        return "Business Faculty";
    }
}
class MedicineFaculty implements Faculty{
    @Override
    public String getFaculty() {
        return "Medicine Faculty";
    }
}

//Interface of Abstract Factory
interface FacultyFactory{
    Faculty createFaculty();
}

//Implementation of the abstract factory
class EngineeringFactory implements FacultyFactory{
    @Override
    public Faculty createFaculty() {
        return new EngineeringFaculty();
    }
}
class MathematicsFactory implements FacultyFactory{
    @Override
    public Faculty createFaculty() {
        return new MathematicsFaculty();
    }
}
class ScienceFactory implements FacultyFactory{
    @Override
    public Faculty createFaculty() {
        return new ScienceFaculty();
    }
}
class BusinessFactory implements FacultyFactory{
    @Override
    public Faculty createFaculty() {
        return new BusinessFaculty();
    }
}
class MedicineFactory implements FacultyFactory{
    @Override
    public Faculty createFaculty() {
        return new MedicineFaculty();
    }
}



