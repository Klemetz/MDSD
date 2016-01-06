package testCases;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class hej {
	public static void main(String[] args){
		start();
	}
	public static void start(){
		
		System.out.println("SELECT 1 or 2\n1.\tEMPLOYEE\n2.\tGUEST");
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (selected.equals("1")){
        	
        	System.out.println("SELECT 1, 2 or 3\n1.\tMAKE BOOKING\n2.\tCHECK IN\n3.\tCHECK OUT");
        	try {
            	selected = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        	if (selected.equals("1")){
            	empBooking();
            }
            else if (selected.equals("2")){
            	empCheckIn();
            }
            else if (selected.equals("3")){
            	empCheckOut();
            }
            else{
            	System.out.println("Try Again");
            	start();
            }
        	
        }
        else if (selected.equals("2")){
        	System.out.println("SELECT 1, 2 or 3\n1.\tMAKE BOOKING\n2.\tCHECK IN\n3.\tCHECK OUT");
        	try {
            	selected = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        	if (selected.equals("1")){
            	gueBooking();
            }
            else if (selected.equals("2")){
            	System.out.println("Can't check in");
            	start();
            }
            else if (selected.equals("3")){
            	System.out.println("Can't check out");
            	start();
            }
            else{
            	System.out.println("Try Again");
            	start();
            }
        }
        else{
        	System.out.println("Try Again");
        	start();
        }
	}
	public static void empBooking(){
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER EMLPOYEE-ID");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	//check employee-ID
    	//
    	//
    	System.out.println("ENTER EMAIL");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String email = selected;
    	System.out.println("ENTER START DATE");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String startDate = selected;
    	System.out.println("ENTER END DATE");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String endDate = selected;
    	System.out.println("ROOMS AVAILIBLE");
    	//SHOW ROOMS AVAILIBLE FOR THE VISIT
    	//
    	//
    	System.out.println("SELECT ROOMTYPE");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String roomType = selected;
    	System.out.println("SELECT NUMBER OF ROOMS");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String rooms = selected;
    	System.out.println("SELECT EXTRAS");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String extras = selected;
    	System.out.println("SELECT PAYMENT OPTION CARD or INVOICE (c/i)");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String paymentOption = selected;
    	
    	checkBooking("employee", email, startDate, endDate, roomType, rooms, extras, paymentOption);
		
	}
	public static void empCheckIn(){
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER EMLPOYEE-ID");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	//check employee-ID
    	//
    	//
    	System.out.println("ENTER BOOKING-ID");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String bookingID = selected;
    	checkIn(bookingID);
	}
	public static void empCheckOut(){
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER EMLPOYEE-ID");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	//check employee-ID
    	//
    	//
    	System.out.println("ENTER BOOKING-ID");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String bookingID = selected;
    	checkOut(bookingID);
	}
	public static void gueBooking(){
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER EMAIL");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String email = selected;
    	System.out.println("ENTER START DATE");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String startDate = selected;
    	System.out.println("ENTER END DATE");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String endDate = selected;
    	System.out.println("ROOMS AVAILIBLE");
    	//SHOW ROOMS AVAILIBLE FOR THE VISIT
    	//
    	//
    	System.out.println("SELECT ROOMTYPE");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String roomType = selected;
    	System.out.println("SELECT NUMBER OF ROOMS");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String rooms = selected;
    	System.out.println("SELECT EXTRAS");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String extras = selected;
    	System.out.println("SELECT PAYMENT OPTION CARD or INVOICE (c/i)");
    	try {
        	selected = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	String paymentOption = selected;
    	
    	checkBooking("guest", email, startDate, endDate, roomType, rooms, extras, paymentOption);
	}
	
	public static Boolean IsGuest()
	{
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("SELECT 1 or 2\n1.\tEMPLOYEE\n2.\tGUEST");
    	try {
    		while(true){
	        	selected = reader.readLine();
	        	if (selected.contains("1")) {
	        		System.out.println("Hi Guest");
	        		return true;
				}
	        	else if (selected.contains("2")) {
	        		System.out.println("Hi employee");
	        		return false;
				}
    		}
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return null;
	}
	
	
	

	static Pattern emailPattern = Pattern.compile("[a-zA-Z0-9[!#$%&'()*+,/\\-_\\.\"]]+@[a-zA-Z0-9[!#$%&'()*+,/\\-_\"]]+\\.[a-zA-Z0-9[!#$%&'()*+,/\\-_\"\\.]]+");
	public static boolean isValidEmail(String email) 
	{       
	    Matcher m = emailPattern.matcher(email);
	        return !m.matches();
	}
		
	public static int SelectAvailableRoomsForEachType(int type1, int type2, int type3)
	{
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("SELECT 1, 2 or 3\n1.\tEconomy, "+Integer.toString(type1)+" Available\n2.\tBusiness, "+Integer.toString(type2)+"\n3.\tSuite, "+Integer.toString(type3));
    	try {
    		while(true){
	        	selected = reader.readLine();
	        	if (selected.contains("1") || selected.contains("Economy"))  {
	        		System.out.println("Economy Selected");
	        		return 1;
				}
	        	else if (selected.contains("2") || selected.contains("Business")) {
	        		System.out.println("Business Selected");
	        		return 2;
				}
	        	else if (selected.contains("3") || selected.contains("Suite")) {
	        		System.out.println("Suite Selected");
	        		return 3;
				}
    		}
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return -1;
	}
	
	
	public static int SelectAmount(int amount, int maxAmount)
	{
		String selected = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("SELECT AMOUNT \n");
    	try {
    		selected = reader.readLine();
    	}
         catch (IOException e) {
            e.printStackTrace();
        }
		
    	try{
    		return Integer.parseInt(selected);
    		
    	}
    	catch (Exception e)
    	{
    		System.out.println("Invalid Number, try again \n");
    		return SelectAmount(amount, maxAmount);
    		
    	}
		
	}
	
	public static void checkBooking(String user, String email, String startDate, String endDate, String roomType, String rooms, String extras, String paymentOption){
		System.out.println("DONE by " + user);
		
	}
	public static void checkIn(String bookingID){
		System.out.println("CHECK IN");
	}
	public static void checkOut(String bookingID){
		System.out.println("CHECK OUT");
	}

}
