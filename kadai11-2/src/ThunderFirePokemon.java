public class ThunderFirePokemon  extends PokemonCharacter {
	
	protected int ThunderAttack = 30;
	protected int FireAttack = 30;
	
	public ThunderFirePokemon(String name,int hp,int at,int df,int ThunderAttack , int FireAttack) {
		super(name,hp,at,df);
		System.out.println("このポケモンの名前は" + this.name + "です");
		System.out.println("体力は" + this.hp);
		System.out.println("攻撃力は" + this.at);
		System.out.println("防御力は" + this.df);
		System.out.println("雷攻撃力は" + this.ThunderAttack);
		System.out.println("炎攻撃力は" + this.FireAttack);
	}
	

	
	
	public void attack(int hp1 , int hp2) {
		System.out.println(this.name + "の攻撃");
		System.out.println("サンダーのhpが" + hp1 + "hpに減った");
		System.out.println("ファイヤーのhpが" + hp2 + "hpに減った");

		if(hp1 <=0) {
			System.out.println("サンダーが倒れました");
			throw new IllegalArgumentException();
		}
		if(hp2 <=0) {
			System.out.println("ファイヤーが倒れました");
			throw new IllegalArgumentException();
		}
	}
	public void ThunderAttack(int hp1,int hp2) {
		System.out.println(this.name + "の雷攻撃");
		System.out.println("サンダーのhpが" + hp1 + "hpに減った");
		System.out.println("ファイヤーのhpが" + hp2 + "hpに減った");
		if(hp1 <=0) {
			System.out.println("サンダーが倒れました");
			throw new IllegalArgumentException();
		}
		if(hp2 <=0) {
			System.out.println("ファイヤーが倒れました");
			throw new IllegalArgumentException();
		}
	}
	public void FireAttack(int hp1,int hp2) {
		System.out.println(this.name + "の炎攻撃");
		System.out.println("サンダーのhpが" + hp1 + "hpに減った");
		System.out.println("ファイヤーのhpが" + hp2 + "hpに減った");
		if(hp1 <=0) {
			System.out.println("サンダーが倒れました");
			throw new IllegalArgumentException();
		}
		if(hp2 <=0) {
			System.out.println("ファイヤーが倒れました");
			throw new IllegalArgumentException();
		}
	}
	public void defense() {
		System.out.println(this.name + "の防御");
		System.out.println(this.name + "の防御が" + this.df + "になった");
	}

}