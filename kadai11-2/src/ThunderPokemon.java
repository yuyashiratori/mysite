public class ThunderPokemon extends PokemonCharacter {

	protected int ThunderAttack = 30;
	
	public ThunderPokemon(String name,int hp,int at,int df ,int ThunderAttack ) {
		super(name,hp,at,df);
		System.out.println("このポケモンの名前は" + this.name + "です");
		System.out.println("体力は" + this.hp);
		System.out.println("攻撃力は" + this.at);
		System.out.println("防御力は" + this.df);
		System.out.println("雷攻撃力は" + this.ThunderAttack);
	}
	
	public void attack(int hp1,int hp2) {
		System.out.println(this.name+ "の攻撃");
		System.out.println("ファイヤーのhpが" + hp1 + "hpに減った");
		System.out.println("サンダーファイヤーのhpが" + hp2 + "hpに減った");

		if(hp1 <=0) {
			System.out.println("ファイヤーが倒れました");
			throw new IllegalArgumentException();
		}
		if(hp2 <=0) {
			System.out.println("サンダーファイヤーが倒れました");
			throw new IllegalArgumentException();
		}
	}
	public void ThunderAttack(int hp1,int hp2){
		System.out.println(this.name+ "の雷攻撃");
		System.out.println(this.ThunderAttack + "のダメージ");
		System.out.println("ファイヤーのhpが" + hp1 + "hpに減った");
		System.out.println("サンダーファイヤーのhpが" + hp2 + "hpに減った");
		
		if(hp1 <=0) {
			System.out.println("ファイヤーが倒れました");
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
