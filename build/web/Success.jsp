
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="header.html" />
        
        <div class="main-container text-center">
            <span class="created-user-info">
                <p><b>Firstname:</b> ${user.firstName}</p>
                <p><b>Lastname:</b> ${user.lastName}</p>  
                <p><b>Phone:</b> ${user.phone}</p>
                <p><b>Address:</b> ${user.address}</p>
                <p><b>City:</b> ${user.city}</p>
                <p><b>State:</b> ${user.state}</p>
                <p><b>Zip:</b> ${user.zipcode}</p>
                <p><b>Email:</b> ${user.email}</p>
                <p><b>Username:</b> ${user.username}</p>
                <p><b>Password:</b> ${user.password}</p>
            </span>
        </div>
            
   <c:import url="footer.jsp" />