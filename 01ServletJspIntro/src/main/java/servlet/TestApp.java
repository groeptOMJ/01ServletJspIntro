package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * First example with a servlet and EL.
 *
 * @author java/Stijn
 *
 */
// Zorg dat onze pojo als servlet herkend wordt.
@WebServlet("/Welkom")
public class TestApp extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Toevoegen van de boodschap aan de request
		request.setAttribute("message", "Hallo " + request.getParameter("naam")
				+ "<br>Welkom bij Ontwerpen met Java<br>mvg<br>je docent.");
		// We sturen de request naar onze resultaat pagina
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/DisplayMSG.jsp");
		dispatcher.forward(request, response);
	}

}
