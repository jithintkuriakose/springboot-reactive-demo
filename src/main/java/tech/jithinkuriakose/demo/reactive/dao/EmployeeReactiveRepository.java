package tech.jithinkuriakose.demo.reactive.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import tech.jithinkuriakose.demo.reactive.model.Employee;

import java.util.UUID;

public interface EmployeeReactiveRepository extends ReactiveMongoRepository<Employee, UUID> {
}
