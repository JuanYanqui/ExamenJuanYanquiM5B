package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.repositories;


import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models.Periodo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryExamen extends MongoRepository<Periodo, Long> {
}
