package complex_numbers;

public class Complex {
	private String complex_num;
	
	public Complex (String s) {
		complex_num = s;
	}
	
	public String getComplex() {
		return complex_num;
	}
	
	public void setComplex(String s) {
		complex_num = s;
	}
	
	public Complex multiply(Complex other) {
		//find the operators
        int plusIndexThis = this.complex_num.indexOf('+');
        int plusIndexOther = other.getComplex().indexOf('+');
        int iIndexThis = this.complex_num.indexOf('i');
        int iIndexOther = other.getComplex().indexOf('i');
        
		
		//parse the real number and complex numbers
		int a = Integer.parseInt(this.complex_num.substring(0, plusIndexThis));
		int b = Integer.parseInt(this.complex_num.substring(plusIndexThis+1, iIndexThis));
		int c = Integer.parseInt(other.getComplex().substring(0, plusIndexOther));
		int d = Integer.parseInt(other.getComplex().substring(plusIndexOther+1, iIndexOther));
		
		int real = (a*c) - (b*d);
		int img = (a * d) + (c * b);
		
		
		String new_real = new String(Integer.toString(real));
		String new_img = new String(Integer.toString(img) + "i");
		
		String ans_complex = new_real + "+" + new_img;
		
		Complex ans = new Complex(ans_complex);
		
		return ans;
	}
	
	//TODO: find a way to handle minus s
	
	
}
