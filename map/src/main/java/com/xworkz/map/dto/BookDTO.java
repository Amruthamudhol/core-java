package com.xworkz.map.dto;


import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode

public class BookDTO {
    private int bookId;
    private String title;
    private double price;

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(!(obj instanceof BookDTO)) return false;

        BookDTO dto=(BookDTO)obj;
        return this.bookId==dto.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}
