package eu.infoshare.pl;

import eu.infoshare.pl.builder.Sample;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    private void test(){

        Address address= new Address.Builder()
                .id(0)
                .city("Lublin")
                .postalCode("20-000")
                .local("1")
                .build();

        Sample.builder().id(1).city("Lublin").postalCode("1111").local("111").build();

    }


}