package ro.ase.cts.AdapteObiecte.clase;

public class AdapterLeasing implements Creditable{
    private Leasing leasing;

    public AdapterLeasing(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void creditare() {
        leasing.OferaLeasing();
    }
}
