package jdbc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import serial.Employee;

public class Fieldsnames {
	
	
	public static void main(String[] args) {
		
		try {
			Class c = Class.forName("serial.Employee");
			
			
			Method m[] = c.getDeclaredMethods();
			
			for(Method M: m)
			{
				System.out.println(M.getName());
			}
			
			Field f[] = c.getFields();
			for(Field F: f)
			{
				System.out.println(F.getName());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
