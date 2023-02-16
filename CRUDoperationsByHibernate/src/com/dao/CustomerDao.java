package com.dao;

import org.hibernate.cfg.Configuration;

public class CustomerDao {
	
	public static Configuration getConfiguration() {
		Configuration conf = new Configuration();
		conf.configure();
		return conf;
	}
}
