
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
  
<div class="main-container">
       <c:if test="${sessionScope.user != null}">
           <br><br><br>
           <p>Welcome Back,  <i> ${user.firstName} ${user.lastName}</i> </p>
        
       </c:if>
        
        <c:if test="${sessionScope.user== null}">
      
            <p>Not Logged In</p>
            
           
        </c:if>
      
      </div>     

<c:import url="footer.jsp" />