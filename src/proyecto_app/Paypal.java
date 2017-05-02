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
public class Paypal {
private double Mastercard;
private double Visa;
private double Bancolombia;
private double Bbva;
public void setMastercard (double Mastercardparametro){
    this.Mastercard=Mastercardparametro;
}
  public double getMastercard()
  {
      return this.Mastercard;
      
  }
  
  
  public void setVisa(double Visaparametro){
    this.Visa=Visaparametro;
}
  public double getVisa()
  {
      return this.Visa;
      
  }
  
  public void setBancolombia(double Bancolombiaparametro){
    this.Bancolombia=Bancolombiaparametro;
}
  public double getBancolombia()
  {
      return this.Bancolombia;
      
  }
  
  
  public void setBbva(double Bbvaparametro){
    this.Bbva=Bbvaparametro;
}
  public double getBbva()
  {
      return this.Bbva;
      
  }
  
   
  public void Pagar(){
      System.out.println(Visa+"Esta pagando");
      
  }
  
  
  public void Descontar(){
      System.out.println(Bancolombia+"Esta haciendo un descuento");
      
  }      
}
