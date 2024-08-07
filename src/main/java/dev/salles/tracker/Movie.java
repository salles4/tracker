package dev.salles.tracker;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
  @Id
  private ObjectId id;
  private String imdbId;
  private String title;
  private String poster;
  private String releaseDate;
  private String trailerLink;
  private List<String> genres;
  private List<String> backdrops;
}
