package com.miniinsta.user;

import com.miniinsta.user.Model.CreateUserRequestModel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("check")
    public String getHealthCheck() {
        return "User API Services are UP";
    }

    @PostMapping("/createUser")
    public String createUser (@Valid @RequestBody CreateUserRequestModel user) {
        return "user";
    }
}
