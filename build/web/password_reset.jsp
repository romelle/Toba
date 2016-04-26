
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
<div class="main-container">       
<h1>Password Reset</h1>
        <p>${message}</p>
        <form action="password_reset" method="post">
        <input type="text" name="username" />
        <input type="text" name="newPassword"/>
        <input type ="submit" name="submit"/>
        </form>
        
</div>
   <c:import url="footer.jsp" />         
  