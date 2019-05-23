package com.mycompany.gtp;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author Seba Garcia
 */
public class manejaCuenta extends session
{
    private Cuenta cuenta;
    
    public int crearCuenta(String usu, String clave, String desc)
    {
        int d;
        
        clave = cifrarClave(clave);
        System.out.println("Clave cifrada: " + clave);
        
        try 
        {
            iniciaOperacion();
            
            Query query = getSesion().createSQLQuery("INSERT INTO CUENTA (id_usu, usuario, clave, descripcion) VALUES (:v1, :v2, :v3, :v4)");
            query.setParameter("v1", 1);
            query.setParameter("v2", usu);
            query.setParameter("v3", clave);
            query.setParameter("v4", desc);
            d = query.executeUpdate();
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
        return d;
    }

    public List<Cuenta> getCuentas()
    {
        List<Cuenta> lista = new ArrayList<>();
        try 
        {
            iniciaOperacion();

            lista = getSesion().createQuery("from Cuenta").list();
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

        return lista;
    }
        
    public String cifrarClave(String clave)
    {
        String cifrado;
        char tabla[] = clave.toCharArray();
        
        for(int i = 0; i < tabla.length; i++)
            tabla[i] = (char) (tabla[i] + (char) 7);
        
        cifrado = String.valueOf(tabla);
        
        return cifrado;
    }
    
    
    public String descifrarClave(String cifrado)
    {
        String descifrado;
        char tabla[]= cifrado.toCharArray();
        
        for(int i = 0; i < tabla.length; i++)
            tabla[i] = (char) (tabla[i] - (char) 7);
        
        descifrado = String.valueOf(tabla);
        
        return descifrado;
    }
    
}