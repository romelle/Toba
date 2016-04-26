
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
             
<div class="main-container">
        <div class="container-form">
            
            <form action="LoginServlet" method="post">
                
                <input type="text" name="username" placeholder="Username"> 
                <input type="text" name="password" placeholder="Password"> 
                <input type="submit" name="submit">
          
            </form>  
            
            <p><a href="New_customer.jsp">New Customer</a></p>
             <p><a href="password_reset.jsp">Reset Password</a></p>
            
        </div>
            
        </div>
 <c:import url="footer.jsp" />