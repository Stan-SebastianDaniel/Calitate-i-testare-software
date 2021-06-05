package ro.ase.cts.Strategy.clase;

public class PayCash implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A platit cash suma de " + suma + " lei");
    }
}
