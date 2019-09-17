package com.paschua.openbook.repository;

import com.paschua.openbook.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByEmail() {
        testEntityManager.persist(new User("teste@teste.com", "teste", "Teste"));

        List<User> users = userRepository.findByEmail("teste@teste.com");
        Assert.assertEquals(1, users.size());

        Assertions.assertThat(users).extracting(User::getEmail).containsOnly("teste@teste.com");
    }
}
