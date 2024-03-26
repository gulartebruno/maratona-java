package com.bruno.javacore.ZZIjdbc.test;

import com.bruno.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.bruno.javacore.ZZIjdbc.dominio.Producer;
import com.bruno.javacore.ZZIjdbc.repository.ProducerRepository;
import com.bruno.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhosue").build();
//        ProducerService.save(producer);
//        ProducerService.delete(5);
//        ProducerService.delete(6);
//        ProducerService.delete(7);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findByName("Mad");
//        List<Producer> producers = ProducerService.findAll();
//        log.info("Producers found '{}'", producers);

//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();

//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        log.info("Producers found '{}'", producers);

//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 Pictures");
//        log.info("Producers found '{}'", producers);

//        ProducerService.findByNameAndDelete("A-1 Pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bo");
//        log.info("Producers found '{}'", producers);

//        ProducerService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("M");
        log.info("Producers found '{}'", producers);

    }


}
