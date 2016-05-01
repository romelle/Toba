
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
             
<div class="main-container">
        <div class="container-form">
            
            
                <p>Transfer Funds</p>
                
                <p>Savings: $ ${user.getSavingsBalance()}</p>
                <p>Checking: $ ${user.getCheckingBalance()}</p>
                
             <form action="TransactionServlet" method="post">
            <label>Transfer Options:</label>
            <select name="options">
                <option value="1">Savings to Checking</option>
                <option value="2">Checking to Savings</option>
            </select><br>
            <label>Amount:</label>
            <input type="number" min="0" value="0" size="3" name="amount" /><br>
             <input type="number" name="quantity" min="1" value="0" size="4">
            <input type="submit" value="transfer" id="submit">
        </form>
            
            
            
        </div>
            
        </div>
 <c:import url="footer.jsp" />