package eu.infoshare.pl.adapter;

// przez dziedziczenia

public class AddressInheritageAdapter extends  Adres {


    public Integer getId(){
        return  getId();
    }

    public String getCity(){
        return  getMiasto();
    }

    public String getPostlCode(){
        return  getKod();
    }

    public String getLocal(){
        return  getLokal();
    }

}
