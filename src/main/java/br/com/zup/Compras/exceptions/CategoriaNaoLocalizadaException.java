package br.com.zup.Compras.exceptions;

public class CategoriaNaoLocalizadaException extends RuntimeException{
    public CategoriaNaoLocalizadaException(String message) {
        super(message);
    }
}
