package com.spnd.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spnd.dto.DBMapperDTO;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public DBMapperDTO[] getJsonData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DBMapperDTO[] dBMapperDTOArr = objectMapper.readValue(new File(getClass().getClassLoader()
                .getResource("oraclemysqlmapper.json").getFile()), DBMapperDTO[].class);
        return dBMapperDTOArr;
    }
}
