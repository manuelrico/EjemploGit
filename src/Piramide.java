import acm.program.*;
import acm.graphics.*;
public class Piramide extends GraphicsProgram {
	
	public void run(){
		setSize(800,600);
		pintaPiramide();
	}
	
public void pintaPiramide(){
	int numLadrillosBase = 14;
	int anchoLadrillo = 30;
	int altoLadrillo = 12;
	int altoPiramide = numLadrillosBase * altoLadrillo;
	int basePiramide = numLadrillosBase * anchoLadrillo;
	for (int h=0; h< numLadrillosBase; h++){
	for (int i=0; i< numLadrillosBase-h ; i++){
		GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
		add(ladrillo,
				getWidth()/2 -basePiramide/2 +anchoLadrillo*h/2  + anchoLadrillo * i, getHeight() - altoLadrillo - altoLadrillo * h);
		pause(90);
	}
	
}

}	
}