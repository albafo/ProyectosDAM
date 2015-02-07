
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
			
		}
		
		
		//Creamos el nuevo abecedario
		int indexAbc=0;
		for(int i=k; i<abcOrig.length(); i++) {
			if(i-k<clave.length()) {
				abcClave.setCharAt(i, clave.charAt(i-k));
			}
			else {
				boolean repetir=true;
				do {
					if(clave.lastIndexOf(""+abcOrig.charAt(indexAbc))==-1) {
						abcClave.setCharAt(i, abcOrig.charAt(indexAbc));
						repetir=false;
					}
					indexAbc++;
					
					
				}while(repetir && indexAbc<abcOrig.length());
			}
		}
		
		for(int i=0; i<k; i++) {
			boolean repetir=true;
			do {
				if(clave.lastIndexOf(""+abcOrig.charAt(indexAbc))==-1) {
					abcClave.setCharAt(i, abcOrig.charAt(indexAbc));
					repetir=false;
				}
				indexAbc++;
				
				
			}while(repetir && indexAbc<abcOrig.length());
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
