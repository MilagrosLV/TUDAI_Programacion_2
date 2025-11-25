package sitioDeVideos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sitio de videos");

        //Instanciación de usuarios
        Usuario usuario1 = new Usuario("juan123", "juan@gmail.com", 2020);
        Usuario usuario2 = new Usuario("maria456", "maria@gmail.com", 2021);
        //Instanciación de videos
        Video video1 = new Video("Introducción a Java", usuario1, 120, 5000, 23, 0, 2025);
        Video video2 = new Video("Tutorial de Python", usuario1, 150, 8000, 45, 2, 2024);
        Video video3 = new Video("Curso de JavaScript", usuario2, 200, 12000, 67, 1, 2023);
        Video video4 = new Video("Aprendiendo C++", usuario2, 180, 6000, 34, 0, 2022);
        Video video5 = new Video("Fundamentos de HTML", usuario1, 90, 3000, 12, 0, 2021);
        Video video6 = new Video("CSS para principiantes", usuario2, 110, 4000, 15, 1, 2020);
        Video video7 = new Video("Desarrollo web completo", usuario1, 250, 15000, 78, 3, 2025);
        Video video8 = new Video("Bases de datos SQL", usuario2, 130, 7000, 29, 0, 2024);
        Video video9 = new Video("Programación en Ruby", usuario1, 160, 9000, 38, 2, 2023);
        Video video10 = new Video("Introducción a Swift", usuario2, 140, 6500, 27, 0, 2022);
        Video video11 = new VideoClave("Aprendiendo Go", usuario1, 170, 11000, 41, 1, 2021);

        //Instanciar Playlist
        Playlist playlist1 = new Playlist("Mis videos favoritos", 5);
        Playlist playlist2 = new Playlist("Videos para aprender a programar", 35);
        Playlist playlist3 = new Playlist("Cursos", 5);
        Playlist playlist4 = new PlaylistSponsor("Videos de usuario1", 20, video1);

        //Agregar videos a las playlists
        playlist1.agregarElementoVideo(video1);playlist1.agregarElementoVideo(video3);playlist1.agregarElementoVideo(video5);playlist1.agregarElementoVideo(video10);
        playlist2.agregarElementoVideo(video2);playlist2.agregarElementoVideo(video4);playlist2.agregarElementoVideo(video6);playlist2.agregarElementoVideo(video7);playlist2.agregarElementoVideo(video8);playlist2.agregarElementoVideo(video9); playlist2.agregarElementoVideo(video10);
        playlist3.agregarElementoVideo(playlist2); playlist3.agregarElementoVideo(video11);
        playlist4.agregarElementoVideo(video1); playlist4.agregarElementoVideo(video2); playlist4.agregarElementoVideo(video3);

        /*//Mostrar duraciones totales de las playlists
        System.out.println("Duración total de la playlist 1: " + playlist1.getDuracionSeg() + " segundos");
        System.out.println("Duración total de la playlist 2: " + playlist2.getDuracionSeg() + " segundos");   
        System.out.println("Duración total de la playlist 3: " + playlist3.getDuracionSeg() + " segundos");
        System.out.println("Duración total de la playlist 4: " + playlist4.getDuracionSeg() + " segundos");
        */
        
        //Filtrar videos por año de publicación en la playlist2
        Filtro ffanio = new FiltroAnio(2024);
        System.out.println("Videos en la playlist filtrada por año 2024:" + playlist2.buscar(ffanio).toString());

        

    }
}