package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.repositories;


import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryExamen extends MongoRepository<Restaurante, Long> {
}
