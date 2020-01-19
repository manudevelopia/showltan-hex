package info.developia.showltan.repository

import info.developia.showltan.mapper.MovieMapper
import info.developia.showltan.model.Movie
import info.developia.showltan.repository.MovieRepository

class MovieRepositoryImpl implements MovieRepository {

    MovieMapper movieMapper

    MovieRepositoryImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper
    }

    @Override
    Optional<Movie> getByImdbId(String imdbId) {
        movieMapper.getByImdbId(imdbId)
    }

    @Override
    List<Movie> getAll() {

        movieMapper.getAll()
    }

    @Override
    int save(Movie movie) {
        movieMapper.save(movie)
    }

}
