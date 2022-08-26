package test;

import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import lombok.RequiredArgsConstructor;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserServiceImpl service;


    @GetMapping("/list")
    public List<User> list() {
        MDC.put("mdcTraceNum", "12345");
        return service.list();
    }

    @GetMapping("/merge")
    public int merge() {
        MDC.put("mdcTraceNum", "12345");
        return service.merge(User.builder().id("id00").age(12).name("test_name").email("test@test.com").build());
    }
}