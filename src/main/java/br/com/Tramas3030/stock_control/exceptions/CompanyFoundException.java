package br.com.Tramas3030.stock_control.exceptions;

public class CompanyFoundException extends RuntimeException{
    public CompanyFoundException() {
        super("Company already exists");
    }
}