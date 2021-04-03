<#if package?? && package != "">
package ${package};
</#if>

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author ${user}, ${date}, ${time}
 * Last update: -
 */// </editor-fold>
public class ${name} {

	// <editor-fold defaultstate="collapsed" desc="static fields...">
	private static Scanner scanner = new Scanner(System.in);
	// </editor-fold>
	
	public static void main(String[] args) {
		
		System.out.print("Type your name: ");
		String currentLine = scanner.nextLine();
		System.out.println(currentLine);
		
	}//main

	// <editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">

	// </editor-fold>

}//class
