package com.webservicerp.demo.repo;

import com.webservicerp.demo.model.dto.bcBalanceCorrectionDTO;
import com.webservicerp.demo.model.entity.bcBalanceCorrectionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataAccess {
    private static final Logger log = LoggerFactory.getLogger(DataAccess.class);


    JdbcTemplate jdbcTemplate;

    public DataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String testMethod(bcBalanceCorrectionDTO bcBalanceCorrectionParameters) {
        log.info("EXECUTING STORED PROCEDURE spBC_Balance_correction");
        bcBalanceCorrectionResponse response = new bcBalanceCorrectionResponse();
        jdbcTemplate.execute("EXEC spBC_Balance_correction @amount = "+ bcBalanceCorrectionParameters.getAmount()
                                                           +", @user_id = " + bcBalanceCorrectionParameters.getUsersId());
        response.setBPRRN(13);
        return response.toString();
    }
}