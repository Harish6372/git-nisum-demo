package com.nisum.macys.nisumgitdemo.Controller.copy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductController {
	Logger logger=LoggerFactory.getLogger(this.getClass());
	public String getProduct()
	{
		logger.debug("entered into"+this.getClass());
		return "single product";
	}

}
