package com.mycompany.gtp;

import org.hibernate.HibernateException;

/**
 *
 * @author Seba Garcia
 */
public class manejaUsuario extends session
{
    public boolean cambiarClave(String newPass, String reNewPass) 
    {
        if (newPass.equals(reNewPass)) 
        {
            try 
            {
                iniciaOperacion();
                Usuario usuario = (Usuario) getSesion().get(Usuario.class, 1);
                String nom_usu = usuario.getUsuario();
                finalizaOperacion();
                
                iniciaOperacion();
                usuario = new Usuario(1, nom_usu, newPass);
                getSesion().update(usuario);
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
            return true;
        }
        else
            return false;
    }
}
