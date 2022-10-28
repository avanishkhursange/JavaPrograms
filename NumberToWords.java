

public class NumberToWords {  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      numberToWords(100);

	}

	  public static int getDigitCount(int number) {
	        int count = 0;
	        if (number <0) {
	            return -1;
	        }
	        if (number == 0) {
	            count = 1;
	        }
	        while (number > 0) {
	            number = number / 10;
	            count=count+1;
	        }
	        return count;
	    }
	    public static int reverse(int number) {
	        int c = 0;
	        int d = 0;
	    
	        
	        while (number != 0) {
	            c = number % 10;
	            d = (d * 10) + c;
	            //System.out.println("reverse of "+number+" is"+d);
	            number = number / 10;
	        }
	        return d;
	    }
	    public static void numberToWords(int number) {
	        int a = 0;
	        int b = 0;
	        int c = 0;
	        int d = 0,e=0;
	      
	            if (number >= 0) {
			        	
			            c = reverse(number);
			            e=c;
			          // System.out.println("reverse of "+number+" is="+c);
			            d = getDigitCount(number);
			            if(number==0) {
				        System.out.println("Zero");
				       
			                
			            }
	            while (c > 0) {
	                a = c % 10;
	                c = c / 10;
	                switch (a) {
	                    case 0:
	                        System.out.println("Zero");
	                        break;
	                    case 1:
	                        System.out.println("One");
	                        break;
	                    case 2:
	                        System.out.println("Two");
	                        break;
	                    case 3:
	                        System.out.println("Three");
	                        break;
	                    case 4:
	                        System.out.println("Four");
	                        break;
	                    case 5:
	                        System.out.println("Five");
	                        break;
	                    case 6:
	                        System.out.println("Six");
	                        break;
	                    case 7:
	                        System.out.println("Seven");
	                        break;
	                    case 8:
	                        System.out.println("Eight");
	                        break;
	                    case 9:
	                        System.out.println("Nine");
	                        break;
	                }
	            }  int reverseCount= getDigitCount(e);
	           
	            if(reverseCount!=d){
	                //System.out.println("c is="+c+" d is="+d);
	             for(int i=0;i!=d-reverseCount;i++){
	            System.out.println("Zero");} }
	               
	        }
	        else
	        {
	            System.out.println("Invalid Value");
	        }
	    }
	}