/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.toba.bll.Account;
import com.toba.bll.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Romelle
 */
public class NewCustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewCustomerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String url ="";
        String message ="";
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipcode");
        String email = request.getParameter("email");
                    
        
        
        
        if(firstName == null || firstName.isEmpty() || 
                lastName == null || lastName.isEmpty() ||
                phone == null || phone.isEmpty() ||
                address == null || address.isEmpty() ||
                city == null || city.isEmpty() ||
                state == null || state.isEmpty() ||
                zipcode == null || zipcode.isEmpty() || 
                email == null || email.isEmpty()){
            
                  message = "Please fill out all boxes";
            url = "/New_customer.jsp";
            
                request.setAttribute("firstName",firstName);
                request.setAttribute("lastName",lastName);
                request.setAttribute("phone",phone);
                request.setAttribute("address",address);
                request.setAttribute("city",city);
                request.setAttribute("state",state);
                request.setAttribute("zipcode",zipcode);
                request.setAttribute("email",email);
            
            
            }
        else{
            String password = request.getParameter("password");
            User user = new User(firstName,lastName,phone,address,city,state,zipcode,email);
            String saltedAndHashedPassword;
            
            
            try {
                saltedAndHashedPassword = PasswordUtil.hashAndSaltPassword(password);                    
            
            } catch (NoSuchAlgorithmException ex) {
                saltedAndHashedPassword = ex.getMessage();
            }
            
            request.setAttribute("saltedAndHashedPassword", saltedAndHashedPassword);
            user.setPassword(saltedAndHashedPassword);
            UserDB.insert(user);
            
        
            
       
            session.setAttribute("user",user);
            
            url ="/Success.jsp";
            
       }
        
            request.setAttribute("message",message);
        getServletContext().getRequestDispatcher(url)
                    .forward(request, response);   
       
    
     
        
        
    }    
              
                
           
    
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
