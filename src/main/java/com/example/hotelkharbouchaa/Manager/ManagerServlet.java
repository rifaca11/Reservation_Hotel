package com.example.hotelkharbouchaa.Manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import static java.lang.System.out;

@WebServlet(name = "ManagerServlet", urlPatterns = "/dashboard")


public class ManagerServlet extends HttpServlet {
    
    private ManagerService managerService = new ManagerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("src/Manager/dashboard.jsp");
        requestDispatcher.forward(request,response);
        //dashboard/Clients
        //dashboard/Rooms
        //dashboard/NewRoom
        //dashboard/Reservations

        String path = request.getPathInfo();
        out.println(path);
        if(path != null) {
            String[] pathParts = path.split("/");
            if(pathParts.length == 2) {
                if(pathParts[1].equals("Clients")) {
                    try {
                        managerService.listClients(request, response);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                else if(pathParts[1].equals("NewRoom")) {
                    requestDispatcher = request.getRequestDispatcher("src/Manager/NewRoom.jsp");
                    requestDispatcher.forward(request,response);
            }
               
            }
        }
            
        
        

     
        
            
    //    switch (action) {
    //     //change the url to /new
    //             case "/dashboard":
    //                 RequestDispatcher requestDispatcher = request.getRequestDispatcher("src/Manager/dashboard.jsp");
    //                 requestDispatcher.forward(request,response);
    //                 break;
    //             case "/new":
    //                 managerService.showNewRoomPage(request, response);
    //                 break;
    //             case "/Clients":
    //         try {
    //             managerService.listClients(request, response);
    //         } catch (SQLException e) {
    //             e.printStackTrace();
    //         }
    //                 break;
    //             default:
    //                 managerService.showNewRoomPage(request, response);
    //                 break;
    //         }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                //sign up metode
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                Manager manager = new Manager(username, password);
                ManagerRepository managerRepository = new ManagerRepository();
                managerRepository.newManager(manager);
                //create session
                
                response.sendRedirect("jsp page where the manager will be displayed");
    }
    private void login(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ManagerRepository managerRepository = new ManagerRepository();
        boolean isExist = managerRepository.isExist(username);
        if(isExist) {
            //login methode from manager repository
            Manager manager = managerRepository.login(username, password);
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
           // response.sendRedirect("redirect him to rooms page");
        } else {
           // response.sendRedirect("keep him on login page");
        }
    }
    private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("/admin");
    }

    
}
