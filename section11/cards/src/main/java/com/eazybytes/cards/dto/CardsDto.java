package com.eazybytes.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Cards",
description = "Schema to hold Card information")
@Data
public class CardsDto {

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(description = "Mobile Number of Customer", example = "4354437687")
    @NotEmpty(message = "Mobile Number cannot be null or empty")
    private String mobileNumber;

    @Pattern(regexp = "(^$|[0-9]{12})", message = "Card Number must be 12 digits")
    @Schema(description = "Card Number of the customer", example = "100646930341")
    @NotEmpty(message = "Card Number cannot be null or empty")
    private String cardNumber;


    @NotEmpty(message = "Card Type cannot be null or empty")
    @Schema(
            description = "Type of the card", example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(
            description = "Total card limit available against a card", example = "100000"
    )
    private int totalLimit;


    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    @Schema(
            description = "Total amount used by a customer", example = "1000"
    )
    private int amountUsed;

    @Schema(
            description = "Total available amount against a card", example = "90000"
    )
    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    private int availableAmount;
}
