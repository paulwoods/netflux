package guru.springframework.netflux.services;

import guru.springframework.netflux.domain.Movie;
import guru.springframework.netflux.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Mono<Movie> getMovieById(String id);

    Flux<Movie> getAllMovies();

    Flux<MovieEvent> streamMovieEvents(String id);
}
