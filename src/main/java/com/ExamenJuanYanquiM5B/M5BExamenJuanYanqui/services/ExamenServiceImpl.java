package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.services;

import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models.Periodo;
import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.repositories.RepositoryExamen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ExamenServiceImpl extends GenericServiceImpl<Periodo, Long> implements ExamenService {

    @Autowired
    RepositoryExamen repositoryExamen;
    @Override
    public CrudRepository<Periodo, Long> getDao() {
        return  repositoryExamen;
    }
}
