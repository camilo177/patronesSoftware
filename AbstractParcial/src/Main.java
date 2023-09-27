public class Main{
    public static void main(String[] args) {
        //Crear Carro Gasolina Mazda
        FabricaAutomoviles fabricaGasolina = new FabricaGasolina();
        Motor motorGasolina = fabricaGasolina.crearMotor();
        Automovil automovilGasolina = fabricaGasolina.crearAutomovil();

        //Retorno de métodos
        System.out.println(motorGasolina.encender());
        System.out.println(automovilGasolina.conducir());

        //Crear carro eléctrico Toyota
        FabricaAutomoviles fabricaElectrica = new FabricaElectrica();
        Motor motorElectrico = fabricaElectrica.crearMotor();
        Automovil automovilElectrico = fabricaElectrica.crearAutomovil();

        //Retorno de métodos
        System.out.println(motorElectrico.encender());
        System.out.println(automovilElectrico.conducir());
    }
}
