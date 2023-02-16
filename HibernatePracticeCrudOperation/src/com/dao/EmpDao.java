package com.dao;

import org.hibernate.cfg.Configuration;

public class EmpDao {
	public static Configuration getEmpConfig() {
		Configuration conf = new Configuration();
		conf.configure("employee.cfg.xml");
		return conf;
	}

}
