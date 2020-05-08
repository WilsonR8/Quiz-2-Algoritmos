import processing.core.PApplet;

public class Square implements Runnable {

	private PApplet app;
	private int px;
	private int py;
	private int tam = 20;

	public Square(PApplet app) {
		this.app = app;
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		paint();

		try {

			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void paint() {
		app.rect(px, py, tam,tam);

	}

	/*public void move() {

		px += app.random(-2, 2);
		py += app.random(-2, 2);

	}*/

}

