package br.com.Tramas3030.stock_control.modules.company.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CompanyEntity {

    private UUID id;

    @NotBlank()
    private String name;

    @NotBlank()
    private String address;

    @Length(min = 5, max = 100, message = "A senha deve conter entre (5) e (100) caracteres")
    private String password;

    @Email(message = "O campo [email] deve conter um email válido")
    private String email;

//    @CreationTimestamp e @UpdateTimestamp
}
