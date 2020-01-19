package info.developia.showltan.repository

import info.developia.showltan.model.Movie


interface MovieRepository {

    Optional<Movie> getByImdbId(String imdbId)
    List<Movie> getAll()
    int save(Movie movie)

}
