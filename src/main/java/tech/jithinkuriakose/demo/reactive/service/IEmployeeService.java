package tech.jithinkuriakose.demo.reactive.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tech.jithinkuriakose.demo.reactive.model.Employee;

import java.time.Duration;

public interface IEmployeeService {
  Flux<Employee> getAllEmployees(Duration duration);
  Mono<Employee> createEmployee(Employee employee);
}
