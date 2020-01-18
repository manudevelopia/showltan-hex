package info.developia.showltan.service

import info.developia.showltan.exception.NotFoundException
import info.developia.showltan.model.Movie
import info.developia.showltan.repository.MovieRepository

class MovieServiceImpl implements MovieService {

    final MovieRepository movieRepository

    MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository
    }

    @Override
    Movie getByNcas(String ncas) {
        return movieRepository.getByNcas(ncas)
                .orElseThrow({ new NotFoundException() })
    }

    @Override
    List<Movie> getAll() {
        return movieRepository.getAll()
    }

    @Override
    int save(Movie movie) {
        return movieRepository.save(movie)
    }
}
