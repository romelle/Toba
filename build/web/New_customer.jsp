
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />

<div class="main-container">
        <div class="container-form">
            <h2>Create Your Account</h2>
            <p class="warning bottom-margin1">${message}</p>
           
            <form action="NewCustomerServlet" method="post">
                
                <input type="text" name="firstName" placeholder="FirstName"> 
                <input type="text" name="lastName" placeholder="LastName"> 
                <input type="text" name="phone" placeholder="Phone"> 
                <input type="text" name="address" placeholder="Address"> 
                <input type="text" name="city" placeholder="City"> 
                <input type="text" name="state" placeholder="State"> 
                <input type="text" name="zipcode" placeholder="Zipcode"> 
                <input type="text" name="email" placeholder="Email"> 
                <input type="submit" name="submit">
          
            </form>  
        </div>
        </div>
 <c:import url="footer.jsp" />