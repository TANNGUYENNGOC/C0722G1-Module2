package ss12_java_collection_framework.excirse1.model;

public class Phone extends Product{
    private String name;
    private String coler;
    private String production;

    public Phone(String iD, double monney, String name, String coler, String production) {
        super(iD, monney);
        this.name = name;
        this.coler = coler;
        this.production = production;
    }
    public Phone(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "ID: "+getiD()+", NamePhone: "+name+", Monney: "+getMonney()+", Color: "+coler+", production: "+production+"\n";
    }
}
