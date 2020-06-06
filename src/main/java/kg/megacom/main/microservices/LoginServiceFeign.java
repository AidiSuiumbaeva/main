package kg.megacom.main.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "login-service", url = "localhost:8002")
public interface LoginServiceFeign {
        @PostMapping("/auth/signup")
        ResponseEntity signUp(@RequestParam String login, @RequestParam String password);
    @PostMapping("/auth/signup")
        String login(@RequestParam String login,@RequestParam String password);
    }

