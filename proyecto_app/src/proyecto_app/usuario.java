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
public class usuario {
    private String Id;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Direccion;
    public void setId (String IdPara)
    {
      this.Id=IdPara;
      }
      public String getId()
      {
      return this.Id;
      }
      public void setNombre (String NombrePara)
    {
      this.Nombre=NombrePara;
      }
      public String getNombre()
      {
      return this.Nombre;
      }
      public void setApellido (String ApellidoPara)
    {
      this.Apellido=ApellidoPara;
      }
      public String getApellido()
      {
      return this.Apellido;
      }
      public void setTelefono (String TelefonoPara)
    {
      this.Telefono=TelefonoPara;
      }
      public String getTelefono()
      {
      return this.Telefono;
      }
      public void setDireccion (String DireccionPara)
    {
      this.Direccion=DireccionPara;
      }
      public String Direccion()
      {
      return this.Direccion;
      }
      
      public void comprar ()
      {
          System.out.print(Id+"esta comprando");
      }
       public void adquirir ()
      {
          System.out.print(Id+"esta adquiriendo servicios");
      }
      
}
