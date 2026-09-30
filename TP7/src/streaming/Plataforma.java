package streaming;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Plataforma {
  
  private Set<Pelicula> peliculas;
  private Filtro politicaRentabilidad;
  
  public Plataforma(Filtro politicaInicial) {
      peliculas = new HashSet<>();
      this.politicaRentabilidad = politicaInicial;
  }

  // Permite cambiar la política en TIEMPO DE EJECUCIÓN
  public void setPoliticaRentabilidad(Filtro nuevaPolitica) {
      if (nuevaPolitica != null) {
          this.politicaRentabilidad = nuevaPolitica;
      }
  }
  
  //add
  public void agregarPelicula(Pelicula p) {
	  if(p==null) throw new NullPointerException("No se puede agregar pelicula. Es nula.");
	  peliculas.add(p);
  }
  //remove
  public void eliminarPelicula(Pelicula p) {
	  if(p==null) throw new NullPointerException("No se puede eliminar pelicula. Es nula.");
	  peliculas.remove(p);
  }
  //has
  public boolean tienePelicula(Pelicula p) {
	  if(p==null) throw new NullPointerException("No se puede saber si tiene la pelicula. Es nula.");
	  return peliculas.contains(p);
  }
  
  
  //buscar peliculas
  public List<Pelicula> buscarPeliculas(Filtro f){
    List<Pelicula> pelis = new ArrayList<>();
    for(Pelicula p: peliculas){
      if(f.cumple(p)){
        pelis.add(p);
      }
    }
    return pelis;
  }
//Servicio que determina la rentabilidad con la política actual
  public boolean esRentable(Pelicula p) {
      if (p == null || politicaRentabilidad == null) return false;
      return politicaRentabilidad.cumple(p);
  }
}
