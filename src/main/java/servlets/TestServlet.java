package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/mult")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("value");
        PrintWriter writer = resp.getWriter();
        try {
            writer.println(Integer.parseInt(value) * 2);
            resp.setStatus(200);
        } catch (NumberFormatException ex){
            resp.setStatus(400);
        }

    }
}