/* Alvaro Baño Fos*/
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StringBuilder frase=new StringBuilder("Hoy no me puedo levantar".toString().toUpperCase());
		StringBuilder abcOrig= new StringBuilder("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		StringBuilder abcClave=new StringBuilder(abcOrig);
		StringBuilder clave=new StringBuilder("EXTREMADURA");
		int k=7;
		
		
		for(int i=0; i<clave.length(); i++) {
			
			//Quitamos las letras repetidas de la clave
			for(int j=i+1; j<clave.length(); j++) {
				if(clave.charAt(i)==clave.charAt(j)) {
					clave.deleteCharAt(j);
				}
			}
			
			if(k+1>abcOrig.length()) {
				k=0;
			}
			abcClave.setCharAt(k, clave.charAt(i));
			k++;
			
		}
		
		
		System.out.println(""+k);
		for(int i=0; i<abcOrig.length(); i++) {
			if(k+1>abcOrig.length()) {
				k=0;
			}
			if(clave.lastIndexOf(""+abcOrig.charAt(i))==-1) {
				
				abcClave.setCharAt(k, abcOrig.charAt(i));
				k++;
			}
			
		}
			
		System.out.println(abcClave);
			
		
		
		
		
		
		
		for(int i=0; i<frase.length(); i++){
			
			int posLetra=abcOrig.lastIndexOf(""+frase.charAt(i));
			
			if(posLetra!=-1) {
				char letraCodif=abcClave.charAt(posLetra);
				frase.setCharAt(i, letraCodif);
			}
			
			
		}
		System.out.println(frase);
		
	}

}
