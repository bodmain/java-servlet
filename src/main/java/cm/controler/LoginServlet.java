package cm.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isValid = loginService.checkLogin(username, password);

        if (isValid) {
            // Đăng nhập thành công
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("index.html"); // Hoặc redirect tới trang chủ có session
        } else {
            // Đăng nhập thất bại
            request.setAttribute("error", "Sai tài khoản hoặc mật khẩu!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
    }

    // Chuyển về login.jsp nếu người dùng truy cập bằng GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }
}
