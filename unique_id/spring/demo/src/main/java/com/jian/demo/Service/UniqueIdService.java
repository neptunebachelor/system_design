package com.jian.demo.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.jian.demo.entity.NewTable;
import com.jian.demo.repository.NewTableRepository;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
@Transactional 
public class UniqueIdService {
    @Autowired
    private NewTableRepository repository;
    @Autowired
    private ObjectMapper objectMapper;

    public String generateUniqueId() {
        NewTable entry = new NewTable();
        entry.setNote("generate unique id");

        NewTable saved = repository.save(entry);
        getAllEntries(); // Call the method to print all entries

        return saved.getId().toString();
    }

    public List<NewTable> getAllEntries() {
        List<NewTable> list = repository.findAll();
        try {
            String json = objectMapper.writeValueAsString(list);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}