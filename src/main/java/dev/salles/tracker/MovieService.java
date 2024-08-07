package dev.salles.tracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
  @Autowired
  private MovieRespitory movieRespitory;
  public List<Movie> allMovies(){
    return movieRespitory.findAll();
  }
}
