/* Created By Sithira Roneth
 * Date :7/18/24
 * Time :13:04
 * Project Name :Serialization_and_Deserialization
 * */
package lk.ijse.serialization_and_deserialization.Controller;

import jakarta.json.Json;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.serialization_and_deserialization.dto.BookDto;

import java.io.IOException;

@WebServlet(value = "/book")
public class BookController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Serializable
        BookDto bookDto = new BookDto("Madolduwa","Martin Wickramasingha","Novel","500");
        Jsonb jsonb = JsonbBuilder.create();
        String book = jsonb.toJson(bookDto);
        resp.getWriter().write(book.toString());
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!req.getContentType().toLowerCase().startsWith("application/json") || req.getContentType() == null){
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

        // De-serializable
        Jsonb jsonb = JsonbBuilder.create();
        BookDto bookDto = jsonb.fromJson(req.getReader(), BookDto.class);
        System.out.println(bookDto);
    }
}
