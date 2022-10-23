package com.example.hotelkharbouchaa.Image;
import java.util.*;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import com.Database.DbConnecting.DbConnecting;

public class ImageRepository {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    //save multiple images
    public void saveAllImagesUsingPart(List<Image> images) throws ClassNotFoundException {
        try {
           
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO image (name) VALUES(?)");
             connection = DbConnecting.getConnection();
            for (Image image : images) {
                preparedStatement.setString(1, image.getName());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

       
   
}
