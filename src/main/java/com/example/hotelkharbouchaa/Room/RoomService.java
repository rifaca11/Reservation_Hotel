package com.example.hotelkharbouchaa.Room;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RoomService {
    private RoomRepository roomRepository = new RoomRepository();
    public void getAllRoomsByType(int idType, ServletRequest req, ServletResponse resp) {
        List<Room> rooms = roomRepository.getRoomByType(idType);
        req.setAttribute("roomType", rooms);
        RequestDispatcher dispatcher = req.getRequestDispatcher("roomType.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
   


    
}
