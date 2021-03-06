package com.spnd;

import com.spnd.dao.ConverterInfoDao;
import com.spnd.dto.DBMapperDTO;
import com.spnd.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import sun.tools.jar.CommandLine;

@SpringBootApplication

public class ReportGeneratorApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;


	public static void main(String[] args) {
		SpringApplication.run(ReportGeneratorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


		/*ConverterInfoDao asas = context.getBean(ConverterInfoDao.class);
		asas.getResult();*/
		DBMapperDTO[] dBMapperDTOArr = (new FileUtils()).getJsonData();
		for(int i=0;i<dBMapperDTOArr.length;i++) {
			System.out.println(dBMapperDTOArr[i].getOraType());
		}
	}
}
