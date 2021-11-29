package com.example.tv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Covid-19",
            "Peleando juntos",
            "Lavado de manos",
            "Uso de mascarilla",
            "Precaución",
            "Análisis",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Análisis de pruebas Covid-19",
                "Lavado adecuado de manos",
                "Uso adecuado de mascarilla",
                "¡Luchemos juntos!",
                "No bajes la guardia"
        };

        String description ="Puedes contagiarte de COVID‑19 si respiras cerca de una persona infectada o si tocas una superficie contaminada y, seguidamente, te tocas los ojos, la nariz o la boca. El virus se propaga más fácilmente en espacios interiores o en aglomeraciones de personas.";
        String studio[] = {
                "A24", "Luis Angel Inn Corp", "Miramax", "NeneDuendexxx", "Corazón Films"
        };
        String videoUrl[] = {
                "https://static.videezy.com/system/resources/previews/000/045/954/original/Covid-virus-analysis-and-digital-graph-bar-border-monitor-blur-garden-and-blur-jell-bottle.mp4",
                "https://static.videezy.com/system/resources/previews/000/045/795/original/handvirus.mp4",
                "https://static.videezy.com/system/resources/previews/000/046/344/original/10_1.mp4",
                "https://static.videezy.com/system/resources/previews/000/046/760/original/200416-FightCovid19Together.mp4",
                "https://static.videezy.com/system/resources/previews/000/045/660/original/200406_02_Washing_hand_with_alcohol_gel.mp4"
        };
        String bgImageUrl[] = {
                "https://global-strategy.org/wp-content/uploads/2020/04/Global-Strategy-coronavirus-covid19-sesgos-psicologicos.jpg",
                "https://www.vallhebron.com/sites/default/files/styles/fitxa/public/header/-rvkl-eg.jpeg?itok=iRvHwLPN&c=71ab18e739b0351868bed6b7bef0387b",
                "https://cdn.forbes.com.mx/2020/07/General-Motors-Cubrebocas-13-640x360.jpg",
                "https://www.nebrija.com/medios/actualidadnebrija/wp-content/uploads/sites/2/2020/03/virus_lucha-copia.jpg",
                "https://tec.mx/sites/default/files/styles/header_full/public/2021-08/covid-19-lo-que-sirve-lo-que-no-sirve.jpg?itok=5gp9O0z-"
        };
        String cardImageUrl[] = {
                "https://global-strategy.org/wp-content/uploads/2020/04/Global-Strategy-coronavirus-covid19-sesgos-psicologicos.jpg",
                "https://www.vallhebron.com/sites/default/files/styles/fitxa/public/header/-rvkl-eg.jpeg?itok=iRvHwLPN&c=71ab18e739b0351868bed6b7bef0387b",
                "https://cdn.forbes.com.mx/2020/07/General-Motors-Cubrebocas-13-640x360.jpg",
                "https://www.nebrija.com/medios/actualidadnebrija/wp-content/uploads/sites/2/2020/03/virus_lucha-copia.jpg",
                "https://tec.mx/sites/default/files/styles/header_full/public/2021-08/covid-19-lo-que-sirve-lo-que-no-sirve.jpg?itok=5gp9O0z-"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}