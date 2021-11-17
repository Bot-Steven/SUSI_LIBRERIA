/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *Excepcion si el correo ya esta registrado
 * @author Irkus de la Fuente
 */
public class EmailExistException extends Exception{
    public EmailExistException(String mensaje) {
        super(mensaje);
    }
}
