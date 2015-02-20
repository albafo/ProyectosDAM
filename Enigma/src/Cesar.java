
public class Cesar {

	public StringBuffer encriptacionAfines(int a, int b, StringBuffer str) {
		StringBuffer abc=new StringBuffer("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		StringBuffer abcCod;
		
		abcCod=this.abcCod(a, b, abc);
		
		for(int i=0; i<str.length(); i++) {
			char letra=str.charAt(i);
			int pos=abc.lastIndexOf(""+letra);
			
			if(pos!=-1) {
				char letraCod=abcCod.charAt(pos);
				str.setCharAt(i, letraCod);
			}
		}
		return str;
	}
	
	public StringBuffer desencriptacionAfines(int a, int b, StringBuffer str) {
		StringBuffer abc=new StringBuffer("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		StringBuffer abcCod;
		abcCod=this.abcCod(a, b, abc);
		for(int i=0; i<str.length(); i++) {
			char letra=str.charAt(i);
			int pos=abcCod.lastIndexOf(""+letra);
			
			if(pos!=-1) {
				char letraCod=abc.charAt(pos);
				str.setCharAt(i, letraCod);
			}
		}
		return str;
	}
	
	private StringBuffer abcCod(int a, int b, StringBuffer abc) {
		StringBuffer abcCod=new StringBuffer(abc);
		for(int i=0; i<abc.length(); i++) {
			int c=(a*i+b)%27;
			abcCod.setCharAt(i, abc.charAt(c));
		}
		return abcCod;
		
	}
	
}
