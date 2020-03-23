
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CrudEmp", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CrudEmp {


    /**
     * 
     * @param arg0
     * @return
     *     returns services.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showUser", targetNamespace = "http://service/", className = "services.ShowUser")
    @ResponseWrapper(localName = "showUserResponse", targetNamespace = "http://service/", className = "services.ShowUserResponse")
    @Action(input = "http://service/CrudEmp/showUserRequest", output = "http://service/CrudEmp/showUserResponse")
    public User showUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://service/", className = "services.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://service/", className = "services.UpdateUserResponse")
    @Action(input = "http://service/CrudEmp/updateUserRequest", output = "http://service/CrudEmp/updateUserResponse")
    public String updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://service/", className = "services.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://service/", className = "services.AddUserResponse")
    @Action(input = "http://service/CrudEmp/addUserRequest", output = "http://service/CrudEmp/addUserResponse")
    public String addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://service/", className = "services.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://service/", className = "services.DeleteUserResponse")
    @Action(input = "http://service/CrudEmp/deleteUserRequest", output = "http://service/CrudEmp/deleteUserResponse")
    public String deleteUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

}
