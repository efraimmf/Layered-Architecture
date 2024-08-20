package br.com.layeredarchitecture.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TransactionDto {
    @NotBlank(message = "title cannot be empty")
    @Size(min = 2, max = 30)
    private String title;
    private float price;
    private String type;
    private String category;
}
