package tech.jithinkuriakose.demo.reactive.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tech.jithinkuriakose.demo.reactive.model.Employee;
import tech.jithinkuriakose.demo.reactive.service.IEmployeeService;

import java.time.Duration;

@RestController
@RequiredArgsConstructor
public class EmployeeReactiveController {

  @Autowired
  private IEmployeeService employeeService;

  @GetMapping(value = "/employees",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<Employee> getAllEmployees() {
    return employeeService.getAllEmployees(Duration.ofSeconds(3));
  }

  @PostMapping("/employees")
  public Mono<Employee> createEmployee(@RequestBody Employee employee) {
    return employeeService.createEmployee(employee);
  }
}
