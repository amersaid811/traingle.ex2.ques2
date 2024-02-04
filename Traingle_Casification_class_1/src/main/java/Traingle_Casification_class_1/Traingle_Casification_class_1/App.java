package Traingle_Casification_class_1.Traingle_Casification_class_1;


/**
 * Hello world!
 *
 */

enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
	  ERROR,
   
    
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static void classifyTriangle(int a, int b, int c) {
			
	        
	        if (isEquilateral(a, b, c)) {
	        	triangle= Triangle_Types.equilateral; 
	        }else if(isIsosceles(a, b, c)) {
	        	triangle= Triangle_Types.isosceles;
	        }else if(isNotTriangle(a, b, c)){
	        	triangle= Triangle_Types.Nottriangle;
	        }else if(isScalene(a, b, c)){
	        	triangle= Triangle_Types.Scalene;	
	        }else if(isError(a, b, c)) {
	        	triangle= Triangle_Types.ERROR;
	        }

	       
	    }
	    private static boolean isTriangle(int a, int b, int c) { 
	        return a + b > c && a + c > b && b + c > a;
	    }

	    private static boolean isIsosceles(int a, int b, int c) {
	        return a + b > c && a + c > b && b + c > a && a==b || a==c || b==c;  
	    }

	    private static boolean isEquilateral(int a, int b, int c ) {
	        return a + b > c && b + c > b && b + c > a && a == b && b == c && a==c;
	    }
	    private static boolean isNotTriangle(int a, int b, int c) { 
	        return  a>0 && b>0 && c>0 && !(a + b > c && a + c > b && b + c > a);
	    }
	    private static boolean isScalene(int a, int b, int c) {
	        return (a + b > c && a + c > b && b + c > a) && (a!=b && a!=c && b!=c);  
	    }
	    private static boolean isError(int a, int b, int c) {
	        return a<0 || b<0 || c<0;
	    }
	    
	    public static Triangle_Types get_type() {
	    	return triangle;
	    }
	    
}
