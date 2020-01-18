package info.developia.showltan.service

import info.developia.showltan.model.Movie


interface MovieService {

    Movie getByNcas(String ncas)
    List<Movie> getAll()
    int save(Movie compose)

}
