package com.mine;

import com.mine.model.QryDtl;
import com.mine.service.QryDtlDao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    QryDtlDao qry;

    public void run(String... args) throws Exception {
        logger.info("开始打印...");
        List<QryDtl> qryDtls = qry.getAllQryDtls();
        for (QryDtl x: qryDtls) {
            System.out.println(x);
        }
    }
}