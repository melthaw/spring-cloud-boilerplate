package in.clouthink.spring.cloud.boilerplate.repository;

import in.clouthink.spring.cloud.boilerplate.model.Thing;
import org.springframework.data.repository.CrudRepository;

/**
 * @author dz
 */
public interface ThingRepository extends CrudRepository<Thing,String> {

}
