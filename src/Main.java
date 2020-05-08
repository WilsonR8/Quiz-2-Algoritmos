import processing.core.PApplet;

public class Main extends PApplet {

	int pantalla = 0;
	int cuadros;
	int lineas;
	int ancho;
	int alto;
	int tam;
	
	int x;
	int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");
	}

	public void settings() {
		size(600, 400);

	}

	public void setup() {
		ancho = 20;
		alto = 20;
		tam = 20;
		x = 30;
		y = 20;

	

	}

	public void draw() {
		switch (pantalla) {

		case (0):
			background(100);

			for (lineas = 0; lineas < 20; lineas++) {
				for (cuadros = 0; cuadros < 30; cuadros++) {
					if (lineas % 2 == 0) {
						if (cuadros % 2 == 0) {
							noStroke();
							fill(0);
						} else {
							noStroke();
							fill(255);
						}
					} else {
						if (cuadros % 2 == 0) {
							noStroke();
							fill(255);
						} else {
							noStroke();
							fill(0);
						}
					}
					rect(cuadros * ancho, lineas * alto, ancho, alto);
				}

			}
			break;

		}

	}

	public void mousePressed() {
		if ((mouseX > 0 && mouseX < 600) && (mouseY > 0 && mouseY < 400)) {

		}

	}

	public void move() {

	}
}
