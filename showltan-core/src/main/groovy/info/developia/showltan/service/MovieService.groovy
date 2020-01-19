package info.developia.showltan.service

import info.developia.showltan.model.Movie


interface MovieService {

    Movie getByImdbId(String imdbId)
    List<Movie> getAll()
    int save(Movie movie)

}
