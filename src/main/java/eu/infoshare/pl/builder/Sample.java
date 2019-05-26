package eu.infoshare.pl.builder;

import eu.infoshare.pl.Address;
import lombok.Builder;
import lombok.experimental.Delegate;

@Builder
public class Sample {

    private int id;
    private String city;
    private String postalCode;
    private String local;

    @Delegate
    private Address address;
}
