package com.bruno.javacore.ZZIjdbc.test;

import com.bruno.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.bruno.javacore.ZZIjdbc.dominio.Producer;
import com.bruno.javacore.ZZIjdbc.repository.ProducerRepository;
import com.bruno.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2

public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        Producer producer = Producer.builder().name("NHK").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);
        //ProducerService.update(producerToUpdate);
        //List<Producer> producers = ProducerService.findAll();
        // List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'",producers);
        ProducerService.showProducerMetaData();
    }
}
