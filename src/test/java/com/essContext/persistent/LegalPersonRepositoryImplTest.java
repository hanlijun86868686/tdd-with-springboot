package com.essContext.persistent;

import com.essContext.BaseTest;
import com.essContext.controller.request.LegalPersonRequest;
import com.essContext.domain.model.LegalPerson;
import com.essContext.domain.service.LegalPersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class LegalPersonRepositoryImplTest extends BaseTest {
    @Autowired
    LegalPersonService legalPersonService;

    @Test
    void should_return_services_success_when_register_given_legalPerson_info() throws Exception {
        LegalPersonRequest request = new LegalPersonRequest();
        request.setType("1");
        request.setCompanyCode("99999999999");
        request.setCompanyName("中国渔场");
        request.setName("中国渔场");
        request.setIdCode("2222222222222");
        request.setIdType("1");
        LegalPerson legalPerson = legalPersonService.register(request);
        System.out.println(legalPerson);
        assertTrue(legalPerson.getId().length()>0);
    }
}