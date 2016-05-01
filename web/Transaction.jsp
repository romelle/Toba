
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
            
            
  
            
            <div class="main-container top-margin5"><h1> Account Balances </h1>
                
                <p>Savings: $ ${user.getSavingsBalance()}</p>
                <p>Checking: $ ${user.getCheckingBalance()}</p>    
                <p>Total : ${user.getSavingsBalance() + user.getCheckingBalance()}</p>  
            </div>
                   <c:import url="footer.jsp" />