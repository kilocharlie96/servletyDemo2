package sk.kikocernak.app.controllers;

import sk.kikocernak.app.model.Film;
import sk.kikocernak.app.model.dto.FilmDto;
import sk.kikocernak.app.services.FilmyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/filmycont")
public class FilmyController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String zaner = req.getParameter("zaner");

        FilmyService filmyService = new FilmyService();
        List<FilmDto> filmy = filmyService.dajZoznamFilmovPodlaZanru(zaner);

        req.setAttribute("filmy", filmy);
        req.setAttribute("zaner", zaner);
        req.setAttribute("film", filmy.get(0));

        req.setAttribute("vek", 15);

        req.getRequestDispatcher("filmy.jsp").forward(req, resp);
    }
}
