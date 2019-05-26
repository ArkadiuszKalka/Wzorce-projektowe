package eu.infoshare.pl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Address {

    private final int id;
    private final String city;
    private final String postalCode;
    private final String local;

/* LOMBOK
    private Address(int id, String city, String postalCode, String local) {
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
        this.local = local;
    }
*/

    public static class Builder {

        private Integer id;
        private String city;
        private String postalCode;
        private String local;


        public Address.Builder id(int id) {
            this.id = id;
            return this;
        }

        public Address.Builder city(String city) {
            this.city = city;
            return this;
        }

        public Address.Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address.Builder local(String local) {
            this.local = local;
            return this;
        }

        public Address build() {

            if (id != null && city != null && postalCode != null && local != null) {
                return new Address(id, city, postalCode, local);
            }
//            return null;
            throw new IllegalArgumentException("nule");
        }


    }
}
