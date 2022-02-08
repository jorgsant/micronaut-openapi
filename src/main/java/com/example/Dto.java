package com.example;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Schema(
        description =
                "Data Transfer Object")
public class Dto {
    @Schema(
            description =
                    "Description set through @Schema annotation. Causes attribute not being marked as required",
            maxLength = 8,
            example = "526630")
    @NotNull
    @PositiveOrZero
    @Max(value = 99999999)
    Integer id;

    /**
     * Description set through Javadoc. Everything is correct but adding examples is not possible.
     */
    @NotNull
    @PositiveOrZero
    @Max(value = 99999999)
    Integer idJavadoc;

    public Integer getId() {
        return id;
    }

    public Integer getIdJavadoc() {
        return idJavadoc;
    }
}
