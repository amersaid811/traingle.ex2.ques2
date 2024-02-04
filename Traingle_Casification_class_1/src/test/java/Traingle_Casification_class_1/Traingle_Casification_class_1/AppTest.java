package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
/*******************************************EP TEST****************************************/
	@Test
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void NotTriangle(){
        int a = 3;
        int b = 1;
        int c = 4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	
	@Test
	public void ScaleneTriangle(){
        int a = 3;
        int b = 2;
        int c = 4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void isoscelesTriangle(){
        int a = 1;
        int b = 2;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	//test
	@Test
	public void ErrorTriangle(){
        int a = -7;
        int b = -1;
        int c = -5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.ERROR.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	
}

