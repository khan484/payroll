/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author 16476
 */
public class PayrollFactory {
    private static PayrollFactory instance;
    private PayrollFactory(){
        }
    public static PayrollFactory getInstance(){//adds instance into factory
        if (instance ==null){
            instance = new PayrollFactory();}
        return instance;
    }
    //no switch statement because a manager is a type of employee but empoyee is not a type of employee
}
