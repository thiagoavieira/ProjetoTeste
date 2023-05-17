package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DadosEmpregado
 */
@WebServlet("/DadosEmpregado")
public class DadosEmpregado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DadosEmpregado() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the logged-in employee data and pass it to the view
        // For now, let's assume we have an Employee object with data
        Employee employee = new Employee();
        employee.setFirstName("Thiago");
        employee.setLastName("Alves");
        employee.setUsername("thiagola");
        employee.setPassword("123");
        employee.setContact("thiago@gmail.com");
        employee.setAddress("Rua X, 123");

        request.setAttribute("employee", employee);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedata.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}
