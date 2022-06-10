package tech.jithinkuriakose.demo.reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tech.jithinkuriakose.demo.reactive.dao.EmployeeReactiveRepository;
import tech.jithinkuriakose.demo.reactive.model.Employee;

import java.time.Duration;
import java.util.UUID;

@Service
public class EmployeeService implements IEmployeeService {
  @Autowired
  private EmployeeReactiveRepository employeeRepository;

  @Override
  public Flux<Employee> getAllEmployees(Duration duration) {
    return employeeRepository.findAll().delayElements(duration);
  }

  @Override
  public Mono<Employee> createEmployee(Employee employee) {
    if (employee.getId() == null) {
      employee.setId(UUID.randomUUID());
    }
    return employeeRepository.save(employee);
  }
}
