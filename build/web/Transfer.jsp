
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
             
<div class="main-container">
        <div class="container-form">
            
            
                <p>Transfer Funds</p>
                <p>Savings: $ ${savings.balance}</p>
                
                <p>Checking: $ ${checking.balance}</p>
                
          
             <form action="TransactionServlet" method="post">
            <label>Transfer Direction:</label>
            <select name="direction">
                <option>Savings to Checking</option>
                <option>Checking to Savings</option>
            </select><br>
            <label>Amount:</label>
            <input type="number" name="amount" value="0"><br>
            <input type="submit" value="Transfer Funds" id="submit">
        </form>
            
            
            
        </div>
            
        </div>
 <c:import url="footer.jsp" />