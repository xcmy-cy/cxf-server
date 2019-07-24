package com.xcmy.cxfserver.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//这是一个服务接口
@WebService//这里不能指定名称和命名空间等属性
public interface UserService {

    @WebMethod//标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
    public String getUser(@WebParam(name = "userId") String userId);

    @WebMethod
    public String getUserName(@WebParam(name = "userId") String userId);
}
