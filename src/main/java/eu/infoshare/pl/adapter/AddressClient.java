package eu.infoshare.pl.adapter;

public class AddressClient {

    public void main(Adres address) {

        // przez kompozycję
        AddressAdapter addressAdapter = new AddressAdapter(address);
        addressAdapter.getCity();


        //przez dziedziczenia
        AddressInheritageAdapter addressInheritageAdapter = new AddressInheritageAdapter();
    }
}
