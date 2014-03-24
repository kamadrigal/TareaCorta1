
public class calculadora{
	public native int sumaC (int num1, int num2);
	public native int restaC (int num1, int num2);
	public native int multC (int num1, int num2);
	public native int divC (int num1, int num2);

	public static void main(String[] args){
		interfaz calcu = new interfaz();
	}
	
		static {
        System.loadLibrary("metodos"); 
    }
	
}
