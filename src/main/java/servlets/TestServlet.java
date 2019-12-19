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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, NumberFormatException {
        String value = req.getParameter("value");
        PrintWriter writer = resp.getWriter();
        if (value == null || value.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
            System.out.println(0);
        } else {
            writer.println(Integer.parseInt(value) * 2);
            resp.setStatus(HttpServletResponse.SC_OK);
        }

        }

    }