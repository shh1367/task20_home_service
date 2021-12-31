package ir.maktab.hw20.service;

import ir.maktab.hw20.entity.Favor;
import ir.maktab.hw20.repository.FavorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FavorService {
    private final FavorRepository favorRepository;

    public void save(Favor favor) {
        favorRepository.save(favor);
    }

    public Favor loadByServiceName(String username){
        return favorRepository.findByServiceName(username);
    }
}
