package dev.salles.tracker;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRespitory extends MongoRepository<Movie, ObjectId>  {
  
}
