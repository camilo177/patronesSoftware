//1.Implement interface Product --> Exchange
interface Exchange {
    void currencyExchange(int amount); //Receives amount in USD
}

//2.Implement concrete classes (Concrete Products) --> In this case MXN and COP
class MXN implements Exchange {
    @Override
    public void currencyExchange(int amount){
        double converted = 17.47 * amount;
        System.out.println(amount + " USD to MXN is: " + converted);
    }
}

class COP implements Exchange{
    @Override
    public void currencyExchange(int amount){
        double converted = 4070.17  * amount;
        System.out.println(amount + " USD to COP is: " + converted);
    }
}

//3.Define the abstract Class
abstract class ExchangeCreator{
    public abstract Exchange createExchange();
}

//4. Implements concrete subclasses of "Exchange Creator"
class MXNCreator extends ExchangeCreator{
    @Override
    public Exchange createExchange(){
        return new MXN();
    }
}

class COPCreator extends ExchangeCreator{
    @Override
    public Exchange createExchange(){
        return new COP();
    }
}

//Main
public class Main {
    public static void main(String[] args) {
        //Client decides which type of Exchange to use
        ExchangeCreator creator = new MXNCreator();

        //The app creates an Exchange without knowing the concrete class
        Exchange moneyMXN = creator.createExchange();

        //The client uses the Exchange
        moneyMXN.currencyExchange(100);

        //Client decides which type of Exchange to use
        ExchangeCreator creatorTwo = new COPCreator();

        //The app creates an Exchange without knowing the concrete class
        Exchange moneyCOP = creatorTwo.createExchange();

        //The client uses the Exchange
        moneyCOP.currencyExchange(100);
    }
}
