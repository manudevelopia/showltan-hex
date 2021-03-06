package info.developia.showltan.controller

import info.developia.showltan.model.Movie
import info.developia.showltan.service.MovieService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movies")
class MovieController {

    MovieService movieService

    MovieController(MovieService movieService) {
        this.movieService = movieService
    }

    @GetMapping("/all")
    ResponseEntity<List<Movie>> getAll() {
        ResponseEntity.ok(movieService.getAll())
    }

    @GetMapping
    ResponseEntity<Movie> getByImdbId(@RequestParam String imdbId) {
        ResponseEntity.ok(movieService.getByImdbId(imdbId))
    }

    @PostMapping
    ResponseEntity save(@RequestBody Movie movies) {
        ResponseEntity.ok(movieService.save(movies))
    }

}
