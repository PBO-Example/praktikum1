//OperasiTest.java
package soal6c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestOperasiArg {
	OperasiArg opArg = new OperasiArg();
	int result1;
	double result2;
	
	@Test
    public void testKali() {
        result1 = opArg.kali(20,30);
        assertEquals(600, result1);

    }
	@Test
    public void testBagi() {
        result2 = opArg.bagi(72,5);
        assertEquals(14,4, result2);

    }
	@Test
    public void testTambah() {
        result1 = opArg.tambah(7,5);
        assertEquals(12, result1);

    }
	@Test
	public void testKurang() {
        result1 = opArg.kurang(72,5);
        assertEquals(67, result1);

    }
	
	@Test
	public void testMainOne() {
        PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));
		int x=30;
		int y=10;
		
		// action
		String result =x+"x"+y+"="+opArg.kali(x,y)+"\n"+x+"/"+y+"="+opArg.bagi(x,y)+"\n"+x+"+"+y+"="+opArg.tambah(x,y)+"\n"+x+"-"+y+"="+opArg.kurang(x,y)+"\n";
		OperasiArg.main(new String[] {"30","10"});
		
		// assertion
		assertEquals(result, bos.toString());

		// undo the binding in System
		System.setOut(originalOut);
    }
	@Test
	public void testMainTwo() {
        PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));
		int x=50;
		int y=4;
		
		// action
		String result =x+"x"+y+"="+opArg.kali(x,y)+"\n"+x+"/"+y+"="+opArg.bagi(x,y)+"\n"+x+"+"+y+"="+opArg.tambah(x,y)+"\n"+x+"-"+y+"="+opArg.kurang(x,y)+"\n";
		OperasiArg.main(new String[] {"50","4"});
		// assertion
		assertEquals(result, bos.toString());

		// undo the binding in System
		System.setOut(originalOut);
    }
}