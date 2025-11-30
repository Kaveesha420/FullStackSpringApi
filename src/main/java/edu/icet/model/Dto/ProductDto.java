package edu.icet.model.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {
    private String id;
    private String name;
    private String description;
    private String qty;
    private String unitPrice;
}
