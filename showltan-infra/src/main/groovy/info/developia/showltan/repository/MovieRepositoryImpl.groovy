package info.developia.showltan.repository

import info.developia.showltan.mapper.MovieMapper
import info.developia.showltan.model.Movie
import info.developia.showltan.repository.MovieRepository

class MovieRepositoryImpl implements MovieRepository {

    MovieMapper composeMapper

    MovieRepositoryImpl(MovieMapper composeMapper) {
        this.composeMapper = composeMapper
    }

    @Override
    Optional<Movie> getByNcas(String ncas) {
        composeMapper.getByNcas(ncas)
    }

    @Override
    List<Movie> getAll() {
        composeMapper.getAll()
    }

    @Override
    int save(Movie compose) {
        composeMapper.save(compose)
    }

}
