package in.clouthink.spring.cloud.boilerplate.web.controller;

import in.clouthink.spring.cloud.boilerplate.model.Thing;
import in.clouthink.spring.cloud.boilerplate.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dz
 */
@RestController
public class GettingThingDoneController {

	@Autowired
	private ThingRepository userRepository;

	@GetMapping("/{id}")
	public Thing findById(@PathVariable String id) {
		return userRepository.findOne(id);
	}

}
