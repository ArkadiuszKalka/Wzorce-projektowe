package eu.infoshare.pl.adapter;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;


// Przez ompozycję
@AllArgsConstructor
public class AddressAdapter {

    @Delegate(excludes = AdapterExcluded.class)
    private final Adres adres;

    public int getId() {
        return adres.getId();
    }

    public String getCity() {
        return adres.getMiasto();
    }

    public String getPostlCode() {
        return adres.getKod();
    }

    public String getLocal() {
        return adres.getLokal();
    }


}
