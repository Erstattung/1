//package main.Servlets;
//
//import main.DAO.Implementation.ClientDAOImpl;
//import main.PO.ClientPO;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class ContactController extends HttpServlet {
//
//    private ClientDAOImpl clientDAO = new ClientDAOImpl();
//
//    @Override
//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        clientDAO.remove(ClientPO.class.(req.getParameter("id"));
//        this.doGet(req, resp);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Contact> contactList = contactDao.findAll();
//        req.setAttribute("contactList", contactList);
//        req.getRequestDispatcher("view/contact.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        Contact newContact = new Contact();
//        newContact.setLastName(req.getParameter("lastName"));
//        newContact.setFirstName(req.getParameter("firstName"));
//        newContact.setPhone(req.getParameter("phone"));
//
//        this.contactDao.add(newContact);
//
//        this.doGet(req, resp);
//    }
//
//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        Contact newContact = new Contact();
//        newContact.setId(Long.valueOf(req.getParameter("id")));
//        newContact.setLastName(req.getParameter("lastName"));
//        newContact.setFirstName(req.getParameter("firstName"));
//        newContact.setPhone(req.getParameter("phone"));
//
//        this.contactDao.update(newContact);
//
//        super.doPut(req, resp);
//    }
//}