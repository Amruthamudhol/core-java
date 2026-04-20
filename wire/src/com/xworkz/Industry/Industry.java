package com.xworkz.Industry;

public class Industry {

    String name;
    String type;
    int workers;

    public Industry(String name, String type, int workers) {
        this.name = name;
        this.type = type;
        this.workers = workers;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Industry) {

            Industry right = (Industry) obj;

            if(this.name == right.name &&
                    this.type == right.type &&
                    this.workers == right.workers)
            {

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
        return "Industry{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", workers=" + workers +
                '}';
    }
}
