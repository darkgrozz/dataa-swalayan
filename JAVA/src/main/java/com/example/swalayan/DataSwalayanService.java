package com.example.swalayan.;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DataSwalayanService {

    @Autowired
    private DataSwalayanRepository repo;

    public List<dataswalayan> listAll() {
        return repo.findAll();
    }

    public void save(dataswalayan dataswalayan) {
        repo.save(dataswalayan);
    }

    public dataswalayan get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
