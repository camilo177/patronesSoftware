// Declaración de Interfaces
interface Motor{
    String encender();
}
interface Automovil{
    String conducir();
}

//Clases que implementan interfaz Motor
class MotorGasolina implements Motor{
    @Override
    public String encender() {
        return "Encendiendo motor a Gasolina";
    }
}

class MotorElectrico implements Motor{
    @Override
    public String encender() {
        return "Encendiendo motor Eléctrico";
    }
}

//Clases que implementan interfaz Automovil
class Mazda implements Automovil{
    @Override
    public String conducir() {
        return "Conduciendo un carro Mazda";
    }
}

class Toyota implements Automovil{
    @Override
    public String conducir() {
        return "Conduciendo un carro Toyota";
    }
}

//Interfaz AbstractFactory
interface FabricaAutomoviles{
    Motor crearMotor();
    Automovil crearAutomovil();
}

//Implementación de Fabricas Gasolina y Eléctrica con FabricaAutomoviles
class FabricaGasolina implements FabricaAutomoviles{
    public FabricaGasolina() {
        super();
    }

    @Override
    public Motor crearMotor() {
        return new MotorGasolina();
    }
    @Override
    public Automovil crearAutomovil() {
        return new Mazda(); //Diagrama solicita crear Mazda en instancia
    }
}

class FabricaElectrica implements FabricaAutomoviles{
    public FabricaElectrica() {
        super();
    }

    @Override
    public Motor crearMotor() {
        return new MotorElectrico();
    }

    @Override
    public Automovil crearAutomovil() {
        return new Toyota(); //Diagrama solicita crear Toyota en instancia
    }
}



