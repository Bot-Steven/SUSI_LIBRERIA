/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.message;

import lib.exceptions.EmailFoundException;

/**
 *
 * @author Adrian Franco
 * Esta es la clase en la que le mandamos a Message todas las excepciones
 * en forma de Enumeracion.
 */
public enum Msg {
     
    SIGNUP, SIGNIN, OK, INCORRECTUSEREXCEPTION, INCORRECTPASSWORDEXCEPTION,
    INCORRECTEMAILEXCEPTION, USERDONTEXISTEXCEPTION,USEREXISTEXCEPTION,
    PASSWORDDONTMATCHEXCEPTION, CONNECTEXCEPTION, TOOMANYUSERSEXCEPTION, EMAILFOUNDEXCEPTION;
    
}
