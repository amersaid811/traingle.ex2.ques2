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
	
	
	
	/*******************************************BVA TEST****************************************/
	@Test
	/*** A (MIN) ***/
	public void BVANotrTriangle(){
        int a = 0;
        int b = 60;
        int c = 30;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	/*** A (MIN+1) ***/
	public void BVAisoscelesTriangle(){
        int a = 1;
        int b = 50;
        int c = 50;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	/*** A (Nominal) ***/
	public void BVAequilateralTriangle(){
        int a = 50;
        int b = 50;
        int c = 50;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	/*** A (max-1) ***/
	public void BVAScaleneTriangle(){
        int a = 99;
        int b = 76;
        int c = 47;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	/*** A (max) ***/
	public void BVAErrorTriangle(){
        int a = 100;
        int b = -1;
        int c = -5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.ERROR.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	

}  


