/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

/**
 *
 * @author Usuario
 */
public class MesException extends Exception {

    /**
     * Creates a new instance of <code>MesException</code> without detail
     * message.
     */
    public MesException() {
    }

    /**
     * Constructs an instance of <code>MesException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MesException(String msg) {
        super(msg);
    }
}
