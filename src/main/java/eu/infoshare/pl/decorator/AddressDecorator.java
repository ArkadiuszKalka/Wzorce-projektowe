package eu.infoshare.pl.decorator;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;

@AllArgsConstructor
public class AddressDecorator {

    @Delegate(excludes = AddressDecoratorExclude.class)
    private final Address address;

    private String getStreet() {
        return String.format("ul. %s", address.getStreet());
    }

    private String getCityUperrcase() {
        String city = address.getCity();
        return city != null ? city.toUpperCase() : null;
    }
}
