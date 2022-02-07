package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/signup")
public class SignupServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		// 이메일
		String a = req.getParameter("email");
		// 성별
		String b = req.getParameter("gender");
		// 취미
		String[] c = req.getParameterValues("hobby");
		// 직업
		String d = req.getParameter("job");
		// 점심
		String e = req.getParameter("lunch");
		// 하고 싶은 말
		String f = req.getParameter("comment");
		
		System.out.println("email : " + a);
		System.out.println("성별 : " + b);
		for(int i=0; i<c.length; i++) {
			System.out.println("취미: " + c[i]);
		}
		System.out.println("직업 : " + d);
		System.out.println("점심 메뉴 : " + e);
		System.out.println("하고 싶은말 : " + f);
		

		//응답 인코딩 설정
		resp.setCharacterEncoding("utf-8");
		//응답 컨텐트 type 설정(웹브라우저에게 html 형식의 문자열을 응답할 예정이라고 알리고)
		resp.setContentType("text/html; charset=utf-8");
		//html 형식의 문자열 응답하기
		PrintWriter pw = resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title></title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>가입되었습니다.</p>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
