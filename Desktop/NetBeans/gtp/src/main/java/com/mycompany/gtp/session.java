package com.mycompany.gtp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Seba Garcia
 */
public class session
{
    private Session sesion;
    private Transaction tx;

    public Session getSesion()
    {
        return sesion;
    }

    public Transaction getTx()
    {
        return tx;
    }

    public void iniciaOperacion() throws HibernateException
    {
        System.out.println("Comenzando con Hibernate");
        sesion = NewHibernateUtil.getSessionFactory().openSession(); //iniciamos una sesion hibernate
        tx = sesion.beginTransaction(); // comienza la transaccion
    }

    public void finalizaOperacion() throws HibernateException
    {
        System.out.println("Finalizando con Hibernate");
        tx.commit();
        sesion.close();
    }

    public void manejaExcepcion(HibernateException he) throws HibernateException
    {
        tx.rollback();
        System.out.println("Ocurrió un error en la capa de acceso a datos " + he.getMessage());
        System.exit(0);
    }
    
    public void cerrarSesion()
    {
        NewHibernateUtil.getSessionFactory().close();
    }
}
