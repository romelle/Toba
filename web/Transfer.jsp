
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
             
<div class="main-container">
        <div class="container-form">
            
            <form action="TranactionServlet" method="post">
                <p>Transfer Funds</p>
                <p>${savings}</p>
                <input type="text" name="amtSavings"> 
                <p>${checking}</p>
                <input type="text" name="amtChecking"> 
                <input type="submit" name="submit">
          
            </form>  
            
            
            
        </div>
            
        </div>
 <c:import url="footer.jsp" />