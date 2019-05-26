package eu.infoshare.pl.decorator;

import eu.infoshare.pl.adapter.AddressInheritageAdapter;

public class AddressInheritageDecorator extends Address {

    public AddressInheritageDecorator(Integer id, String city, String postalCode, String local, String street) {
        super(id, city, postalCode, local, street);
    }

    @Override
    public String getStreet() {
        return String.format("ul. %S", super.getStreet());
    }

    private String getCityUpperCase() {
        String city = getCity();
        return city != null ? city.toUpperCase() : null;
    }
}

