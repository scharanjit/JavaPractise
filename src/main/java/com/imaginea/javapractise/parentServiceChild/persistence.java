/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parentServiceChild;

import org.hibernate.HibernateException;

/**
 *
 * @author charanjit.singh
 */
public class persistence {
    
    public void save() throws  customJava{
    
        try{
//            int i=1/0;
        
            throw new HibernateException("gg");
        }catch(HibernateException e){
        custometMethod(e);
        }
    }

    private void custometMethod(HibernateException e) throws  customJava {
try{
throw e;
}catch(HibernateException e1){

    throw new customJava();
}
        
    }
    
}
