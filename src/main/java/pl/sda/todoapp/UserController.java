package pl.sda.todoapp;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

        private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

        @GetMapping
     Iterable<User> getAllUsers(){
        return repository.findAll();
    }

        @PostMapping
        User addUser (@RequestBody User user){
             return repository.save(user);
        }

        @GetMapping("/{id}")
        Optional<User> findUserById(@PathVariable long id){
        return  repository.findById(id);
    }

        @DeleteMapping("/{id}")
        void deleteUsersById(@PathVariable long id){
                repository.deleteById(id);
        }
}
