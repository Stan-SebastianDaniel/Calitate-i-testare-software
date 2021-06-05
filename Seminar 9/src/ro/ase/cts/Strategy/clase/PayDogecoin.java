package ro.ase.cts.Strategy.clase;

public class PayDogecoin implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A platit cu Dogecoin suma de " + suma + " lei");
    }
}
