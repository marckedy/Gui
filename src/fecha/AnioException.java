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
public class AnioException extends Exception {

    /**
     * Creates a new instance of <code>AnioException</code> without detail
     * message.
     */
    public AnioException() {
    }

    /**
     * Constructs an instance of <code>AnioException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AnioException(String msg) {
        super(msg);
    }
}
