
public class Enigma {
	private static Cesar cesar;
	static int a, b;
	static StringBuffer str;
	public static void main(String[] args) {
		cesar=new Cesar();
		a=4;
		b=3;
		str=new StringBuffer("MENSAJE CODIFICADO");
		
		StringBuffer strCod=cesar.encriptacionAfines(a, b, str);
		System.out.println(strCod);
		StringBuffer strDesc=cesar.desencriptacionAfines(a, b, strCod);
		System.out.println(strDesc);
	}
	

}
