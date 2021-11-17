/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *
 * @author 2dam
 */
public class EmailExistsException extends Exception{
    public EmailExistsException(String mensaje){
        super(mensaje);
    }
}
