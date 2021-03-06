import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;





import org.apache.poi.hssf.usermodel.HSSFWorkbook;





@WebServlet("/userTableSpreadsheet")
public class ReportsServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {

        // create the workbook, its worksheet, and its title row
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("User table");
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("The User table");
       
        // create the header row
        row = sheet.createRow(2);
        row.createCell(0).setCellValue("USERID");
        row.createCell(1).setCellValue("LASTNAME");
        row.createCell(2).setCellValue("FIRSTNAME");
        row.createCell(3).setCellValue("EMAIL");
        
        try {
            // read database rows
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection connection = pool.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM User ORDER BY USERID";    
            ResultSet results = statement.executeQuery(query);
            
            // create the spreadsheet rows
            int i = 3;
            while (results.next()) {
                row = sheet.createRow(i);
                row.createCell(0).setCellValue(results.getString("USERNAME"));
                row.createCell(1).setCellValue(results.getString("LASTNAME"));
                row.createCell(2).setCellValue(results.getString("FIRSTNAME"));
                row.createCell(3).setCellValue(results.getString("EMAIL"));
                i++;
            }
            results.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            this.log(e.toString());
        }

        // set the response headers
        response.setHeader("content-disposition", 
                "attachment; filename=users.xls");
        response.setHeader("cache-control", "no-cache");

        // get the output stream and send the workbook to the browser
        OutputStream out = response.getOutputStream();
        workbook.write(out);
        out.close();
    }
}