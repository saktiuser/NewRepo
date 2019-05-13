package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class ClientApp {

	public static void main(String[] args) {
		String json= "{\"empId\":10,\"empName\":\"sakti\",\"empSal\":2.3}";
		try {
			ObjectMapper om=new ObjectMapper();
			Employee e=om.readValue(json , Employee.class);
			System.out.println(e);
		}
		catch (Exception e) {
			e.printStackTrace();
		}//catch
	}//main
}//class
