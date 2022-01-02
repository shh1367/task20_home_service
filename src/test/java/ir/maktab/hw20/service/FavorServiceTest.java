package ir.maktab.hw20.service;

import ir.maktab.hw20.entity.Favor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
//@SpringJUnitConfig(AppConfig.class)

class FavorServiceTest {
    @Autowired
    private  FavorService favorService;

    @TestConfiguration
    @ComponentScan("ir.maktab.hw20")
    public static class FavorServiceTestConfig {
    }


    @Test
    void testSaveFavor_isOk() {
        Favor favor = Favor.builder()
                .favorName("interior_Decoration")
                .favorCategory("decoration")
                .favorBasePrice(1235L)
                .favorDescription("this is a description")
                .build();
        favorService.save(favor);
        Favor result = favorService.loadByServiceName(favor.getFavorName());
        assertEquals(favor.getFavorName(), result.getFavorName());


    }


}