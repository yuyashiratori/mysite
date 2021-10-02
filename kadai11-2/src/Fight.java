
import java.util.Scanner;

public class Fight {
	
	public static void main(String[]args) {
		PokemonCharacter c1 = new ThunderPokemon("サンダー",80,20,20,30);
		PokemonCharacter c2 = new FirePokemon("ファイヤー",100,20,20,30);
		PokemonCharacter c3 = new ThunderFirePokemon("サンダーファイヤー",70,20,20,30,30);
	
		batlle(c1,c2,c3);
	}
	private static void batlle(PokemonCharacter c1,PokemonCharacter c2,PokemonCharacter c3) {
		
		while(true) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println(c1.name + "のターン");
			System.out.println("どうしますか");
			String str1 = scan1.next();
			
		    if(str1.equals("攻撃")) {
		    	c2.hp -= c1.at;
		    	c3.hp -= c1.at;
		    	
		    	c1.attack(c2.hp,c3.hp);
			}
			if(str1.equals("防御")) {
				c1.df +=10;
				c1.defense();
			}
		    if(str1.equals("雷攻撃")) {
		    	if (c1 instanceof ThunderPokemon) {
					ThunderPokemon t = (ThunderPokemon)c1;
					c2.hp -= t.ThunderAttack;
			    	c3.hp -= t.ThunderAttack;
					t.ThunderAttack(c2.hp,c3.hp);
							
				}
				else if(c1 instanceof FirePokemon) {
					FirePokemon f = (FirePokemon)c1;
				}
				else if(c1 instanceof ThunderFirePokemon) {
					ThunderFirePokemon tf = (ThunderFirePokemon)c1;
				}
		    }
		    Scanner scan2 = new Scanner(System.in);
			System.out.println(c2.name + "のターン");
			System.out.println("どうしますか");
			String str2 = scan2.next();
			
		    if(str2.equals("攻撃")) {
		    	c1.hp -= c2.at;
		    	c3.hp -= c2.at;
		    	c2.attack(c1.hp,c3.hp);
			}
			if(str2.equals("防御")) {
				c2.df +=10;
				c2.defense();
			}
		    if(str2.equals("炎攻撃")) {
		    	if (c2 instanceof FirePokemon) {
					FirePokemon f = (FirePokemon)c2;
					c1.hp -= f.FireAttack;
			    	c3.hp -= f.FireAttack;
					f.FireAttack(c1.hp,c3.hp);
				}
				else if(c2 instanceof FirePokemon) {
					ThunderPokemon t = (ThunderPokemon)c2;
				}
				else if(c2 instanceof ThunderFirePokemon) {
					ThunderFirePokemon tf = (ThunderFirePokemon)c2;
				}
		    }
		    Scanner scan3 = new Scanner(System.in);
			System.out.println(c3.name + "のターン");
			System.out.println("どうしますか");
			String str3 = scan3.next();
			
					 
		    if(str3.equals("攻撃")) {
		    	c1.hp -= c3.at;
		    	c2.hp -= c3.at;
		    	c3.attack(c1.hp,c2.hp);
			}
			if(str3.equals("防御")) {
				c3.df +=10;
				c3.defense();
			}
			if(str3.equals("雷攻撃")) {
				if (c3 instanceof ThunderFirePokemon) {
					ThunderFirePokemon tf = (ThunderFirePokemon)c3;
					c1.hp -= tf.ThunderAttack;
			    	c2.hp -= tf.ThunderAttack;
					tf.ThunderAttack(c1.hp,c2.hp);
				}
				else if(c3 instanceof ThunderPokemon) {
					ThunderPokemon t = (ThunderPokemon)c3;
				}
				else if(c3 instanceof FirePokemon) {
					FirePokemon f = (FirePokemon)c3;
			    }
			}
		    if(str3.equals("炎攻撃")) {
		    	if (c3 instanceof ThunderFirePokemon) {
					ThunderFirePokemon tf = (ThunderFirePokemon)c3;
					c1.hp -= tf.FireAttack;
			    	c2.hp -= tf.FireAttack;
					tf.FireAttack(c1.hp,c2.hp);
				}
				else if(c3 instanceof ThunderPokemon) {
					ThunderPokemon t = (ThunderPokemon)c3;
				}
				else if(c3 instanceof FirePokemon) {
					FirePokemon f = (FirePokemon)c3;
			    }
		    }

	
		}
	}
}
	
