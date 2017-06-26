package com.example.labuser.myprojectexams;

/**
 * Created by labuser on 26/06/2017.
 */

public class Shop {



        private String legalName;
        private String address;
        private String alternateName;

        public Shop(String legalName, String alternativeName,String address) {

            this.legalName = legalName;
            this.alternateName = alternativeName;
            this.address = address;

        }

        public String getAddress() {
            return address;
        }

        public String getLegalName() {
            return legalName;
        }

        public String getAlternateName() {
            return alternateName;
        }
    }


