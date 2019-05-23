package com.mycompany.gtp;
// Generated 22-may-2019 13:21:22 by Hibernate Tools 4.3.1



/**
 * Cuenta generated by hbm2java
 */
public class Cuenta  implements java.io.Serializable 
{
    private int id;
    private int idUsu;
    private String usuario;
    private String clave;
    private String descripcion;

    public Cuenta() 
    {
    }

    public Cuenta(int idUsu, String usuario, String clave, String desc) 
    {
       this.idUsu = idUsu;
       this.usuario = usuario;
       this.clave = clave;
       this.descripcion = desc;
    }
   
    public int getId() 
    {
        return this.id;
    }
    
    public void setId(int id) 
    {
        this.id = id;
    }
    public int getIdUsu() 
    {
        return this.idUsu;
    }
    
    public void setIdUsu(int idUsu) 
    {
        this.idUsu = idUsu;
    }
    public String getUsuario() 
    {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }
    
    public String getClave() 
    {
        return this.clave;
    }
    
    public void setClave(String clave) 
    {
        this.clave = clave;
    }
    
    public String getDescripcion() 
    {
        return this.descripcion;
    }
    
    public void setDescripcion(String descrip) 
    {
        this.descripcion = descrip;
    }
}