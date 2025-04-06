package com.yourbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer, Accounts, Cards and Loans information"
)
public class CustomerDetailsDto {
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min=3, max = 30,message = "The length of the customer name should be between 3 and 30")
    @Schema(
            description = "Name of the customer", example = "ABC XYZ"
    )
    private String name;
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    @Schema(
            description = "Email address of the customer", example = "abc@gmail.com"
    )
    private String email;
    @NotEmpty()
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    private String mobileNumber;
    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
    @Schema(
            description = "Card details of the Customer"
    )
    private CardsDto cardsDto;
    @Schema(
            description = "Loan details of the Customer"
    )
    private LoansDto loansDto;
}
