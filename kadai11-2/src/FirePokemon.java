public class FirePokemon extends PokemonCharacter {
	
	protected int FireAttack = 30;
	
	public FirePokemon(String name,int hp,int at,int df,int FireAttack) {
		super(name,hp,at,df);
		System.out.println("このポケモンの名前は" + this.name + "です");
		System.out.println("体力は" + this.hp);
		System.out.println("攻撃力は" + this.at);
		System.out.println("防御力は" + this.df);
		System.out.println("炎攻撃力は" + this.FireAttack);
	}
	
	
	public void attack(int hp1,int hp2) {
		System.out.println(this.name + "の攻撃");
		System.out.println("サンダーのhpが" + hp1 + "hpに減った");
		System.out.println("サンダーファイヤーのhpが" + hp2 + "hpに減った");

		if(hp1 <=0) {
			System.out.println("サンダーが倒れました");
			throw new IllegalArgumentException();
		}
		if(hp2 <=0) {
			System.out.println("サンダーファイヤーが倒れました");
			throw new IllegalArgumentException();
		}
	}
	
	public void FireAttack(int hp1,int hp2) {
		System.out.println(this.name + "の炎攻撃");
		System.out.println("サンダーのhpが" + hp1 + "hpに減った");
		System.out.println("サンダーファイヤーのhpが" + hp2 + "hpに減った");

		if(hp1 <=0) {
			System.out.println("サンダーが倒れました");
			throw new IllegalArgumentException();
		}
		if(hp2 <=0) {
			System.out.println("サンダーファイヤーが倒れました");
			throw new IllegalArgumentException();
		}
	}
	public void defense() {
		this.df +=10;
		System.out.println(this.name + "の防御");
		System.out.println(this.name + "の防御が" + this.df + "になった");
	}
}