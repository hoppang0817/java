package 포켓몬Go;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {

	 private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<String, ArrayList<Pokemon>>();

	    public ArrayList<Pokemon> getPokemons(String name) {
			return pokemons.get(name);
	    }

	    public void add(Pokemon pokemon) {
	    	String name = pokemon.name;
	    	if(getPokemons(name) == null) {
	    		ArrayList<Pokemon>list = new ArrayList<Pokemon>();
	    		pokemons.put(name, list);
	    		//System.out.println("추가");
	    	}else {
	    		getPokemons(name).add(pokemon);
	    		//System.out.println("추가");
	    	}
	    }

	    public Pokemon getStrongest(String name) {
	    	  // name 이름의 포켓몬 목록.
	        ArrayList<Pokemon> pokemonList = getPokemons(name);

	        // name 이름의 포켓몬 목록이 비어있으면, null 리턴.
	        if (pokemonList == null) {
	            return null;
	        }

	        // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
	        Pokemon strongest = null;

	        // 포켓몬 리스트 안에 있는, 모든 포캣몬의 cp를 비교.
	        // strongest를 가장 센 포켓몬으로 교체
	        for(Pokemon pokemon : pokemonList){
	            if(strongest == null || pokemon.cp > strongest.cp){
	                strongest = pokemon;
	            }
	        }
	    
			return strongest;
	    }

	    public Pokemon getStrongest() {
	    	  Pokemon strongest = null;
	    
	    	for(String key : pokemons.keySet()){
	            Pokemon  p = getStrongest(key);
	            
	            if(strongest == null || p.cp > strongest.cp){
	                strongest = p;
	            }
	        }
	        return strongest;
	    }
}
