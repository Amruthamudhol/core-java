package com.xworkz.map.dto;

import lombok.*;


@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class AuthorDTO {

    private int authorId;
    private String authorName;
    private String country;

}
