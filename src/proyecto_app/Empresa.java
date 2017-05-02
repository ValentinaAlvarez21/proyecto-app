/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_app;

/**
 *
 * @author sena
 */
public class Empresa {
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    public void setNit (String nitPara)
    {
    this.nit=nitPara;
    }
    public String getNit() 
    {
     return this.nit;
    }
    
    public void setNombre (String nombrePara) 
    {
    this.nombre=nombrePara;
    }
    public String getNombre()
    {
    return this.nombre;
    }
    
    public void setDireccion (String direccionPara) 
    {
    this.direccion=direccionPara;
    }
    public String getDireccion()
    {
    return this.direccion;
    }
    
    public void setTelefono (String telefonoPara) 
    {
    this.telefono=telefonoPara;
    }
    public String getTelefono()
    {
    return this.telefono;
    }
    
     public void vender()       
    {
    System.out.print(nit+"Esta vendiendo");
    }
     
     public void brindar()       
    {
    System.out.print(nombre+"Esta brindado servicios");
    }
    
}
