public class Main{
	public static void main(String arg[]){
		System.out.println("Hola Mundo");
		Bd bd=new Bd();
		bd.conectar();
		Mensaje obj=new Mensaje();
		System.out.println(obj.getMensaje);


	}
}