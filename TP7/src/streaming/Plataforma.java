package streaming;

import java.util.List;
import java.util.ArrayList;

public class Plataforma {
  
  private List<Pelicula> peliculas;
  
  public Plataforma(){
    peliculas = new ArrayList<Pelicula>();
  }
  
  public List<Pelicula> peliculasCriterio(Filtro f){
    
    List<Pelicula> pelis = new ArrayList<Pelicula>();
    
    for(Pelicula p: peliculas){
      if(f.eval(p)){
        pelis.add(p);
      }
    }
    return pelis;
  }
}
