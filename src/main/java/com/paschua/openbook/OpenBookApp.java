package com.paschua.openbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//implements CommandLineRunner to populate the database
public class OpenBookApp {

    private static final Logger log = LoggerFactory.getLogger(OpenBookApp.class);

//    @Autowired
//    private UserRepository userRepository;

    public static void main(String[] args) {
        log.info("Start Application...");
        SpringApplication.run(OpenBookApp.class, args);
    }

    /*public void run(String... args) {

        log.info("Start Application...");

        userRepository.save(new User("paschualetto@gmail.com", "123mudar", "Paschualetto"));
        userRepository.save(new User("ricardo.teston@gmail.com", "123mudar", "Ricardo Teston"));
        userRepository.save(new User("rafael.matia@gmail.com", "123mudar", "Rafael Matia"));

        log.info("Find All...");
        userRepository.findAll().forEach(x -> System.out.println(x));

        log.info("Find By ID...");
        userRepository.findById(1L).ifPresent(x -> System.out.println(x));

        log.info("Find By Email...");
        userRepository.findByEmail("paschualetto@gmail.com").forEach(x -> System.out.println(x));

        log.info("Find By Password...");
        userRepository.findByPassword("123mudar").forEach(x -> System.out.println(x));

        log.info("Find By Name...");
        userRepository.findByName("Rafael Matia").forEach(x -> System.out.println(x));
    }*/
}
