/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author kevout
 */
import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
   private static final long serialVersionUID = 1L;
   private final Date createTime = new Date();
   private final String message = "Que onda que pex";

   public Date getCreateTime() {
      return(createTime);
   }
   
   public String getMessage() {
      return(message);
   }
   
   public String getOtherMessage(){
       return "Este es otro mensaje";
   }
}

