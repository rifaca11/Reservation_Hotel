package com.example.hotelkharbouchaa.Routes;
import com.example.hotelkharbouchaa.Manager.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RoutesServlet", urlPatterns = "/")
public class RoutesServlet extends HttpServlet {
    private ManagerService managerService = new ManagerService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        String path = req.getServletPath();

        switch(path)
        {
            case "/":
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("pg.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "/rooms":
                RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("./src/User/roomAndSuites.jsp");
                requestDispatcher1.forward(req,resp);
                break;
            case "/client" :
                try {
                    managerService.listClients(req,resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
        }

    }
    

}
