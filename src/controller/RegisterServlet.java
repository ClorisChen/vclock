package controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objects.Employees;

import util.Employee;

import net.sf.json.JSONObject;

public class RegisterServlet extends HttpServlet implements Employees{

	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String etel=request.getParameter("etel");
//		System.out.println("register:"+request.toString());
//		System.out.println("register:"+etel);
//		Employee emp=new Employee();
//		//String eid=emp.login(etel, ephoto);
//		String tip=emp.checkphoNumber(etel);
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("application/json; charset=utf-8");
//		PrintWriter out=null;
//		out=response.getWriter();
//		out.write(tip);
//		out.flush();
//		out.close();
		//**************************************
		String[] elist=new String[emessage.length];
		for(int i=1;i<elist.length;i++){
			elist[i]=request.getParameter(emessage[i]);
		}
		Employee emp=new Employee();
		String tip="";
		try {
			tip = emp.register(elist[1], elist[2], elist[3], elist[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out=null;
		out=response.getWriter();
		out.write(tip);
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
