package ir.maktab.hw20.repository;

import ir.maktab.hw20.entity.Favor;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FavorRepository extends JpaRepository<Favor, Long> {
    Favor findByServiceName(String username);

}
