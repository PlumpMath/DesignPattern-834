package dp.actional.TemplateMethod;

public class TemplateMethodMain {

	public static void main(String[] args) {
		Game game = new SoccerGame();
		game.play();
		
		game = new BasketballGame();
		game.play();
	}

}
