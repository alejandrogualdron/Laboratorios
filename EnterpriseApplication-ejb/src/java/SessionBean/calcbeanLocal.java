/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author Michael
 */
@Local
public interface calcbeanLocal {

    Integer suma(int a, int b);

    Integer resta(int a, int b);

    Integer multiplicacion(int a, int b);

    Integer division(int a, int b);
    
}
