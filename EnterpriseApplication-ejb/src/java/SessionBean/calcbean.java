/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author Michael
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return (a+b);
    }

    @Override
    public Integer resta(int a, int b) {
        return (a-b);
    }

    @Override
    public Integer multiplicacion(int a, int b) {
        return (a*b);
    }

    @Override
    public Integer division(int a, int b) {
        return (a/b);
    }
    
    
}
