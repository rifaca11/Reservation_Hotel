package com.example.hotelkharbouchaa.Manager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import com.example.hotelkharbouchaa.Client.Client;
import com.example.hotelkharbouchaa.Client.ClientRepository;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import static java.lang.System.out;

public class ManagerService {
    private ClientRepository clientRepository = new ClientRepository();
     public void showNewRoomPage(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("src/Manager/NewRoom.jsp");
        dispatcher.forward(request, response);
    }
       public void listClients(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
        List < Client > listClients = clientRepository.getAllClients();
        request.setAttribute("listClients", listClients);

        RequestDispatcher dispatcher = request.getRequestDispatcher("src/Manager/ListClient.jsp");
        dispatcher.forward(request, response);
           out.println(Arrays.toString(listClients.toArray()));
    }
}
