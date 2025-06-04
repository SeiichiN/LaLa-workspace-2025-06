package main;

public class Manager {
	public void start() {
		Board board = new Board();
		board.makeMap();
		Goblin goblin = new Goblin("ゴブリン", 'g');
		goblin.setPosition(board);
		Slime slime  = new Slime("スライム", 's');
		slime.setPosition(board);
		Potion potion = new Potion("ポーション", 'p');
		potion.setPosition(board);
		Ether ether = new Ether("エーテル", 'e');
		ether.setPosition(board);
		Hero hero = new Hero("勇者", '@');
		hero.setPosition(board);
		board.printMap();
		goblin.attack(hero);
		slime.attack(hero);
	}
}
