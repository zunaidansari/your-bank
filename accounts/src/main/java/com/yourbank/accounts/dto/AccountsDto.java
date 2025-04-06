package com.yourbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    @NotEmpty()
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of Your Bank account", example = "3454433243"
    )
    private Long accountNumber;
    @NotEmpty(message = "Account Type cannot be null or empty")
    @Schema(
            description = "Account type of Your Bank account", example = "Savings"
    )
    private String accountType;
    @NotEmpty(message = "Branch Address cannot be null or empty")
    @Schema(
            description = "Your Bank branch address", example = "123 NewYork"
    )
    private String branchAddress;
}
