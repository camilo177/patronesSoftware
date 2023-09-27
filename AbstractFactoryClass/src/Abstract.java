//En la interfaz no se tiene logica, se definene métodos y atributos
interface Phone{
    String getModel();
}
interface Computer{
    String getModel();
}

class SamsungPhone implements Phone{
    @Override
    public String getModel(){
        return "Samsung Galaxy";
    }
}
class ApplePhone implements Phone{
    @Override
    public String getModel() {
        return "iPhone";
    }
}

class SamsungComputer implements Computer{
    @Override
    public String getModel() {
        return " Samsung Laptop";
    }
}

class AppleComputer implements Computer{
    @Override
    public String getModel() {
        return "MacBook Pro";
    }
}

//Interface of Abstract Factory
interface DeviceFactory{
    Phone createPhone();
    Computer createComputer();
}

//Implementation of the abstract factory
class SamsungFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Computer createComputer() {
        return new SamsungComputer();
    }
}
class AppleFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }
}



