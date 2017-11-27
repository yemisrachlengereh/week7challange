package me.afua.thymeleafsecdemo.dataLoader;

import me.afua.thymeleafsecdemo.entities.UserRole;
import me.afua.thymeleafsecdemo.repositories.JobseekerRepository;
import me.afua.thymeleafsecdemo.repositories.RoleRepository;
import me.afua.thymeleafsecdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    JobseekerRepository employeeRepository;
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Loading data . . .");

        roleRepository.save(new UserRole ( "STUDENT" ));
        roleRepository.save(new UserRole ("TEACHER"));

        UserRole adminRole = roleRepository.findByRole("TEACHER");
        UserRole userRole = roleRepository.findByRole("STUDENT");
    }
}
