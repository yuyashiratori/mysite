
public abstract class PokemonCharacter {

	protected int hp;
	protected String name;
	protected int at;
	protected int df;
	
	public PokemonCharacter(String name ,int hp , int at, int df) {
	        this.name = name;
	        this.hp = hp;
	        this.at = at;
	        this.df = df;
	}
	
	public abstract void attack(int hp1,int hp2);
	public abstract void defense();
	
}
