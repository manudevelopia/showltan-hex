package info.developia.showltan.repository

import info.developia.showltan.model.Movie


interface MovieRepository {

    Optional<Movie> getByNcas(String ncas)
    List<Movie> getAll()
    int save(Movie compose)

}
