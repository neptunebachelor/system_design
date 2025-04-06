package com.jian.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jian.demo.repository.NewTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.jian.demo.entity.NewTable;


public interface NewTableRepository extends JpaRepository<NewTable, Integer> {
    // customer add new data to get generated id
    // take null as parameter to save a new record

}
