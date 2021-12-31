package ir.maktab.hw20.service;

import ir.maktab.hw20.config.AppConfig;
import ir.maktab.hw20.entity.Favor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
@SpringJUnitConfig(AppConfig.class)

class FavorServiceTest {
    @Autowired
    private  FavorService favorService;

//    @TestConfiguration
//    @ComponentScan("service")
//    public static class FavorServiceTestConfig {
//    }


    @Test
    void testSaveFavor_isOk() {
        Favor favor = Favor.builder()
                .serviceName("interior_Decoration")
                .ServiceCategory("decoration")
                .build();
        favorService.save(favor);
        Favor result = favorService.loadByServiceName(favor.getServiceName());
        assertEquals(favor.getServiceName(), result.getServiceName());


    }


}