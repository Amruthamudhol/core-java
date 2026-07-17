package com.xworkz.snack.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter

public class SnackDTO implements Serializable, Comparable<SnackDTO>{
    private String name;
    private String flavor;
    private double weight;
    private double price;

    @Override
    public int compareTo(SnackDTO o) {
        int result = Double.compare(this.price, o.price);
        if(result == 0) {
            return this.name.compareTo(o.name);
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        SnackDTO dto = (SnackDTO) obj;

        return Double.compare(weight, dto.weight) == 0 &&
                Double.compare(price, dto.price) == 0 &&
                Objects.equals(name, dto.name) &&
                Objects.equals(flavor, dto.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flavor, weight, price);
    }
}
