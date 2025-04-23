package method.factory.controller;

import jakarta.validation.Valid;
import method.factory.business.service.implementation.UserServiceImp;
import method.factory.infrastructure.dto.UserRequestDto;
import method.factory.infrastructure.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserServiceImp userServiceImp;

    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid UserRequestDto dto) throws Exception {
        userServiceImp.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
