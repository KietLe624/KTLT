package Lab4;

public class Factory extends Company2 {
    public String idFactory;
    public int numberofWorkers;
    public double revenue;

    public Factory () {
    }

    public Factory (String id, String name, double asset, String idFactory, int numberofWorkers, double revenue) {
        super(id, name, asset);
        this.idFactory = idFactory;
        this.numberofWorkers = numberofWorkers;
        this.revenue = revenue;
    }

    public void Show () {
        super.Show();
        System.out.println("Id Factory: " + this.idFactory);
        System.out.println("Number of workers: " + this.numberofWorkers);
        System.out.println("Revenue: " + this.revenue);
    }
}