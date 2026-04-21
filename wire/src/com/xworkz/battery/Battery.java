package com.xworkz.battery;
    public class Battery {
        String brand;
        String type;
        double voltage;

        public Battery(String brand, String type, double voltage) {
            this.brand = brand;
            this.type = type;
            this.voltage = voltage;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Battery) {

                Battery right = (Battery) obj;

                if (this.brand == right.brand && this.type == right.type &&
                        this.voltage == right.voltage)
                {

                    return true;

                } else {

                    return false;
                }

            } else {

                return false;
            }
        }
}
