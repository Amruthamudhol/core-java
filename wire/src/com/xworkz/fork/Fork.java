package com.xworkz.fork;

public class Fork {

        String material;
        String type;
        int prongs;

        public Fork(String material, String type, int prongs) {
            this.material = material;
            this.type = type;
            this.prongs = prongs;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Fork) {

                Fork right = (Fork) obj;

                if (this.material == right.material &&
                        this.type == right.type &&
                        this.prongs == right.prongs) {

                    return true;

                } else {

                    return false;
                }

            } else {

                return false;
            }
        }

        @Override
        public String toString() {
            return "Fork{" +
                    "material='" + material + '\'' +
                    ", type='" + type + '\'' +
                    ", prongs=" + prongs +
                    '}';
        }
}
