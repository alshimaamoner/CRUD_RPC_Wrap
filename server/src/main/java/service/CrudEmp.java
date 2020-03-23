package service;
import javax.jws.WebService;
import java.util.*;
import javax.jws.*;
import javax.jws.soap.*;
@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public class CrudEmp {
    Dao dao=new Dao();
    @WebMethod
    public User showUser(int id){
        
        return dao.showUsers(id);
            
    }
        @WebMethod
     public String updateUser(User user){
        boolean flag=dao.updateUser(user);
        if(flag){
            return "row add";
        }else{
            return "no row update";
        } 
    }
        @WebMethod
       public String addUser(User user){
        boolean flag=dao.insertUser(user);
        if(flag){
            return "row add";
        }else{
            return "no row added";
        } 
    }
        @WebMethod
      public String deleteUser(User user){
        boolean flag=dao.deleteUser(user);
        if(flag){
            return "row add";
        }else{
            return "no row added";
        } 
    }
}
    

