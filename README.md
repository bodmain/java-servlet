# Java Servlet Login/Register System

## 📌 Mô tả dự án
Đây là một ứng dụng web cơ bản sử dụng Java Servlet và JSP, cho phép người dùng đăng nhập và đăng ký tài khoản. Dữ liệu người dùng được lưu trữ trong MySQL và thao tác thông qua JDBC.

## 🛠️ Chức năng chính
- ✅ Đăng nhập người dùng (username + password)
- ✅ Đăng ký tài khoản (username, password, email)
- ✅ Kiểm tra thông tin đăng nhập/đăng ký hợp lệ
- ✅ Kết nối MySQL với JDBC
- ✅ Tổ chức code theo mô hình MVC

## 🧪 Công nghệ sử dụng
- Java Servlet, JSP
- MySQL + JDBC
- HTML, CSS
- Apache Tomcat 8.5
- IDE: Eclipse

## 📂 Cấu trúc dự án
cm/
├── controller/
│ ├── LoginServlet.java
│ └── RegisterServlet.java
├── model/
│ └── User.java
├── repository/
│ └── UserRepository.java
├── service/
│ ├── LoginService.java
│ └── RegisterService.java
├── config/
│ └── MysqlConnection.java
└── webapp/
├── login.jsp
├── register.jsp
└── index.html
