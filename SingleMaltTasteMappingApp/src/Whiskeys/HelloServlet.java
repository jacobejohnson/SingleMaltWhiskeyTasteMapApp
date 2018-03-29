//Jacob Johnson
//jejohnson8@dmacc.edu or jacob.johnson365@gmail.com
//March 2018
/*This program utilizes Maven, Servlets, JSP, and TomCat to provide a user with a background in 
single malt whiskey flavors, then prompts the user to specify which flavors sound more
appealing.  The program takes those answers into account in the form strings then parses
them to integers 0-3, where they are inserted into an array of an array as what are 
essentially the row and column locations of a two dimensional array.  Strings of whiskeys
that match the location of user input (flavor1 and flavor2) are stored in the arrays and
then output to the user as a suggestion for purchase.  The whiskey flavor information list
of whiskeys were borrowed from http://drinkwire.liquor.com/post/single-malt-whisky-guide-infographic#gs.84arC7k.
All credit goes to the original author Alexander A. Woldehanna (aka Intoxicology). I 
learned a lot from this information and hope the user will also. */


package Whiskeys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// gets user input from index.jsp
		String flavor1 = request.getParameter("flavor1");
		String flavor2 = request.getParameter("flavor2");
		
		//parse string into int for purpose of searching array
		int result1 = Integer.parseInt(flavor1);
		int result2 = Integer.parseInt(flavor2);
		
		//establish array of possible whiskey suggestions based on flavor map
		String whiskeyArray[][] = {{"Knockando 12 Yr Old", "Royal Lochnagar 12 Yr Old", "Laphroaig 10 Yr Old", "Ardbeg 10 Yr Old"},
				   {"Glenfiddich 12 Yr Old", "Glen Elgin 12 Yr Old", "Oban 14 Yr Old", "Caol Ila 12 Yr Old"},
				   {"Bunnahabhain 12 Yr Old", "GlenMorangie Original 10 Yr Old", "Cragganmore 12 Yr Old", "Lagavulin 16 Yr Old"},
				   {"Glenlivet 18 Yr Old", "Balvenie Double Wood 12 Yr Old0", "Cragganmore Distillers Edition", "Lagavulin Distillers Edition"}};
		
		//write out on new page results of the whiskey mapping selection process
		PrintWriter writer = response.getWriter();
		writer.println("Based on your taste preferences " + whiskeyArray[result1][result2] + " would be the ideal single malt for you!"
				+ " Pick up a bottle and enjoy!");
		writer.close(); 
	}

}
