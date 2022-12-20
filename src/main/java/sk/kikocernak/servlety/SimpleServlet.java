package sk.kikocernak.servlety;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/simpleservlet", "/daco"})
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html> <html><body>");

        out.println("<h1>Som v SimpleServlet</h1>");

        String meno = req.getParameter("meno");

        out.println("<br>");
        out.printf("meno: %s", meno);
        out.println("<br>");

        String priezvisko = req.getParameter("priezvisko");
        out.printf("priezvisko: %s", priezvisko);
        out.println("<br>");

        out.println("</html></body>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String meno = req.getParameter("meno");
        String priezvisko = req.getParameter("priezvisko");
        String stranka = req.getParameter("stranka");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html> <html><body>");

        out.print("<h1>Som v simple servlet POST</h1>");

        out.printf("meno: %s", meno);
        out.println("<br>");
        out.printf("priezvisko: %s", priezvisko);
        out.println("<br>");
        out.printf("stranka: %s", stranka);
        out.println("<br>");

        String pohlavie = req.getParameter("pohlavie");
        out.printf("pohlavie: %s", pohlavie);
        out.println("<br>");

        //vypise len jednu z troch oznacenych moznosti
//        String stat = req.getParameter("stat");
//        out.printf("stat: %s", stat);
//        out.println("<br>");

        String[] stat = req.getParameterValues("stat");
        for (int i = 0; i<stat.length; i++){
            out.printf("stat: %s", stat[i]);
            out.println("<br>");
        }

        out.println("<body><html>");

//        resp.sendRedirect(String.format("simpleservlet?meno=%s&stranka=%s", meno, stranka));
    }
}
