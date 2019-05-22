package com.mycompany.gtp;

import org.hibernate.HibernateException;

/**
 *
 * @author Seba Garcia
 */
public class conexion extends session
{    
    public boolean login(String user, String pass) 
    {
        try 
        {
            iniciaOperacion();

            Usuario usuario = (Usuario) getSesion().get(Usuario.class, 1);
            String clave = usuario.getClave();
            if(clave.equals(pass))
                return true;
            else
                return false;
        } 
        catch (HibernateException he) 
        {
            manejaExcepcion(he);
            throw he;
        } 
        finally 
        {
            finalizaOperacion();
        }
    }
}
