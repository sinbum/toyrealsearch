package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemoDAO;
import vo.MemoVO;

@WebServlet("/searchlist")
public class MemoController extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String search=request.getParameter("search");	
	
	if(!search.equals("")) {
	List<MemoVO> list=new MemoDAO().searchlist(search);	
	request.setAttribute("list", list);
	request.getRequestDispatcher("searchlist.jsp").forward(request, response);
	}
	}
}
